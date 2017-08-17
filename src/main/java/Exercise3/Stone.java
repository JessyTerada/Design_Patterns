package Exercise3;

public class Stone {
	
	private static String stoneName;
	private static int precious;

	public static String getStoneName() {
		return stoneName;
	}
	public static void setStoneName(String name) {
		Stone.stoneName = name;
	}
	public static int getPrecious() {
		return precious;
	}
	public static void setPrecious(int precious) {
		Stone.precious = precious;
	}	
}
