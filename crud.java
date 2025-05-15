import java.util.ArrayList;
import java.util.List;

class student{
  String name;
  int id;

    public student(int id,String name) {
      this.name=name;
      this.id=id;
    }
  
}

public class crud {
  public static void main(String[] args) {
    List<student> students=new ArrayList<>();
      students.add(new student(1, "Aryan"));
      students.add(new student(2, "Arya"));

      for(student s:students)
      {
        System.out.println(s.name);
      }
      for(student s:students)
      {
        if(s.id==1){
          s.name="abo";
        }
      }
      
      for(student s:students)
      {
        System.out.println(s.name);
      }
      students.removeIf(s->s.id==1);
      for(student s:students)
      {
        System.out.println(s.name);
      }
      
  }
  
}
