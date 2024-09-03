import java.util.Scanner;

public class Client {
  private String name;
  private String cpf;
  private String smartphone;
  private int birthYear;
  private char gender = 'p';

  // constructor
  public Client(String name, String cpf, String smartphone, int birthYear){
    this.name = name;
    this.cpf = cpf;
    this.smartphone = smartphone;
    this.birthYear = birthYear;
  }
  
  // setters
  public void setSmartphone(String smartphone){
   this.smartphone = smartphone;
  }

  //getters
  public String getName() {
    return name;
  }

  public String getCpf() {
    return cpf;
  }

  public String getSmartphone(){
    return smartphone;
  }

  public int getBirthYear(){
    return birthYear;
  }

  public char getGender(){
    return gender;
  }

  // methods
  public void genderFilter() {
    boolean condition = true;
    Scanner scan = new Scanner(System.in);
    System.out.println("""
        \n
        Digite 'M' para Masculino;
        Digite 'F' para Feminino;
        Digite aqui: 
        """);
        
        // check gender
    while (condition) {
      char newGender = scan.nextLine().charAt(0);
      System.out.println(newGender);
      if (newGender != 'M' && newGender != 'F'){
        System.out.println("""
            \nO genero precisa ser: 'M' ou 'F'!
            Digite aqui: 
            """);
      }else{
        condition = false;
        newGender = gender;
        System.out.println("Seu genero agora esta como: " + newGender + "\n");
      }
    }
  }
  
  public void birthFilter() {
    boolean condition = false;
    Scanner scan = new Scanner(System.in);

    while (!condition) {
      System.out.println("""
      Voce precisa ter no minimo 18 anos!
      Digite o ano que voce nasceu: 
      """);
      int anoNascimento = scan.nextInt();

      // check age if is 18
      if (2024 - anoNascimento < 18) {
        System.out.println("");

      // if is not 18 try again
      }else{
        birthYear = anoNascimento;
        System.out.println("O ano que voce nasceu agora esta como: " + birthYear);
        condition = true;
      }
    }
  }

}