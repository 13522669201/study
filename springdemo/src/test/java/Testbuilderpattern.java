import pattern.builder.service.Meal;
import pattern.builder.service.MealBulder;
import org.junit.jupiter.api.Test;
import pattern.builder1.Builder;
import pattern.builder1.ConcreteBuilder;
import pattern.builder1.Director;
import pattern.builder1.Product;

public class Testbuilderpattern {
    @Test
   void test(){
       MealBulder mealBulder=new MealBulder();
       Meal meal=mealBulder.meal1();
       meal.showitems();

       Meal meal2=mealBulder.meal2();
       meal2.showitems();

   }
   @Test
   void  test1(){
       Builder builder = new ConcreteBuilder();
       Director director = new Director(builder);
       Product product = director.construct();
       product.show();
   }
}
