public class ContaCorrente {
    int numeroConta;
    double limiteAdicional, limiteDisponivel, saldo;
    Cliente cliente;
    /* Construtor responsavel por incrementar o cliente
     na conta corrente. */
    public ContaCorrente(int numeroConta, Cliente cliente) {
        this.numeroConta = numeroConta;
        this.cliente = cliente;
        this.saldo = 0;  //saldo inicial.
        this.limiteAdicional = cliente.salarioMensal * 0.2;  // 20% do salário mensal como limite adicional
        this.limiteDisponivel = this.limiteAdicional;  // O limite disponível começa igual ao limite adicional
    }

    /* Metodo que fara toda a lógica para que o usuario possa depositar
     um certo valor, sendo descontado caso ele use o limite
     e o restante creditado na conta. */

    public void depositar(double valor) {
        if (valor <= 0) { //Como o usuario não depositou nada, aparece esse erro.
            System.out.println("Valor de depósito inválido.");
        }
        double limiteUsado = limiteAdicional - limiteDisponivel; //Logica para descontar no limite que o usuario usou.
        /* Logica, do limite usado e o pagamento que será realizado pelo usuário
         Exemplo: se ele usou 100 reais, ele devera pagar 102 reais, ja que serão acrescidos
         2% de juros. */

        if (limiteUsado > 0) {
            double valorParaReporComJuros = limiteUsado * 1.02;
            if (valor >= valorParaReporComJuros) {
                limiteDisponivel = limiteAdicional;
                valor -= valorParaReporComJuros; //Sera descontado o valor do deposito, primeiro no limite

                /* Depois da divida ser quitada, o valor sera incrementado diretamente no saldo do cliente
                    (caso ele tenha depositado mais que sua divida)
                     Exemplo: ele fez o uso de 10 reais no limite, ele depositou 20, então os 10 sobrando, irá diretamente
                     para o saldo dele.
                     ele = cliente, caso fique muito repetitivo (tem nada haver com genero não). */

                saldo += valor;
            } else {
                /* Esse else, quer dizer caso o cliente fez um depósito, mas ele não foi o suficente
                        para quitar sua divida. */

                double limiteReposto = valor / 1.02;
                limiteDisponivel += limiteReposto;
                if (limiteDisponivel > limiteAdicional) {
                    limiteDisponivel = limiteAdicional;
                }
            }
        } else {  //como o cliente não usou do limite, o dinheiro ira diretamente para sua conta.
            saldo += valor;
        }
    }
    /* Metodo responsavel pela retirada de dinheiro, feita pelo usuario
         onde ele vera se tem saldo o suficiente na conta dele para realizar tal tarefa. */
    public String saque(double valor) {
        if (valor <= 0) { //caso o usuario não saque nada, vai dar erro.
            return "Operação de saque inválida!";
        }
        double totalDisponivel = saldo + limiteDisponivel; //Verfificação, caso haja o valor do saque disponivel.
        if (valor > totalDisponivel) {
            return "Saldo Indisponível.";
        }
        if (saldo >= valor) { //verificação caso haja saldo suficiente para usar
            saldo -= valor;
            return "Transação Efetuada com Sucesso.";
            /* caso não haja saldo, descontara do que tem no saldo e tambem do limite disponivel.*/
        } else {
            double resto = valor - saldo;
            saldo = 0;
            limiteDisponivel -= resto;//Caso valor digitado, tenha ultrapassado o saldo, descontara diretamente do limite.
            return "Transação Efetuada com Sucesso.";
        }
    }
    public String consultarSaldo(){
        if (saldo < 1.0) {
            System.out.println( "Saldo insuficiente para cobrança da taxa de consulta.");
        }
        saldo -= 1.0; //Sera realizado a cobrança pela consulta.

        /*Essa eu pedi ajuda para IA professor, pois fiquei meio confuso nessa de passar
         valores double, e os prints, sendo que o metodo é uma string, nesse caso, não seria melhor um 'void'??*/

        return "Saldo Disponível: R$ " + String.format("%.2f", saldo) +
                "\nLimite Total: R$ " + String.format("%.2f", limiteAdicional) +
                "\nLimite Disponível: R$ " + String.format("%.2f", limiteDisponivel);
    }
}