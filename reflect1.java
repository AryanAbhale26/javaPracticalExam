class student{
  public String name;
  public int age;
  public void study(){};

}
public class reflect1 {
  public static void main(String[] args) {
    try {
      Class s=Class.forName("student");
      Object m=  s.newInstance();
      System.out.println(m.getClass());
        
    } catch (Exception e) {
    }
      
  }
}
