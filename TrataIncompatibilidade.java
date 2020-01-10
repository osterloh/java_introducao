package aula1;

public class TrataIncompatibilidade {

	public static void main(String[] args) {
		
		int idade = 30;
		//String valor = idade;
		String valor = Integer.toString(idade);
		System.out.println(valor);
		
		String num = "28";
		//int dia = num;
		int dia = Integer.parseInt(num);
		System.out.println(dia);
		
		String nota = "8.5";
		float media = Float.parseFloat(nota);
		System.out.println(media);

	}

}
