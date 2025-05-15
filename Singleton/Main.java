public class Main{
  static class Singleton{
    public static Singleton s= new Singleton();
    private Singleton(){}
    public static Singleton getInstance(){
      return s;
    }
    public void show(){
      System.out.println("Hello from single");
  }
  }
  public static void Main(String args[]){
    Singleton s=Singleton.getInstance();
    Singleton s1=Singleton.getInstance();
    s1.show();
  }
}

