
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class student{
  public String name;
  public int age;
  public void study(){};

}
public class reflect3 {
  public static void main(String[] args) {
    try {
    Class c= Class.forName("student");
    for(Field f:c.getFields()){
      System.out.println(f.getName());
    }
  System.out.println("Methods:");
        for (Method m : c.getDeclaredMethods()) {
            System.out.println(m.getName());
        }
        
    } catch (Exception e) {
    }
      
  }
}
