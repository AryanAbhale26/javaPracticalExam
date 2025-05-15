abstract class ser{
  int a,b;
   ser(int a,int b){
    this.a=a;
    this.b=b;
    System.out.println("Operators are "+a+","+b);
  }
  abstract void add();
}

class add extends  ser{
add(int a,int b){
  super(a, b);
  System.out.println("Created object");
}
public void add(){
  System.out.println("Additon is "+(a+b));
}
}


class acwc{
  public static void main(String[] args) {
add a=new add(1, 3);
a.add();  
  }
}