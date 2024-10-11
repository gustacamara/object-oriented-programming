import java.util.Scanner;

public class Student{
  private String name;
  private int birthDateYear;
  private String cpf = null;
  private String cell = null;
  private char gender;

  public Student(String name, int bithDateYear, String cpf, String cell){
    this.name = name;
    this.birthDateYear = bithDateYear;
    this.cpf = cpf;
    this.cell = cell;
  }
  
  public Student(String name, int birthDateYear, char gender){
    this.name = name;
    this.birthDateYear = birthDateYear;
    this.gender = gender;
  }
  
  // getters
  public String getName(){
    return name;
  }
  public String getCell(){
    return cell;
  }
  public String getCpf(){
    return cpf;
  }
  public int getBirthDateYear(){
    return birthDateYear;
  }

  //setters
  public void setName(String name){
    this.name = name;
  }
  public void setCpf(String cpf){
    this.cpf = cpf;
  }
  
  //methods
  public void birthDateYearFilter() {
    boolean condition = true;
    Scanner scan = new Scanner(System.in);

    while (condition) {
      System.out.println("""
      You need to be 18 years old!
      Type year that you born: 
      """);
      int birthDateYear = scan.nextInt();

      // check age if is 18
      if (2024 - birthDateYear < 18) {
        System.out.println("");

      // if is not 18 try again
      }else{
        this.birthDateYear = birthDateYear;
        System.out.println("Year that you born is: " + birthDateYear);
        condition = false;
      }
    }
  }

  public void genderFilter() {
    boolean condition = true;
    Scanner scan = new Scanner(System.in);
    System.out.println("""
      \n
      Type 'M' for male;
      Type 'F' for female;
      Type right here: 
      """);
        
    // check gender
    while (condition) {
      char gender = scan.nextLine().charAt(0);
      System.out.println(gender);
      if (gender != 'M' && gender != 'F'){
        System.out.println("""
          \nYour gender need to be: 'M' ou 'F'!
          Type right here: 
          """);
      }else{
        condition = false;
        this.gender = gender;
        System.out.println("Your gender now is setted to: " + gender + "\n");
      }
    }
  }
}
