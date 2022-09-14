package exercicio1_POO;

public class ClienteJava {
	
	private String nomeCliente;
	private String Cel;
	private String Endereço;
	private String Email;
	private int idade;
	
public ClienteJava(String nomeCliente,String Cel,String Endereço,String Email,int idade) {
		
		this.nomeCliente = nomeCliente;
		this.Cel = Cel;
		this.Endereço = Endereço;
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

public String getEndereço() {
	return Endereço;
}

public void setEndereço(String endereço) {
	Endereço = endereço;
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
	System.out.println("Endereço: "+Endereço);
	System.out.println("Email: "+Email);
	System.out.println("idade: "+idade);
	
}

}
