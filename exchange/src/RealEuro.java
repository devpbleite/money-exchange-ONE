
public class RealEuro {
	
	private double taxaDeConversão = 0.1820;
	
	public double getRealEuro(double valorInserido) {
		
		return (valorInserido * taxaDeConversão);
		
	}

}
