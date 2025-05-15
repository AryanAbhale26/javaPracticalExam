import java.util.ArrayList;
import java.util.List;

interface OrderNotification {
    void sendOrderNotification(Order order);
}

class EmailService implements OrderNotification {
    @Override
    public void sendOrderNotification(Order order) {
        System.out.println("Sending order to email...");
        System.out.println("Customer: " + order.customerName);
        System.out.println("Items: " + String.join(", ", order.items));
        System.out.println("Total Price: " + order.totalPrice); 
    }
}

class Order {
    String customerName;
    List<String> items;
    double totalPrice;

    public Order(String customerName, List<String> items, double totalPrice) {
        this.customerName = customerName;
        this.items = items;
        this.totalPrice = totalPrice;
    }
}

class OrderView {
    public void displayOrder(Order order) {
        System.out.println("Customer orderview: " + order.customerName);
        System.out.println("Items: " + String.join(", ", order.items));
        System.out.println("Total Price: " + order.totalPrice);  
    }
}

class FoodDeliveryService {
    List<Order> orders;
    OrderView orderView;
    OrderNotification orderNotification;

    public FoodDeliveryService(OrderView orderView, OrderNotification orderNotification) {
        this.orders = new ArrayList<>();
        this.orderView = orderView;
        this.orderNotification = orderNotification;
    }

    public void addOrder(Order order) {
        orders.add(order);
        orderNotification.sendOrderNotification(order);
    }

    public void viewOrders() {
        for (Order order : orders) {
            orderView.displayOrder(order);
        }
    }
}

public class soliddeliv {
    public static void main(String[] args) {
        OrderView orderView = new OrderView();
        OrderNotification emailService = new EmailService();
        FoodDeliveryService service = new FoodDeliveryService(orderView, emailService);
        Order order1 = new Order("Alice", List.of("Burger", "Fries"), 300);
        service.addOrder(order1);
        service.viewOrders();
    }
}

// SRP: Each class has only one responsibility.
// OCP: New notification services can be added without modifying existing classes.
// DIP: FoodDeliveryService depends on the OrderNotification abstraction, not concrete implementations.