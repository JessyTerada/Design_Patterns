package Exercise2;

public class Filling extends HowToDo{

	static Ingredient chocolatePowder = new Ingredient("Chocolate powder", 0.5, "tea-cup");
	static Ingredient butter = new Ingredient("Butter", 2, "soup-poon");
	static Ingredient condensedMilk = new Ingredient("Condensed milk", 2, "cans");
	
	public static void main(String[] args) {
		mixBurble(chocolatePowder.getNomeIng(), butter.getNomeIng(), condensedMilk.getNomeIng());
		putFilling();
	}
}

