class Student{
  public Student(){
    System.out.println("Student obj is created");
  }
}
public class docreflection {
  public static void main(String[] args) {
      try {
        Class c=Class.forName("Student");
        Object o=c.newInstance();
          
      } catch (Exception e) {
        System.out.println(e);
      }
  }
}
