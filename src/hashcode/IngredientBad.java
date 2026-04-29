package hashcode;

public class IngredientBad extends Ingredient {
	
	public IngredientBad(String name) {
		super(name);
	}
	
	@Override 
	public boolean equals(Object o) {
		return super.equals(o);
	}
	
	@Override
	public int hashCode() {
		return 1; // bad
	}

}
