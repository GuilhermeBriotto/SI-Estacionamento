
public class TesteGuina {

	public static void main(String[] args) {
		int[] ai = { 1, 2, 3 };
		double[] ad = { 1.1, 2.1, 3.1 };
		String[] as = { "paulo", "guina", "selmini" };
		
		TesteGuina.imprimir(ai);
	}

	public static void imprimir(int[] v) {
		for (int i = 0; i < v.length; i++) {
			System.out.println(v[i] + "\n");
		}
	}

	public static void imprimir(double[] v) {
		for (int i = 0; i < v.length; i++) {
			System.out.println(v[i] + "\n");
		}
	}

	public static void imprimir(String[] v) {
		for (int i = 0; i < v.length; i++) {
			System.out.println(v[i] + "\n");
		}
	}

}
