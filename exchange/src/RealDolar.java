
public class RealDolar {
	
	private double taxaDeConversão = 0.1927;
	
	public double getRealDolar(double valorInserido) {
		
		return (valorInserido * taxaDeConversão);
		
	}

}
