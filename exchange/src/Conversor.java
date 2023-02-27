import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.JOptionPane;

public class Conversor {

	public static void main(String[] args) {

		String entrada = JOptionPane.showInputDialog("Digite o valor:");
		ValidadorDeEntrada valida = new ValidadorDeEntrada();
		while (!valida.entradaValida(entrada) && entrada != null) {
			entrada = JOptionPane.showInputDialog("Digite um valor monetário válido:");
			if (entrada == null) {
				break;
			}
		}

		double valorInserido = Double.parseDouble(entrada);

		double valorConvertido = 0;

		NumberFormat valorFormatado = new DecimalFormat("#0.00");
		String mensagemFinal = "";

		String[] opcoes = { "Dolar para Real", "Euro para Real", "Libras Esterlinas para Real",
				"Peso Argentino para Real", "Peso Chileno para Real", "Real para Dolar", "Real para Euro",
				"Real para Libras Esterlinas", "Real para Peso Argentino", "Real para Peso Chileno" };
		String escolhido = (String) JOptionPane.showInputDialog(null,
				"Escolha a moeda para a qual você deseja converter", "Moedas", -1, null, opcoes, args);

		switch (escolhido) {
		case "Dolar para Real":

			System.out.println("Opção 1: " + valorInserido);
			DolarReal valorDollarReal = new DolarReal();
			valorConvertido = valorDollarReal.getDolarReal(valorInserido);
			mensagemFinal = "Valor convertido: R$ " + valorFormatado.format(valorConvertido);

			break;

		case "Euro para Real":

			System.out.println("Opção 2: " + valorInserido);
			EuroReal valorEuroReal = new EuroReal();
			valorConvertido = valorEuroReal.getEuroReal(valorInserido);
			mensagemFinal = "Valor convertido: R$ " + valorFormatado.format(valorConvertido);

			break;

		case "Libras Esterlinas para Real":

			System.out.println("Opção 3: " + valorInserido);
			LibraReal valorLibraReal = new LibraReal();
			valorConvertido = valorLibraReal.getLibraReal(valorInserido);
			mensagemFinal = "Valor convertido: R$ " + valorFormatado.format(valorConvertido);

			break;

		case "Peso Argentino para Real":

			System.out.println("Opção 4: " + valorInserido);
			PesoArgReal valorPesoArgReal = new PesoArgReal();
			valorConvertido = valorPesoArgReal.getPesoArgReal(valorInserido);
			mensagemFinal = "Valor convertido: R$ " + valorFormatado.format(valorConvertido);

			break;

		case "Peso Chileno para Real":

			System.out.println("Opção 5: " + valorInserido);
			PesoChiReal valorPesoChiReal = new PesoChiReal();
			valorConvertido = valorPesoChiReal.getPesoChiReal(valorInserido);
			mensagemFinal = "Valor convertido: R$ " + valorFormatado.format(valorConvertido);

			break;

		case "Real para Dolar":

			System.out.println("Opção 6: " + valorInserido);
			RealDolar valorRealDollar = new RealDolar();
			valorConvertido = valorRealDollar.getRealDolar(valorInserido);
			mensagemFinal = "Valor convertido: U$ " + valorFormatado.format(valorConvertido);

			break;

		case "Real para Euro":

			System.out.println("Opção 7: " + valorInserido);
			RealEuro valorRealEuro = new RealEuro();
			valorConvertido = valorRealEuro.getRealEuro(valorInserido);
			mensagemFinal = "Valor convertido: € " + valorFormatado.format(valorConvertido);

			break;

		case "Real para Libras Esterlinas":

			System.out.println("Opção 8: " + valorInserido);
			RealLibra valorRealLibra = new RealLibra();
			valorConvertido = valorRealLibra.getRealLibra(valorInserido);
			mensagemFinal = "Valor convertido: £ " + valorFormatado.format(valorConvertido);

			break;

		case "Real para Peso Argentino":

			System.out.println("Opção 9: " + valorInserido);
			RealPesoArg valorRealPesoArg = new RealPesoArg();
			valorConvertido = valorRealPesoArg.getRealPesoArg(valorInserido);
			mensagemFinal = "Valor convertido: $ " + valorFormatado.format(valorConvertido);

			break;

		case "Real para Peso Chileno":

			System.out.println("Opção 10: " + valorInserido);
			RealPesoChi valorRealPesoChi = new RealPesoChi();
			valorConvertido = valorRealPesoChi.getRealPesoChi(valorInserido);
			mensagemFinal = "Valor convertido: CLP " + valorFormatado.format(valorConvertido);

			break;

		default:
			break;
		}

		JOptionPane.showMessageDialog(null, mensagemFinal);
		int resposta = JOptionPane.showConfirmDialog(null, "Deseja inserir outro valor?");
		if (resposta == JOptionPane.YES_OPTION) {

			main(args);
		} else {
			JOptionPane.showMessageDialog(null, "Volte Sempre!");
		}
		
		

	}

}
