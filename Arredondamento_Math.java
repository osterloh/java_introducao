package aula1;

public class Arredondamento_Math {

	public static void main(String[] args) {
		
		int n1 = -10;
		float n2 = 3.9f;
		float n3 = 4.2f;
		float n4 = 5.6f;
		
		System.out.println("Valor absoluto -10	(abs)  : " + Math.abs(n1) + "  - retorna somente o valor ");
		System.out.println("Arredonda baixo 3,9	(floor): " + Math.floor(n2) + " - arredonda o valor para baixo");
		System.out.println("Arredonda cima 4,2	(ceil) : " + Math.ceil(n3) + " - arredonda o valor para cima");
		System.out.println("Arredondamento 5,6	(round): " + Math.round(n4) + "   - arredonda o valor aritmeticamente");
		
		System.out.println("\n\nValor aleatoio: " + Math.random());	// retorna valor aleatorio entre 0 e 1
		System.out.println("Aleatorio entre 5 e 10: " + (5 + Math.random() * (10-5)));
		System.out.println("Aletario entre 1 e 8: " + (int) (1 + Math.random() * (8-1)));

	}

}
