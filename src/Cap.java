
public class Cap implements Item{
    public String color;

    public Cap(String color) {
        this.color = color;
    }

    @Override
    public String color() {
        return color;
    }

    @Override
    public double price() {
        return 54.5;
    }

    @Override
    public Producer producer() {
        return new CapsProducer();
    }

    @Override
    public String name() {
        return "Cap";
    }
}
