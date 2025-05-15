interface Strategy{
  void sortt(int arr[]);
}

class bubbleSort implements Strategy{
  public void sortt(int arr[]){
    for (int i=0;i<arr.length-1;i++)
    {
      for(int j=0;j<arr.length-i-1;j++)
      {
        if(arr[j]<arr[j+1]){
          int t=arr[j];
          arr[j]=arr[j+1];
          arr[j+1]=t;
        }
      }
    }
  }
}
class sorter{
  Strategy stra;

    public sorter(Strategy stra) {
      this.stra=stra;
    }
    void sortt(int arr[]){
      stra.sortt(arr);
for(int num:arr){
  System.out.print(num+",");
  // System.out.println();
}

    }
  
}

public class Sort {
  public static void main(String[] args) {
    int arr[]={1,2,3,4,5,6};
    sorter s=new sorter(new bubbleSort());
   s.sortt(arr);
      
  }
}
