
import java.util.HashSet;
import java.util.Set;

public class hashset {
  public static void main(String[] args) {
      String arr[]={"Aryan","Aryan","onkar","yash","yash","Prajot"};
      Set<String> h=new HashSet<>();
      for(String i:arr){
        h.add(i);

      }
      for(String i:h){
        System.out.println(i);
      }
  }
}
