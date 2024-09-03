import java.util.Scanner;

public class Main{

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Client client = cadastrar();
    Bank bank = new Bank(client);
    
    boolean condition = true;
    while (condition){
      System.out.println("""
        Selecione o modo que deseja:
        [ 2 ] Sacar
        [ 3 ] Depositar
        [ 4 ] Verificar Saldo
        [ 5 ] Alterar informacoes
        [ 6 ] Mostrar dados
        [ 7 ] Emitir fatura
        """);
      
      int mode = scan.nextInt();

      // set mode
      if (mode == 2) sacar(bank);
      if (mode == 3) depositar(bank);
      if (mode == 4) verificarSaldo(bank);
      if (mode == 5) alterarInformacoes(client); // v
      if (mode == 6) mostrarDados(client);
      if (mode == 7) emitirFatura(bank);
      if (mode == 0) {
        System.out.println("Programa finalizado!");
        condition = false;
      }
    }
  }

  public static Client cadastrar(){
    Scanner scan = new Scanner(System.in);
    
    // settando meus atributos do cliente
    System.out.println("Digite seu nome: ");
    String nome = scan.nextLine();
    
    System.out.println("Digite seu cpf: ");
    String cpf = scan.nextLine();

    System.out.println("Digite seu telefone: ");
    String celular = scan.nextLine();

    System.out.println("Digite seu ano de nascimento: ");
    int anoNascimento = scan.nextInt();
    
    Client person = new Client(nome, cpf, celular, anoNascimento);
    person.genderFilter();
    return person;
  }

  public static void sacar(Bank bank) {
    boolean condition = true;
    while(condition){
      Scanner scan = new Scanner(System.in);
      System.out.println("Digite o valor que deseja sacar: ");
      double sacar = scan.nextDouble();
      System.out.println("""
          Selecione uma metodo:
          [ 1 ] Sacar saldo da conta
          [ 2 ] Sacar do limite do cartao
          [ 0 ] Sair
          """);
      int mode = scan.nextInt();
      if (mode == 1){
        bank.buyOnDebt(sacar);
      }
      if (mode == 2){
        bank.buyOnCredit(sacar);
      }
      if (mode == 0){
        condition = false;
      }
    }
  }
  public static void depositar(Bank bank) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Digite o valor que deseja depositar: ");
    double valor = scan.nextDouble();
    bank.setAccountBalance(valor);
  }

  public static void verificarSaldo(Bank bank) {
    System.out.println("O saldo da sua conta: " + bank.getAccountBalance());
  }
  public static void alterarInformacoes(Client client) {
    boolean condition = true;
    Scanner scan = new Scanner(System.in);
    while(condition){
      System.out.println("""
          Selecione um modo
          [ 1 ] Alterar telefone
          [ 2 ] Alterar ano de nascimento
          [ 3 ] Alterar genero
          [ 0 ] sair
          """);
      int mode = scan.nextInt();
      if( mode == 1 ){

        // muda numero de telefone
        System.out.println("Digite seu novo numero de telefone: ");
        String telefone = scan.nextLine();
        client.setSmartphone(telefone);
      }

      if( mode == 2 ) client.birthFilter();
      if( mode == 3 ) client.genderFilter();
      if( mode == 0 ) condition = false;
    }
    
  }
  public static void mostrarDados(Client client) {
    System.out.println("Seus dados!!! \n");
    System.out.println("Nome: " + client.getName());
    System.out.println("CPF: " + client.getCpf());
    System.out.println("Telefoe: " + client.getSmartphone());
    System.out.println("Ano de Nascimento: " + client.getBirthYear());
    System.out.println("Genero: " + client.getGender());
  }

  public static void emitirFatura(Bank bank){
    System.out.println("A fatura do seu cartao de credito: " + bank.getCreditCard() );
    System.out.println("Seu limite do cartao de credito: " + bank.getCreditCardLimit());
    System.out.println("O saldo da sua conta atual: " + bank.getAccountBalance());
  }
  
}