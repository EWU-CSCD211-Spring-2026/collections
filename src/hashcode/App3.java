package hashcode;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

public class App3 {

    public static void main(String[] args) {

        Ingredient i1 = new Ingredient("cheese");
        Ingredient i2 = new Ingredient("pepperoni");
        Ingredient i3 = new Ingredient("cheese");

        List<Ingredient> pizza = new ArrayList<>();
        pizza.add(i1);
        pizza.add(i2);
        pizza.add(i3);

        Set<Ingredient> pizzaSet = new HashSet<>();
        pizzaSet.add(i1);
        pizzaSet.add(i2);
        pizzaSet.add(i3);

        System.out.println("Pizza: " + pizza);
        System.out.println("Does pizza contain pepperoni? ");
        System.out.println(pizza.contains(new Ingredient("pepperoni")));

        System.out.println("Pizza Set: " + pizzaSet);

    }

}
