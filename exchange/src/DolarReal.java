
public class DolarReal {
	
	private double taxaDeConversão = 5.1937;
	
	public double getDolarReal(double valorInserido) {
		
		return (valorInserido * taxaDeConversão);
		
	}

}
