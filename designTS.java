// import java.util.Scanner;

// interface Furniture {
//     void create();
// }

// class Chair implements Furniture {
//     public void create() {
//         System.out.println("Chair created.");
//     }
// }

// class Table implements Furniture {
//     public void create() {
//         System.out.println("Table created.");
//     }
// }

// class Sofa implements Furniture {
//     public void create() {
//         System.out.println("Sofa created.");
//     }
// }

// class FurnitureFactory {
//     public Furniture getFurniture(String type) {
//         if (type.equalsIgnoreCase("chair")) {
//             return new Chair();
//         } else if (type.equalsIgnoreCase("table")) {
//             return new Table();
//         } else if (type.equalsIgnoreCase("sofa")) {
//             return new Sofa();
//         }
//         return null;
//     }
// }

// public class designTS {
//     public static void main(String[] args) {
//         FurnitureFactory factory = new FurnitureFactory();
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter furniture type (Chair/Table/Sofa): ");
//         String input = sc.nextLine();

//         Furniture furniture = factory.getFurniture(input);
//         if (furniture != null) {
//             furniture.create();
//         } else {
//             System.out.println("Invalid furniture type.");
//         }

//         sc.close();
//     }
// }


// ========== Observer Design Pattern (commented) ==========


import java.util.*;

interface Observer {
    void update(int price);
}

class StockPriceTracker {
    private List<Observer> observers = new ArrayList<>();
    private int stockPrice;

    public void addObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void setPrice(int price) {
        stockPrice = price;
        notifyAllObservers();
    }

    private void notifyAllObservers() {
        for (Observer o : observers) {
            o.update(stockPrice);
        }
    }
}

class PriceAlert implements Observer {
    public void update(int price) {
        System.out.println("PriceAlert: Stock price changed to " + price);
    }
}

class DisplayBoard implements Observer {
    public void update(int price) {
        System.out.println("DisplayBoard: New stock price is " + price);
    }
}

public class designTS {
    public static void main(String[] args) {
        StockPriceTracker tracker = new StockPriceTracker();
        Observer alert = new PriceAlert();
        Observer board = new DisplayBoard();
        
        tracker.addObserver(alert);
        tracker.addObserver(board);
        
        tracker.setPrice(100);
        tracker.setPrice(150);
    }
}


