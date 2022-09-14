package exercicio1_POO;


public class ClienteTeste {

	public static void main(String[] args) {

		ClienteJava cliente1 = new ClienteJava("Erika Lima" , "13-991111616" , "ProjetadaII" , "feijoerika@gmail.com" , 35);
		
		
		cliente1.imprimirInfo();
		System.out.println("****************mudança de Email**************");
		cliente1.setEmail("feijoerikatech@gmail.com");
		cliente1.imprimirInfo();
		System.out.println("\n\n");
		
		

	}

}
