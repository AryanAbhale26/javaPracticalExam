class printer{
  <T >void print( T[]arr){
for(T i:arr)
    {System.out.println(i);}
  }
}

public class boundedparams {
  public static void main(String[] args) {
      printer p=new printer();
      Integer arr[]={1,2,3,4};
      p.print(arr);
  }
}
