
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class collector {
  public static void main(String[] args) {
    List<String> s=Arrays.asList("aryan","adi","veer"); 
    List<String>l=s.stream().map(n->n.toUpperCase()).collect(Collectors.toList());
    System.out.println(l);
  }
}
