
public class PesoChiReal {
	
	private double taxaDeConversão = 0.0063;
	
	public double getPesoChiReal(double valorInserido) {
		
		return (valorInserido * taxaDeConversão);
		
	}

}
