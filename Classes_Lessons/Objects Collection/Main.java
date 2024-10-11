import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

// ## Classes que precisam ter no programa (mas podem criar mais):

// **Não esqueça de associar corretamente as classes para que se comuniquem entre elas.**
// - Aluno
// - Professor
// - Disciplina 

// ## funcoes main

// 1. Matricular Alunos
// 2. Listar Disciplinas
// 3. Listar Alunos (por disciplina)
// 4. Pesquisar Disciplina (por nome ou por código)
// 5. Pesquisar Aluno (por nome ou matrícula)
// 6. Alterar informações do estudante
// 0. Sair



  public static void main(String[] args) {
    ArrayList<String> teacherSkills = new ArrayList<>();
    Collections.addAll(teacherSkills, "POO", "algoritmic", "java");
    Teacher teacher = new Teacher(01, "Marina", teacherSkills);

    // add new subject
    ArrayList<Subject> subjectList = new ArrayList<>();
    Subject poo = new Subject(02, "POO", teacher, 120);

    boolean condition = true;
    Scanner scan = new Scanner(System.in);
    while (condition){
      System.out.println("""
        Chose mode:
        [ 1 ] Enroll Students
        [ 2 ] List subjects
        [ 3 ] List students
        [ 4 ] Search subjects
        [ 5 ] Search student
        [ 6 ] Change student informations
        [ 0 ] Exit

        Type here: 
        """);
      int mode = scan.nextInt();
      if (mode == 1) {
        Student s1 = enrollStudent(scan);
        //com a disc criada
        poo.addStudent(s1);
        
      }
      if (mode == 2){}
      if (mode == 3){}
      if (mode == 4){}
      if (mode == 5){}
      if (mode == 6){}
      if (mode == 0){
        condition = false;
        System.out.println("\nSee you, bye bye!");
      }

    }
    scan.close();
  }
  
  public static Student enrollStudent(Scanner scan){
    
    System.out.println("Type your name: ");
    String name = scan.nextLine();
    scan.next();
    
    System.out.println("Type your birth year: ");
    int year = scan.nextInt();
    
    System.out.println("Type your CPF: ");
    scan.next();

    String cpf = scan.nextLine();
    
    System.out.println("Type your telephone number: ");
    String phone = scan.nextLine();
    
    Student s1 = new Student(name, year, cpf, phone);
    s1.genderFilter();
    
    return s1;
  }
}
