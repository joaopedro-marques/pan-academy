package Exercicio;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.JOptionPane;

public class Livro extends Produto{
		public void exibirDados() {
			
			System.out.println(this.getCodigo());
			System.out.println(this.getDescricao());
			System.out.println(this.getPreco());
			
			Livro livro1 = new Livro();
			JOptionPane.showMessageDialog(null, "Cadastrando livro");
			livro1.setCodigo(JOptionPane.showInputDialog("Qual � o c�digo do produto??"));
			String numParcela = Integer.parseInt(JOptionPane.showInputDialog("Qual a descri��o ?"));
			double valorParcela = valorTotal/numParcela;
			NumberFormat formato = new DecimalFormat("R$ ###,###.##");
			JOptionPane.showMessageDialog(null,  "O valor de cada Parcela �: " + formato.format(valorParcela));
		}
}
