package aula1;

public class SaidaDado {

	public static void main(String[] args) {

		float nota = 8.5f;
		String nome = "Johnatan";
		
		System.out.print("A nota eh: " + nota);		// imprime sem quebra de linha no final
		
		System.out.println("A nota eh: " + nota);	// imprime com quebra de linha no final
		
		System.out.printf("A nota eh %.4f \n", nota);	// imprissao formatada, o %F indica o tipo float,
														// o .4  indica 4 casas decimais e o \N eh para quebra de linhas
		
		System.out.printf("Aluno %s tirou %.2f", nome, nota);	// imprissao formatada, o %S indica o tipo String,
																// o %F indica o tipo float, o .2  indica 2 casas decimais

	}

}
