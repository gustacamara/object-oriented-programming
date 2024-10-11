import java.util.ArrayList;


public class Teacher {

  private int id;
  private String name;
  private ArrayList<String> skills;

  public Teacher(int id, String name, ArrayList<String> skills){
    this.id = id;
    this.name = name;
    this.skills = skills;
  }
}