interface fact{
  void make();
  

}
class chair implements fact{
  public void make(){
    System.out.println("Chair made");

  }
}
class table implements fact{
  public void make(){
    System.out.println("table made");

  }
}
class sofa implements fact{
  public void make(){
    System.out.println("sofa made");

  }
}
class create{
  public fact create(String s){
    if(s.equalsIgnoreCase("chair"))return  new chair();
return null;
  }
}

public class factory {
  public static void main(String[] args) {
    create c=new create();
    fact f=c.create("chair");
    f.make();
  }
}
