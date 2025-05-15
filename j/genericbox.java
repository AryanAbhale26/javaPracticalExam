class box<T>{
  T val;
 
  box(T val){
this.val=val;
  }
void show(){
  System.out.println("content:"+val);

}

}

public class genericbox {
  public static void main(String[] args) {
      box<String> b=new box("hellp");
      b.show();
      box<Integer> b2=new box(12);
      b2.show();

  }
}


