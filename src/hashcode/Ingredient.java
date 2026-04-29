package hashcode;

public class Ingredient implements Comparable<Ingredient> {
	
	String name;
	
	public Ingredient(String name) {
		this.name = name;
	}

    @Override
    public int compareTo(Ingredient other) {
        return this.name.compareTo(other.name);
    }

    public String toString() {
        return name;
    }

	@Override
	public boolean equals(Object o) {
		if (o == null) {
			return false;
		} else if (!(o instanceof Ingredient)) {
			return false;
		} else { 
			Ingredient other = (Ingredient) o;
			return other.name.equals(name);
		}
	}
	
	@Override 
	public int hashCode() {
		return name.hashCode();
	}

}
