public class Cliente {
    String nome;
    String cpf;
    double salarioMensal;
    /* Não usei 'private', pois ainda não fixei bem na minha cabeça, proxima aula
     vou pedir a sua ajuda para explicar melhor. */
    public Cliente(String nome, String cpf, double salarioMensal) {
        this.nome = nome;
        this.cpf = cpf;
        this.salarioMensal = salarioMensal;
    }
    /*
    * Utilizei um novo metodo para exibir as informações do cliente
    * isso aumentará o código, mas pensando me escalabilidade, sera melhor
    * para manutenções futuras.
    * */
    public void mostrarDetalhes() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Salário: R$ " + salarioMensal);
    }
    /*
    * Basicamente esse construtor vai receber os dados do cliente, sendo eles o nome
    * CPF e o salario.
    * */
}
