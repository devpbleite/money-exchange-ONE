
public class RealPesoArg {
	
	private double taxaDeConversão = 37.918;
	
	public double getRealPesoArg(double valorInserido) {
		
		return (valorInserido * taxaDeConversão);
		
	}

}
