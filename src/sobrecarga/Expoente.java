package sobrecarga;

public class Expoente {
	// M�todo que n�o calcula nada 
	public static void elevar() {
		System.out.println("Este met�do n�o calcula nada!");
	}
	
	// M�todo que calcula o quadrado de i
	public static double elevar(double i) {
		return i * i;
	}
	
	//M�todo que calcula i elevado a j
	public static double elevar(double i, double j) {
		return Math.pow(i, j);
	}

}
