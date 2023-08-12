public class OrderBuilder {

    public Order orderA(){
        Order order = new Order();
        order.addItem(new Cap("White"));
        order.addItem(new Tshirt("Red"));
        return order;
    }

    public Order orderB(){
        Order order = new Order();
        order.addItem(new Cap("Black"));
        order.addItem(new Tshirt("Blue"));
        return order;
    }
}
