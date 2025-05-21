package cinema;

import java.util.ArrayList;
import java.util.List;

public class SistemaCinema {
	List<Filme> filmes;
	List<Sala> salas;
	List<Sessao> sessoes;
	List<Ingresso> ingressos;
	
	public SistemaCinema() {
		this.filmes = new ArrayList<>();
		this.salas = new ArrayList<>();
		this.sessoes = new ArrayList<>();
		this.ingressos = new ArrayList<>();
	}
	
	public void cadastrarFilme(Filme filme) {
		filmes.add(filme);
	}
	
	public void cadastrarSala(Sala sala) {
		salas.add(sala);
	}
	
	public void criarSessao(Sessao sessao) {
		sessoes.add(sessao);
	}
	
	public void venderIngresso(Cliente cliente, Sessao sessao) {
		Ingresso ingresso = new Ingresso(cliente, sessao);
		ingressos.add(ingresso);
		ingresso.emissao();
	}
	
}
