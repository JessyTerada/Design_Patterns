package Exercise3;

public class MineralType extends Stone{

	private static String nameMineral;

	public static String getMineralName() {
		return nameMineral;
	}

	public static void setMineralName(String name) {
		MineralType.nameMineral = name;
	}	
}
