import java.util.Scanner;

public class Robot {

    static String Model;

    public Robot(String Model) {
        this.Model = Model;
    }

    public void newCustomer() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Hi! I am " + Robot.Model + ". I will be at your service today!");
        System.out.println("May I have you name please?");
        String name = myObj.nextLine();
        System.out.println("Nice to meet you, " + name + "!");
        Customer customer = new Customer(name);
        customer.takeOrders(customer);
        while (customer.getOrders().size() > 0) {
            customer.serve(customer);
        }
    }


    public static void main(String[] args) {
        Robot robot = new Robot("Smart Waiter 300");
        robot.newCustomer();
    }
}
