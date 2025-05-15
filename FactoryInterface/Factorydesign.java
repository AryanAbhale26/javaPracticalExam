class Factorydesign
{
  interface  createS{
void  draw();
  }
  
  static class Circle implements createS{
    public  void draw(){
      System.out.println("Circle is been made");
    }
  }
  static class square implements createS{
    public  void draw(){
      System.out.println("square is been made");
    }
  }
  static class getShape {
    public  createS create(String type){
      if(type.equalsIgnoreCase("circle"))return new Circle();
      if(type.equalsIgnoreCase("square"))return new square();
      return null;
    }
  }

public static void main(String args[]){
  getShape s=new getShape();
   createS shape =s.create("circle");
   shape.draw(); 
}
}



















class Main{
  interface createShape{
    void draw();
  }
  static class circle implements createShape{
    public void draw(){
      System.out.println("Circle is been created");
    }
  }
  static class square implements createShape{
    public void draw(){
      System.out.println("square is been created");
    }
  }
  static class getshape{
    public createShape create(String type)
    {
      if(type.equalsIgnoreCase("circle"))return new circle();
      if(type.equalsIgnoreCase("square"))return new square();
      return null;
    }
  }

  public static void main(String args[]){
    getshape s=new getshape();
    createShape shape=s.create("circle");
    shape.draw();
  }
}