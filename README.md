# Trabalho de Faculdade - Orientação a Objetos 
    O trabalho era construir um banco simples, utilizando Java e os conceitos de Orientação a Objetos.

 ### Segue abaixo os comandos do exercicio

 1. Desenvolva uma aplicação que atenda os seguintes requisitos:
      a. Uma Conta Corrente possui um número, saldo e limite adicional.
      b. Uma conta deve pertencer a um cliente que deve ser identificado pelo nome e CPF.
      c. No momento da abertura da conta, o saldo é zerado e automaticamente o limite adicional é
      configurado para 20% do salário mensal do correntista.
      d. A classe conta deve disponibilizar métodos para depósito e saque, ambos recebendo um valor
      como parâmetro.
    
        - O método de saque retornará uma String informando se o saque é permitido (“Transação
        Efetuada com Sucesso.”) ou não (“Saldo Indisponível”), dependendo da disponibilidade de
        dinheiro na conta do cliente (observando-se o limite), devendo proceder com o débito do
        valor do saldo do cliente e/ou do limite.

        - O método de depósito deverá adicionar o valor ao saldo ou ao limite (caso este tenha sido
        utilizado). No caso da atualização do limite, é cobrada uma taxa de juros de 2% sobre o
        valor debitado do limite inicialmente configurado.

e. O método para a consulta do saldo deve retornar uma String informando o saldo disponível, o
limite total e o limite disponível. Cabe destacar que para cada consulta ao saldo é cobrada a
taxa de R$ 1,00 que deve ser debitado somente do saldo da conta do cliente. Caso o cliente não
tenha saldo para a operação, uma mensagem deve ser exibida informando a falha da operação.

3. Implemente uma classe aplicativo que crie um objeto do tipo Conta, considerando-se o seguinte:
 
        a. Criar um objeto do tipo cliente e “setar” o nome, CPF e salário.

        b. Criar um objeto Conta e “setar” os atributos número e correntista.
  
        c. Consultar o saldo da conta.
  
        d. Efetuar um depósito e exibir o saldo atual.
  
        e. Efetuar um saque (sem utilizar o limite) e exibir a mensagem de retorno do método
  
        f. Consultar o saldo da conta.
  
        g. Efetuar um saque utilizando o limite
  
        h. Consultar o saldo da conta.
  
        i. Efetuar um depósito
  
        j. Consultar o saldo
