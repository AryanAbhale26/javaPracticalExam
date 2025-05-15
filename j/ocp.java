abstract  class discount{
   abstract int discount(int amount);
}

class stuDisc extends discount{
  public int discount(int amount){
    return amount-20;
  }
}
public class ocp {
  public static void main(String[] args) {
      stuDisc s1=new stuDisc();
      int a=s1.discount(200);
      System.out.println(a);
  }
}
