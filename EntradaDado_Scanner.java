package aula1;

import java.util.Scanner;

public class EntradaDado_Scanner {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o nome do aluno: ");
		String nome = teclado.nextLine();
		
		System.out.print("Digite a nota do aluno: ");
		float nota = teclado.nextFloat();
		
		System.out.printf("A nota de %s foi %.2f", nome, nota);

	}

}
