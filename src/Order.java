import java.util.ArrayList;
import java.util.List;

public class Order {

    public List<Item> list = new ArrayList<>();

    public void addItem (Item i){
        list.add(i);
    }

    public double getCost (){
        double sum = 0;
        for(Item i : list){
            sum += i.price();
        }
        return sum;
    }

    public void showItems() {
        for (Item item : list) {
            System.out.print("Item : " + item.color() + " " + item.name());
            System.out.print(", Producer : " + item.producer().name());
            System.out.println(", Price : " + item.price());
        }
    }
}
