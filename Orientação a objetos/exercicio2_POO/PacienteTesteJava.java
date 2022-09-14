package exercicio2_POO;

public class PacienteTesteJava {


	public static void main(String[] args) {
		
		PacienteJava pac = new PacienteJava("Fernanda Feijos",9,"Unimed","Hemograma");
		PacienteJava pac1 = new PacienteJava("Elisa Feijo",11,"Notredame Intermédica","Exame de vista");
		PacienteJava pac2 = new PacienteJava("Erika Lima ",35,"SulAmérica","ultrassom");
		
		System.out.println("\n\t\t\t Bem-vindo aos exames marcados de hoje ");
		pac.ImprimirInfo();
		pac1.setExame("Urina");
		pac1.ImprimirInfo();
		pac2.ImprimirInfo();
	}

}
