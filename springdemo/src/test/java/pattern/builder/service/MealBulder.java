package pattern.builder.service;

public class MealBulder {
    public Meal meal1(){
        Meal meal=new Meal();
        meal.AddItem(new VegHB());
        meal.AddItem(new ChickenHB());
        meal.AddItem(new CokeYL());
        return meal;
    }
    public  Meal meal2(){
        Meal meal=new Meal();
        meal.AddItem(new VegHB());
        meal.AddItem(new CokeYL());
        meal.AddItem(new PepsiYL());
        return meal;
    }
}
