package Exercise2;

public class HowToDo {
	
	private Ingredient whiteEgg;
	private Ingredient yolk;

	public void separateEgg(Ingredient ing) {
		System.out.println("Separate the egg on white egg and yolk");
		whiteEgg  = new Ingredient("White Egg", ing.getQuant(), "unit");
		yolk = new Ingredient("Yolk", ing.getQuant(), "unit");
	}
	
	public void knockSeparate(String ing) {
		System.out.println("knock only the " + ing );
	}
	
	public void knock(String ing1, String ing2, String ing3, String ing4) {
		System.out.println("Knock the " + ing1 + ing2 + ing3 + ing4);
	}
	
	public void sift(String ing) {
		System.out.println("Sift the " + ing);
	}
	
	public void KnockEnd(String ing1, String ing2) {
		System.out.println("Incorporate to the better the "+ ing1 + " and the " + ing2);
	}
	
	public void mixBurble(String ing1, String ing2,String ing3) {
		System.out.println("mix the " + ing1 + ", " + ing2 + ", " + ing3 + " until to burble");
	}
	
	public void putFilling() {
		System.out.println("Put the filling between the halves of the cake");
	}
	
	public void mixBurble(String ing1, String ing2,String ing3, String ing4) {
		System.out.println("mix the " + ing1 + ", " + ing2 + ", " + ing3 + ", " + ing4 +" until to burble");
	}
	
	public void putCakeCover() {
		System.out.println("Put the cake cover upon the cake");
	}
}
