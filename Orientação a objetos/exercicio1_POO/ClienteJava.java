package exercicio1_POO;

public class ClienteJava {
	
	private String nomeCliente;
	private String Cel;
	private String Enderešo;
	private String Email;
	private int idade;
	
public ClienteJava(String nomeCliente,String Cel,String Enderešo,String Email,int idade) {
		
		this.nomeCliente = nomeCliente;
		this.Cel = Cel;
		this.Enderešo = Enderešo;
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

public String getEnderešo() {
	return Enderešo;
}

public void setEnderešo(String enderešo) {
	Enderešo = enderešo;
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
	System.out.println("Enderešo: "+Enderešo);
	System.out.println("Email: "+Email);
	System.out.println("idade: "+idade);
	
}

}
