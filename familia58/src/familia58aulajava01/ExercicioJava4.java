package familia58aulajava01;

public class ExercicioJava4 {

public static void main(String[] args) {
		
		double numero;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite um n�mero: ");
		numero = leia.nextDouble();
		
		if (numero % 2 == 0) { 
			numero = Math.sqrt(numero); 
		}else {
			numero = Math.pow(numero, 2); 
		}
		
		System.out.printf("\nResultado: %.1f",numero); 
	}
		
}