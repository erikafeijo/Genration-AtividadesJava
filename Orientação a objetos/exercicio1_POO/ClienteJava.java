package exercicio1_POO;

public class ClienteJava {
	
	private String nomeCliente;
	private String Cel;
	private String Endere�o;
	private String Email;
	private int idade;
	
public ClienteJava(String nomeCliente,String Cel,String Endere�o,String Email,int idade) {
		
		this.nomeCliente = nomeCliente;
		this.Cel = Cel;
		this.Endere�o = Endere�o;
		this.Email = Email;
		this.idade = idade;
		
		
	}

public String getNomeCliente() {
	return nomeCliente;
}

public void setNomeCliente(String nomeCliente) {
	this.nomeCliente = nomeCliente;
}

public String getCel() {
	return Cel;
}

public void setCel(String cel) {
	Cel = cel;
}

public String getEndere�o() {
	return Endere�o;
}

public void setEndere�o(String endere�o) {
	Endere�o = endere�o;
}

public String getEmail() {
	return Email;
}

public void setEmail(String email) {
	Email = email;
}

public int getIdade() {
	return idade;
}

public void setIdade(int idade) {
	this.idade = idade;
}

public void imprimirInfo() {
	System.out.println("nomeCliente: "+nomeCliente);
	System.out.println("Cel: "+Cel);
	System.out.println("Endere�o: "+Endere�o);
	System.out.println("Email: "+Email);
	System.out.println("idade: "+idade);
	
}

}
