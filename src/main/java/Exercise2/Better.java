package Exercise2;

import Exercise2.Ingredient;
import Exercise2.HowToDo;

public class Better extends HowToDo{
	static Ingredient whiteFlour = new Ingredient("White Flour", 2, "tea-cup");
	static Ingredient milk = new Ingredient("Milk", 1, "tea-cup");
	static Ingredient egg = new Ingredient("Egg", 5, "unit");
	static Ingredient sugar = new Ingredient("Sugar", 1, "tea-cup");
	static Ingredient bakingPowder = new Ingredient("Baking powder", 1, "teaspoon");
	static Ingredient chocolatePowder = new Ingredient("Chocolate powder", 1, "tea-cup");
    
	public static void main(String[] args) {
		separateEgg(egg);
		knockSeparate("eggWhite"); 
		knock("eggWhite", "yolk", sugar.getNomeIng(), milk.getNomeIng());
		sift(whiteFlour.getNomeIng());
		KnockEnd(whiteFlour.getNomeIng(), milk.getNomeIng());
		bake();
	}
	
}
