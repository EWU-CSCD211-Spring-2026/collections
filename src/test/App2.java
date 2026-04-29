
package test;
import hashcode.*;

import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
import java.util.List;
import java.util.LinkedList;

public class App2 {

    public static void main(String[] args) {

        Set<String> strings = new HashSet<>();

        strings.add("one");
        strings.add("two");
        strings.add("two");

        System.out.println("strings: " + strings);

        Set<Ingredient> ingredients = new HashSet<>();
        List<Ingredient> listIngredients = new LinkedList<>();

        ingredients.add(new IngredientGood("abc"));
        ingredients.add(new IngredientGood("def"));
        
        listIngredients.add(new Ingredient("456"));
        listIngredients.add(new Ingredient("123"));

        Collections.sort(listIngredients);

        // does not work
        //Collections.sort(ingredients);

        System.out.println("Set ingredients: " + ingredients);
        System.out.println("List ingredients: " + listIngredients);

    }

}
