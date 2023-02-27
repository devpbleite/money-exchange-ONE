
public class PesoArgReal {
	
	private double taxaDeConversão = 0.0264;
	
	public double getPesoArgReal(double valorInserido) {
		
		return (valorInserido * taxaDeConversão);
		
	}

}
