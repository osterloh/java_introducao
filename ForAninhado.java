package aula1;

public class ForAninhado {

	public static void main(String[] args) {
		
		for (int i = 0; i <= 3; i++) {
			for (int j = 0; j <= 2; j+=2) {
				System.out.println("i: " + i + " - j: " + j);
			}
		}

	}

}
