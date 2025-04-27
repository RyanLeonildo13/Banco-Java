/*  Aluno: Ryan Leonildo Rodrigues da Silva
    Matricula: 202401188    */
public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Ryan Leonildo", "123.456.789-10", 3000);
        cliente1.mostrarDetalhes(); // O metodo concatenado com os detalhes do cliente será exibido para o usuário.
        ContaCorrente conta1 = new ContaCorrente(12345, cliente1); // Adicionando número da conta e cliente
        System.out.println("Consultar Saldo: ");
        conta1.consultarSaldo(); // Será realizada a consulta do saldo disponível da conta do cliente.
        System.out.println("Realizando um depósito de R$ 500,00: ");
        conta1.depositar(500); // Inicialmente o saldo estava zerado, agora está com 500 reais.
        conta1.consultarSaldo(); // Realizando uma nova consulta para verificar se o depósito foi realizado.
        System.out.println("Saque de R$ 300,00: ");
        System.out.println(conta1.saque(300)); // Realizando o saque de R$ 300,00.
        conta1.consultarSaldo(); // Como eu realizei um saque, mostrara que diminuiu o saldo.
        System.out.println("Realizando um saque de R$ 800,00: ");
        System.out.println(conta1.saque(800)); // O saque é maior que o saldo, então será usado o limite.
        conta1.consultarSaldo(); // Exibe o saldo após o saque utilizando o limite.
        System.out.println("Saque de R$ 5000,00: ");
        System.out.println(conta1.saque(5000)); // Como o valor do saque é extremamente alto, até para o limite, retornará um erro.
        conta1.consultarSaldo(); // Exibe o saldo após a tentativa de saque.
    }
}
