package aula1;

public class Vetor {

	public static void main(String[] args) {
		
		int n[] = new int[4];
		n[0] = 3;
		n[1] = 5;
		n[2] = 8;
		n[3] = 2;
		
		System.out.println(n[0] + " " + n[1] + " " + n[2] + " " + n[3]);
		
		System.out.println("--------------------------");
		
		int v[] = {3,5,7,2,9};
		
		for (int i = 0; i <= 4; i++) {
			System.out.print(v[i] + " ");
		}
		System.out.println("\n--------------------------");
		for (int i = 0; i <= 4; i++) {
			System.out.println("Na posicao " + i + ", temos o valor: " + v[i]);
		}
		System.out.println("--------------------------");
		System.out.println("Total de posicoes do vetor = " + v.length);	
		System.out.println("--------------------------");
		for (int i = 0; i <= v.length-1; i++) {
			System.out.print(v[i] + " ");
		}

	}

}
