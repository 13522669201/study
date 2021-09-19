package pattern.builder.service;

import pattern.builder.Item;

import java.util.ArrayList;
import java.util.List;
import java.text.MessageFormat;

public class AbstractMeal {
    private List<Item> items=new ArrayList<>() ;
    public void AddItem(Item item) {
        this.items.add(item);
    }
    public float getCost(){
        float cost=0.0f;
        for (Item item:items){
            cost+=item.pice();
        }
        return cost;
    }
    public void showitems(){
        items.forEach(item->{
            String str=MessageFormat.format("菜名:{0} 包装:{1} 价格:{2}", item.name(), item.pack().name(), item.pice());
            System.out.println(str);
        });
    }
}
