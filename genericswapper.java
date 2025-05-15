// class swapper{
//   public static <T> void swap(T[]arr,int i ,int j){
//     T temp=arr[i];
//     arr[i]=arr[j];
//     arr[j]=temp;
//   }
// }

// public class genericswapper {
//   public static void main(String[] args) {
//       swapper s=new swapper();
//       Integer a[]={1,2,3};
//       s.swap(a, 0, 2);
//       for(int i:a){
//         System.out.println(i);
//       }
//   }
// }

class swapper{
public static <T> void swap(T[]arr,int i,int j){

T temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
  }
}

class genericswapper{
 public static void main(String[] args) {
     swapper s=new swapper();
     Integer arr[]={1,2,3};
     s.swap(arr,1 , 2);
     for(int i:arr){
      System.out.println(i);
     }
 }
}