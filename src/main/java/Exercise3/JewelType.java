package Exercise3;

public class JewelType extends MineralType {	
	private static String name;
	private static int anoFabricacao;
	private static double valorInicial;
	private static boolean historicalValue; 
	
	public static double getValorInicial() {
		double valorFinal = valorInicial;
		int ano = anoFabricacao;
		while (ano >= 100) {
			if (ano > 100) {
				valorFinal += valorFinal * 0.1;
				ano -= 100;
			}
		}
		
		if (getStoneName() != null) {
			valorFinal += valorFinal * (getPrecious() / 100);
		}
		
		if (historicalValue) {
			valorFinal += valorFinal * 0.3;
		}
		
		return valorFinal;
	}
	
	public static void setValorInicial(double valorInicial) {
		JewelType.valorInicial = valorInicial;
	}	
	public static String getName() {
		return name;
	}
	public static void setName(String name) {
		JewelType.name = name;
	}
	public static int getAnoFabricacao() {
		return anoFabricacao;
	}
	public static void setAnoFabricacao(int anoFabricacao) {
		JewelType.anoFabricacao = anoFabricacao;
	}
}