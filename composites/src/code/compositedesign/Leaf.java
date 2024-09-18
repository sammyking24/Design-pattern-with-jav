package code.compositedesign;

import java.util.ArrayList;
import java.util.List;

interface Component{
    void ShowPrice();
}
   public class Leaf implements Component{

    int price;
    String name;

    public Leaf(int price, String name) {
        this.price = price;
        this.name = name;
    }

    @Override
    public void ShowPrice() {
        System.out.println(name + ":" + price);

    }
}

