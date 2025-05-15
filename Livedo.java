class shape{
  int length,breadth;
  void setlength(int l,int b){
    length=l;
    breadth=b;

  }
  void area(){
    System.out.println("Area is :"+(length*breadth));
  }
}

class reactangle extends shape{

}
class square extends shape{
  void setlength(int l){
    length=l;
    breadth=l;
  }
}
public class Livedo {
  public static void main(String[] args) {
      square s=new square();
      reactangle r=new reactangle();
      s.setlength(2);
      s.area();
      r.setlength(2, 3);
      r.area();
  }
}
