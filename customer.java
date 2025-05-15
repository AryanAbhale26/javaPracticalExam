import java.util.*;
import java.util.stream.Collectors;

class Item {
    String name;
    double price;
    String category;  

    public Item(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public String toString() {
        return name + " (" + category + "): " + price;
    }
}

class Order {
    List<Item> items;

    public Order(List<Item> items) {
        this.items = items;
    }

    public List<Item> getItems() {
        return items;
    }
}

public class customer {
    public static void main(String[] args) {
        List<Order> orders = List.of(
            new Order(List.of(
                new Item("Laptop", 70000, "ELECTRONICS"),
                new Item("T-Shirt", 800, "CLOTHING"),
                new Item("Bananas", 100, "GROCERIES")
            )),
            new Order(List.of(
                new Item("Headphones", 1500, "ELECTRONICS"),
                new Item("Novel", 400, "BOOKS"),
                new Item("Milk", 60, "GROCERIES")
            )),
            new Order(List.of(
                new Item("Jeans", 1200, "CLOTHING"),
                new Item("Monitor", 12000, "ELECTRONICS"),
                new Item("Rice", 300, "GROCERIES")
            ))
        );

        Map<String, Double> totalSalesByCategory = orders.stream()
            .flatMap(order -> order.getItems().stream())
            .collect(Collectors.groupingBy(
                Item::getCategory,
                Collectors.summingDouble(Item::getPrice)
            ));

        System.out.println("Total Sales by Category");
        totalSalesByCategory.forEach((category, total) -> {
            System.out.println(category + ": " + total);
        });
    }
}
