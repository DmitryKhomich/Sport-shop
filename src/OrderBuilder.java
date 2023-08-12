public class OrderBuilder {

    public Order orderA(){
        Order order = new Order();
        order.addItem(new Cap("white"));
        order.addItem(new Tshirt("red"));
        return order;
    }

    public Order orderB(){
        Order order = new Order();
        order.addItem(new Cap("black"));
        order.addItem(new Tshirt("blue"));
        return order;
    }
}
