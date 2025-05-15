import java.lang.reflect.*;
class student{
  public String name;
  public int age;
  public void study(){};

}
public class reflect {
  public static void main(String[] args) {
      Class c=student.class;
      System.out.println(c.getName());
     for(Field f:c.getFields()){
       System.out.println(f.getName());
     }
       for(Method f:c.getMethods()){
       System.out.println(f.getName());
     }
  }
}
