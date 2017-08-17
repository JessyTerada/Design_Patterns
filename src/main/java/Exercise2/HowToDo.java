package Exercise2;

public abstract class HowToDo {
	
	private static Ingredient eggWhite;
	private static Ingredient yolk;

	public static void separateEgg(Ingredient ing) {
		System.out.println("Separate the egg on white egg and yolk");
		eggWhite  = new Ingredient("White Egg", ing.getQuant(), "unit");
		yolk = new Ingredient("Yolk", ing.getQuant(), "unit");
	}
	
	public static void knockSeparate(String ing) {
		System.out.println("knock only the " + ing );
	}
	
	public static void knock(String ing1, String ing2, String ing3, String ing4) {
		System.out.println("Knock the " + ing1 + ing2 + ing3 + ing4);
	}
	
	public static void sift(String ing) {
		System.out.println("Sift the " + ing);
	}
	
	public static void KnockEnd(String ing1, String ing2) {
		System.out.println("Incorporate to the better the "+ ing1 + " and the " + ing2);
	}
	
	public static void bake() {
		System.out.println("Dump everything in a cake pan and bake for 40 min");
	}
	
	public static void mixBurble(String ing1, String ing2,String ing3) {
		System.out.println("mix the " + ing1 + ", " + ing2 + ", " + ing3 + " until to burble");
	}
	
	public static void putFilling() {
		System.out.println("Put the filling between the halves of the cake");
	}
	
	public static void mixBurble(String ing1, String ing2,String ing3, String ing4) {
		System.out.println("mix the " + ing1 + ", " + ing2 + ", " + ing3 + ", " + ing4 +" until to burble");
	}
	
	public static void putCakeCover() {
		System.out.println("Put the cake cover upon the cake");
	}
}
