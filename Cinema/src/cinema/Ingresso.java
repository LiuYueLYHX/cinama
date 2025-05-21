package cinema;

public class Ingresso {
	Cliente cliente;
	Sessao sessao;
	
	public Ingresso(Cliente cliente, Sessao sessao) {
		this.cliente = cliente;
		this.sessao = sessao;
	}
	
	public Cliente GetCliente() {
		return cliente;
	}
	
	public Sessao GetSessao() {
		return sessao;
	}
	
	public void emissao() {
		System.out.println(
				"Dados do Cliente: " + 
						"\n   Nome: " + cliente.GetNome() +
						"\n   cpf: " + cliente.GetCpf() +
						"\n email: " + cliente.GetGmail() +
						"\n telefone: " + cliente.GetTelefone() +
						"\n filme: " + sessao.GetFilme() +
						"\n sala: " + sessao.GetSala() +
						"\n horario: " + sessao.GetHorario()
				);
	}
}
