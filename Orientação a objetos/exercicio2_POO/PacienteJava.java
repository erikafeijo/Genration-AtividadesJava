package exercicio2_POO;

/*
Crie uma classe paciente e apresente os atributos e m�todos referentes
esta classe, em seguida crie um objeto paciente, defina as instancias deste
objeto e apresente as informa��es deste objeto no console.
*/

public class PacienteJava {


		private String nome;
		private int idade;
		private String convenio;
		private String exame;
		
		
		public PacienteJava(String nome, int idade, String convenio, String exame) {
			this.nome = nome;
			this.idade = idade;
			this.convenio = convenio;
			this.exame = exame;
			
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getConvenio() {
			return convenio;
		}

		public void setConvenio(String convenio) {
			this.convenio = convenio;
		}

		public String getExame() {
			return exame;
		}

		public void setExame(String exame) {
			this.exame = exame;
		}

		public int getIdade() {
			return idade;
		}

		public void setIdade(int idade) {
			this.idade = idade;
		}
		
		public void ImprimirInfo() {
			System.out.println("\nO exame de "+exame+" est� marcado para o(a) paciente "+nome+" de "+idade+" anos.\nConv�nio: "+convenio);
		}
		
	}
