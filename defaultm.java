interface greet{
  default void hello(){
    System.out.println("Hello by default");
  }
}
class hindi implements greet{
  public void hello(){
    System.out.println("Kem cho mota bahi ");
  }
}
class eng implements greet{}

public class defaultm {
  public static void main(String[] args) {
      greet g1=new hindi();
      greet g2=new eng();

      g1.hello();
      g2.hello();
  }
  
}
