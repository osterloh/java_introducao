package aula1;

public class Comparacao_Operadores_Igualdade_Logico {

	public static void main(String[] args) {
		
		String nome1 = "Johnatan";
		String nome2 = "Johnatan";
		String nome3 = new String("Johnatan");
		
		String var;
		var = (nome1 == nome2) ? "Igual" : "Diferente";
		String obj;
		obj = (nome1 == nome3) ? "Igual" : "Diferente";
		String obj2;
		obj2 = (nome1.equals(nome3)) ? "Igual" : "Diferente";
		
		System.out.println(var);
		System.out.println(obj);
		System.out.println(obj2);
		
		int x, y, z;
		x = 4;
		y = 7;
		z = 12;
		boolean a, b, c, d;
		
		a = (x<y && y<z) ? true : false;
		b = (x<y || y>z) ? true : false;
		c = (x<y ^ y<z) ? true : false;
		d = (!(x<y)) ? true : false;
		
		System.out.println("\na: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);
		System.out.println("d: " + d);

	}

}
