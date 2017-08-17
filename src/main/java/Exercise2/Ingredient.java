package Exercise2;

public class Ingredient {
	
	private static String nomeIng;
	private static double quant;
	private static String medidor;
	
	public Ingredient(String nome, double quant, String medidor) {
		this.nomeIng = nome;
		this.quant = quant;
		this.medidor = medidor;
	}
	
	public static String getMedidor() {
		return medidor;
	}
	public static void setMedidor(String medidor) {
		medidor = medidor;
	}
	public String getNomeIng() {
		return nomeIng;
	}
	public static void setNomeIng(String nomeIng) {
		nomeIng = nomeIng;
	}
	public static double getQuant() {
		return quant;
	}
	public static void setQuant(double quant) {
		quant = quant;
	}
}
