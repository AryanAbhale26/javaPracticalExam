
import java.util.ArrayList;
import java.util.List;

public class parallelstream {
  public static void main(String[] args) {
      List<Integer> l=new ArrayList<>();
      for(int i=0;i<1000;i++){
        l.add(i);
      }
      long start=System.currentTimeMillis();
      long a=l.stream().mapToLong(n->n*2).sum();
      long end=System.currentTimeMillis();
System.out.println("start:"+start+","+a+" end:"+(end-start));

  }
}
