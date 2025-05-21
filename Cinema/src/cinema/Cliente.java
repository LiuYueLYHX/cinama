package cinema;

public class Cliente extends Pessoa{
	String email;
	String telefone;
	
	public Cliente(String email, String telefone, String nome, String cpf) {
		super(nome, cpf);
		this.email = email;
		this.telefone = telefone;
	}
	
	public String GetGmail() {
		return email;
	}
	
	public String GetTelefone() {
		return telefone;
	}
	
	
}
