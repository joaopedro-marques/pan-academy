package JOptionPane;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.JOptionPane;

public class Leitura {
	public static void main(String[] args) {
		//Mostrou a Mensagem
		JOptionPane.showMessageDialog(null, "Calculando parcelas");
		double valorTotal = Double.parseDouble(JOptionPane.showInputDialog("Qual é o valor do produto??"));
		int numParcela = Integer.parseInt(JOptionPane.showInputDialog("Em quantas parcelas?"));
		double valorParcela = valorTotal/numParcela;
		NumberFormat formato = new DecimalFormat("R$ ###,###.##");
		JOptionPane.showMessageDialog(null,  "O valor de cada Parcela é: " + formato.format(valorParcela));
	}
}
