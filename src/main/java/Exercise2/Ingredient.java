package Exercise2;

public class Ingredient {
	
	private String nomeIng;
	private double quant;
	private String medidor;
	
	public Ingredient(String nome, double quant, String medidor) {
		this.nomeIng = nome;
		this.quant = quant;
		this.medidor = medidor;
	}
	
	public String getMedidor() {
		return medidor;
	}
	public void setMedidor(String medidor) {
		this.medidor = medidor;
	}
	public String getNomeIng() {
		return nomeIng;
	}
	public void setNomeIng(String nomeIng) {
		this.nomeIng = nomeIng;
	}
	public double getQuant() {
		return quant;
	}
	public void setQuant(double quant) {
		this.quant = quant;
	}
}
