
import java.util.*;
import java.util.stream.Collectors;


class arraylist{
  public static void main(String[] args) {
      List<Integer>l=Arrays.asList(1,2,3,4,5,6);
      List<String>ll=Arrays.asList("Aryan","Ayush","prem","yash","aaron");
      l.stream().forEach(n->System.out.println(n));
      ll.stream().filter(n->n.startsWith("A")).map(n->n.toUpperCase()).forEach(n->System.out.println(n));
      int v=l.stream().reduce(0,(a,b)->(a+b));
      System.out.println("sum="+v);
      ll.stream().map(n->n.toLowerCase()).collect(Collectors.toList());
  }
}