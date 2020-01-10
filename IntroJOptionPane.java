package aula1;

import javax.swing.JOptionPane;

public class IntroJOptionPane {

	public static void main(String[] args) {
		
		// 1a parte
		JOptionPane.showMessageDialog(null, "Olá Mundo", "Seja bem vindo", JOptionPane.ERROR_MESSAGE);
		
		
		// 2a parte
		int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor: "));
		JOptionPane.showMessageDialog(null, "Você informou o valor: " + valor);
		
		// 3a parte
		int num, sum = 0;
		do {
			num = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Informe um numero:<br><h5><em>(valor 0 encerra)</em></h5></html>"));
			sum += num;
		} while (num != 0);
		JOptionPane.showMessageDialog(null, "<html><center>Resultado Final<br><br><hr><br>Somatório vale: " + sum + "</cenyter></html>");

	}

}
