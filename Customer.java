import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Customer {

    public String name;
    private List<String> orders;

    public Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public List<String> getOrders() {
        return this.orders;
    }

    public void setOrders(Customer customer, List<String> newOrders) {
        this.orders = newOrders;
    }

    public void takeOrders(Customer customer) {
        List<String> orders = customer.getOrders();
        while (true) {
            Scanner myObj2 = new Scanner(System.in);
            System.out.println("What else would you like to have today? (Press enter to stop ordering)");
            String newOrder = myObj2.nextLine();
            if (newOrder.length() == 0) {
                break;
            }
            orders.add(newOrder);
            setOrders(customer, orders);
        }
        System.out.println("Your Order includes " + orders.size() + "Item(s):");
        for (int i = 0; i < orders.size(); i++) {
            System.out.println(orders.get(i));
        }
    }

    public void serve(Customer customer) {
        List<String> orders = customer.getOrders();
        System.out.println(orders.get(0) + " is ready. Enjoy!");
        orders.remove(0);
        System.out.println("You Have " + orders.size() + " More Unserved Orders.");
        if (orders.size() == 0) {
            System.out.println("Please Make Your Payment at the Front Desk. Thank You!");
        }
    }
}
