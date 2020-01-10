package aula1;

import java.util.Scanner;

public class VetorDinamico {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		String aluno[] = new String[1];
		int totalAlunos = 0;
		String opc;

		do {
			if (totalAlunos == aluno.length) {
				String novaArray[] = new String[aluno.length + 1];
				for (int i = 0; i < aluno.length; i++) {
					novaArray[i] = aluno[i];
				}
				aluno = novaArray;
			}

			for (int i = 0; i <= aluno.length - 1; i++) {
				if(aluno[i] == null) {
					System.out.print("Informe o nome: ");
					aluno[i] = in.next();
					
				} else if(aluno[i] != null) {
					continue;
				}
				totalAlunos++;
			}

			System.out.println("Informar mais um? [s/n]");
			opc = in.next();
		} while (opc.equals("s"));

		for (int i = 0; i < aluno.length; i++) {
			System.out.println("Nome na posicao " + (i + 1) + ": " + aluno[i]);
		}
		System.out.println("Total de especos: " + aluno.length);

	}

}
