import java.lang.reflect.Field;
class student{
  private String name="Aryan";
}

public class privatereflection {
  public static void main(String[] args) {
try {
        student s=new student();
        Field f=s.getClass().getDeclaredField("name");
        f.setAccessible(true); 
    f.set(s,"arya");
    System.out.println(f.get(s));
} catch (Exception e) {
}
  }
}

