// interface messageService{
//   void sendMessage(String msg);
// }

// class EmailService implements messageService{
//   public void sendMessage(String msg){
//     System.out.println("Sending email:"+msg);
//   }
// }
// class studetService{
//   messageService ms;

//     public studetService(messageService service) {
//       ms=service;
//     }
//     void notify(String msg){
//       ms.sendMessage(msg);
//     }
// }
// class dip{
//   public static void main(String[] args) {
//       messageService m1=new EmailService();
//       studetService s1=new studetService(m1);
//       s1.notify("your ghome is due");
//   }
// }


interface messageService{
  void sendMessage(String msg);
}

class emailService implements messageService{
  public void sendMessage(String msg){
    System.out.println("sending msg:"+msg);
  }
}
class studentService{
  messageService ser;
  public studentService(messageService service){
    ser=service;
    
  }
  public void notify(String msg){
    ser.sendMessage(msg);
  }
}

class couplingbyInjection{
  public static void main(String[] args) {
 messageService m1=new emailService();
 studentService s1=new studentService(m1);
 s1.notify("complete hw");     
  }
}