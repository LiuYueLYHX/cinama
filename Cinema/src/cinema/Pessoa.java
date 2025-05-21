package cinema;

public abstract class Pessoa {
	String nome;
	String cpf;
	
	public Pessoa(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public String GetNome() {
		return nome;
	}
	
	public String GetCpf() {
		return cpf;
	}
}
