
import java.util.HashMap;

public class hashmap {
  public static void main(String[] args) {
     HashMap <Integer,String> m=new HashMap<>(); 
     m.put(1,"aryan");
     m.put(2,"adi");
     m.put(3,"gau");
     m.put(4,"john");

     for(int i:m.keySet()){
      System.out.println("roll:"+i+"name:"+m.get(i));
     }
  }
}
