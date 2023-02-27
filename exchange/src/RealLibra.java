
public class RealLibra {
	
	private double taxaDeConversão = 0.1603;
	
	public double getRealLibra(double valorInserido) {
		
		return (valorInserido * taxaDeConversão);
		
	}

}
