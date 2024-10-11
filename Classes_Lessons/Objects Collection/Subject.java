
import java.util.ArrayList;

public class Subject{
  private int id;
  private String name;
  private Teacher teacher;
  private int workload; 
  private ArrayList<Student> students = new ArrayList<>();

  public Subject(int id, String name, Teacher teacher, int workload){
    this.id = id;
    this.name = name;
    this.workload = workload;
    this.teacher = teacher;
  }
  // getters
  public int getId(){
    return id;
  }
  public String getName(){
    return name;
  }
  public int getWorkload(){
    return workload;
  }
  
  // setters
  

  // methods
  public void addStudent(Student student){
    students.add(student);
  }

}