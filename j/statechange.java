
// import java.util.*;


// // Define the Observer interface
// interface Observer {
//   void update(String state);
// }

// // Define the Subject class that holds the List of observers
// class Subject {
//   // List<Observer> holds all the observers that are notified on state change
//   List<Observer> observers = new ArrayList<>();
  
//   public void attach(Observer observer) {
//       observers.add(observer);
//   }

//   public void notifyObservers() {
//       for (Observer observer : observers) {
//           observer.update("New state!");
//       }
//   }
// }

// // A concrete observer implementing the Observer interface
// class ConcreteObserver implements Observer {
//   public void update(String state) {
//       System.out.println("State updated to: " + state);
//   }
// }

// // Example usage
// public class changestate {
//   public static void main(String[] args) {
//       Subject subject = new Subject();
//       Observer observer1 = new ConcreteObserver();
//       Observer observer2 = new ConcreteObserver();

//       subject.attach(observer1);  // Attach observers to the subject
//       subject.attach(observer2);

//       subject.notifyObservers();  // Notify all observers of a state change
//   }
// }
import java.util.*;
interface Observer{
  void update(String state);
}
class Subject{
  List <Observer> observers= new ArrayList<>();

  public void attach(Observer observer)
  {
    observers.add(observer);
  }
  public void notifyObserver(){
    for(Observer observer:observers)
    {
      System.out.print("New state");
    }
  }
}
class concrete implements Observer{
  public void update(String state){
    System.out.println("updated to"+state);
  }
}
class statechange{
  public static void main(String[] args) {
      Subject s1=new Subject();
    Observer o1=new concrete();
      Observer o2=new concrete();
      s1.attach(o1);
      s1.attach(o2);
      s1.notifyObserver();
  }
}