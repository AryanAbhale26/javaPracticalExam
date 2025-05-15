
import java.util.LinkedHashMap;

public class linkedhash {
  public static void main(String[] args) {
      LinkedHashMap<String,String> ll=new LinkedHashMap<>();
      ll.put("10pm", "Loged in");
      ll.put("11pm", "Yt");
      ll.put("12pm", "Loged out");

      for(String i:ll.keySet()){
        System.out.println("at "+i+":"+ll.get(i));
      }

  }
}
