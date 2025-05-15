
import java.util.LinkedList;
import java.util.Queue;

public class queue {
  public static void main(String[] args) {
      Queue<String> q=new LinkedList<>();
      q.add("1");
      q.add("2");
      q.add("3");
      q.add("4");
  for(String i:q){
    System.out.println(i);
  }
  q.poll();
  System.out.println("=============");
    for(String i:q){
    System.out.println(i);
  }

  }
}
