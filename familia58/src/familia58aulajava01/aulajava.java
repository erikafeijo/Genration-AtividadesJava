package familia58aulajava01;

import java.util.Scanner;

public class aulajava {

	public static void main(String[] args) {
		
		double n1,n2,n3,media;
		int op;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com a primeira nota:");//6
		n1 = leia.nextFloat();
		System.out.println("\nEntre com a segunda nota:");//6
		n2 = leia.nextFloat();
		System.out.println("\nEntre com a terceira nota:");//6
		n3 = leia.nextFloat();
		
		media = (n1+n2+n3)/3;
		
		System.out.println("\nM�dia Aritim�tica: "+media);
		System.out.printf("\nM�dia Aritim�tica: %.2f",media);
		
        if(media>=7 && media<=10) {
        	System.out.println("\nAluna aprovada!!!");
        }else if(media>=5 && media<7) {
        	System.out.println("\nAluna de Exame!!!");
        }else {
        	System.out.println("\nAluna reprovada!!!");
        }
        
        System.out.println("\n\t\tMenu de incentivos");
        System.out.println("\n1- Voc� vai aprender!!!");
        System.out.println("\n2-J� deu certo!!!");
        System.out.println("\n3- Vai d� Bommmm!!!");
        System.out.println("\n4- Com dedica��o voc�s v�o al�m");
        System.out.println("\nDigite sua op��o: ");
        op = leia.nextInt();
        
        switch(op) {
        
        case 1:
        	System.out.println("\nVoc� vai aprender!!!");
        	break;
        case 2:
        	System.out.println("\nJ� deu certo!!!");
        	break;
        case 3:
            System.out.println("\nVai d� Bommmm!!!");
            break;
        case 4:
        	System.out.println("\nCom dedica��o voc�s v�o al�m!!!");
        	break;
        	default:
        	    System.out.println("\nOp��o Inv�lida!!!");
        	 }
        
            n1 = Math.sqrt(n2);
            n2 = Math.pow(n3,  4);
	}

}
