
public class EuroReal {
	
	private double taxaDeConversão = 5.4949;
	
	public double getEuroReal(double valorInserido) {
		
		return (valorInserido * taxaDeConversão);
		
	}

}
