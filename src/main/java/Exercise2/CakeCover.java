package Exercise2;

public class CakeCover extends HowToDo{

	static Ingredient chocolateSprinkle = new Ingredient("Chocolate sprinkle", 0.5, "tea-cup");
	static Ingredient chocolatePowder = new Ingredient("Chocolate powder", 1, "tea-cup");
	static Ingredient butter = new Ingredient("Butter", 2, "soup-poon");
	static Ingredient condensedMilk = new Ingredient("Condensed milk", 2, "can");

	public CakeCover() {
		System.out.println("CAKE COVER");
		
		mixBurble(chocolateSprinkle.getNomeIng(), chocolatePowder.getNomeIng(), butter.getNomeIng(), condensedMilk.getNomeIng());
		putCakeCover();
	}
}
