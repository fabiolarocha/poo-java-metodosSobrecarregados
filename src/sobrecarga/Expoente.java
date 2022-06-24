package sobrecarga;

public class Expoente {
	// Método que não calcula nada 
	public static void elevar() {
		System.out.println("Este metódo não calcula nada!");
	}
	
	// Método que calcula o quadrado de i
	public static double elevar(double i) {
		return i * i;
	}
	
	//Método que calcula i elevado a j
	public static double elevar(double i, double j) {
		return Math.pow(i, j);
	}

}
