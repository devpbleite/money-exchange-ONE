
public class RealPesoChi {
	
	private double taxaDeConversão = 159.756;
	
	public double getRealPesoChi(double valorInserido) {
		
		return (valorInserido * taxaDeConversão);
		
	}

}
