
import java.util.Arrays;
import java.util.List;

public class reduce {
  public static void main(String[] args) {
      List<Integer> n=Arrays.asList(10,20,30);
    int r=n.stream().reduce(0, (a,b)->a+b);
    System.out.println(r);
  }
}
