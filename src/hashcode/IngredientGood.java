package hashcode;

public class IngredientGood extends Ingredient {
	
	
	public IngredientGood(String name) {
		super(name);
	}
	
	@Override 
	public boolean equals(Object o) {
		return super.equals(o);
	}

	@Override
	public int hashCode() {
		return super.hashCode(); // good
	}

}
