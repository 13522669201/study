import pattern.builder.service.Meal;
import pattern.builder.service.MealBulder;
import org.junit.jupiter.api.Test;

public class Testbuilderpattern {
    @Test
   void test(){
       MealBulder mealBulder=new MealBulder();
       Meal meal=mealBulder.meal1();
       meal.showitems();

       Meal meal2=mealBulder.meal2();
       meal2.showitems();

   }
}
