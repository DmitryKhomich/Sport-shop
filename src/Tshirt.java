public class Tshirt implements Item {

    public String color;

    public Tshirt(String color){
        this.color = color;
    }

    @Override
    public String color() {
        return color;
    }

    @Override
    public double price() {
        return 50.0;
    }

    @Override
    public Producer producer() {
        return new TshirtProducer();
    }

    @Override
    public String name() {
        return "T-shirt";
    }
}
