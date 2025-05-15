
import java.util.LinkedList;

public class linklist {
  public static void main(String[] args) {
      LinkedList<String> ll=new LinkedList<>();
      ll.add("Tere niana");
      ll.add("heeriye");
      ll.add("zinda");
      for(String s:ll){
        System.out.println(s);
      }
      ll.remove("zinda");
       for(String s:ll){
        System.out.println(s);
      }
  }
}
