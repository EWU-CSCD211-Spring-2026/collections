package test;
import hashcode.*;
import java.util.HashSet;
import java.util.Set;

public class App {

	public static void main(String[] args) {
		
		int num_tests = 5;
		int max_count = 10000;
		int test_int = max_count / num_tests;
		
		for (int i = test_int; i <= max_count; i += max_count / num_tests) {
			runExperiments(i);
		}
		
    }
	
	/**
	 * Run the "good" and "bad" experiments for the provided count
	 * @param test_count the size of the data structure we are testing
	 */
	public static void runExperiments(int test_count) {
		Ingredient[] ingredientsGood = generateData(test_count, true);
		Ingredient[] ingredientsBad = generateData(test_count, false);
		
        // run experiment
        long goodTime = run_experiment(ingredientsGood);
        long badTime = run_experiment(ingredientsBad);
        
        // output results
        System.out.println("Running experiment for count of " + test_count);
        System.out.println("Scan time (good):\t" + goodTime + " ns");
        System.out.println("Scan time (bad):\t" + badTime + " ns");
        System.out.println("Bad / Good ratio: " + (double) badTime / goodTime);
        System.out.println();
	}
	
	/**
	 * Generate data for hashing experiment
	 * @param test_count the size of the data to generate
	 * @param good true if we want to test the "good" hashCode, false for the "bad"
	 * @return the array of objects we are going to test
	 */
	public static Ingredient[] generateData(int test_count, boolean good) {
		
		Ingredient[] ingredients = new Ingredient[test_count];
		
		if (good) {
			for (int i = 0; i < test_count; i++) {
	            ingredients[i] = new IngredientGood("IngredientID=" + i);
	        }
		} else { 
			for (int i = 0; i < test_count; i++) {
	            ingredients[i] = new IngredientBad("IngredientID=" + i);
	        }
		}
		
        return ingredients;
			
		
	}
	
	/**
	 * Run the actual experiment. Create a hashset of ingredient types,
	 * measure the time, then return the time it takes
	 * @param arr the array of objects we are going to test
	 * @return the time it takes for the test to run
	 */
	public static long run_experiment(Ingredient[] arr) {
		

        Set<Ingredient> set = new HashSet<>();

        int c = arr.length;

        for (int i = 0; i < c; i++) {
            set.add(arr[i]);
        }
        
        // test how long it takes the set to perform contains in nanoseconds
        //
        long startTime = System.nanoTime();
        for (int i = 0; i < c; i++) {
            set.contains(arr[i]);
        }
        long endTime = System.nanoTime();

        long time = endTime - startTime;
        
        return time;
	}

}
