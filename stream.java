
import java.util.*;

// public class stream {
//   public static void main(String[] args) {
//       List<Integer>n=Arrays.asList(10,20,30,40);
//       n.stream().forEach(i->System.out.println(i));
//   }
// }

public class stream{
  public static void main(String[] args) {
      List<String>s=Arrays.asList("Aryan","aaron","onkar","aditya");
      s.stream().filter(n->n.startsWith("a"))
      .map(n->n.toUpperCase())
      .forEach(n->System.out.println(n));
  }
}