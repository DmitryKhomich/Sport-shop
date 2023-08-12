
public class App {

    public static void main(String[] args) {

        OrderBuilder builder = new OrderBuilder();

        Order orderA = builder.orderA();

        System.out.println("First order: ");
        orderA.showItems();
        System.out.println("Total coast is " + orderA.getCost() + " USD.\n");

        Order orderB = builder.orderB();

        System.out.println("Second order: ");
        orderB.showItems();
        System.out.println("Total cost is " + orderB.getCost() + " USD.");
    }
}
