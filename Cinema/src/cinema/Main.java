package cinema;

import java.time.LocalTime;

public class Main {

	public static void main(String[] args) {
		SistemaCinema cinema = new SistemaCinema();
        
        Filme filme = new Filme("Interestelar", "Ficção Científica", 169);
        cinema.cadastrarFilme(filme);
        
        Sala sala = new Sala(5, "120");
        cinema.cadastrarSala(sala);
        
        Sessao sessao = new Sessao(filme, sala, LocalTime.of(20, 30));
        cinema.criarSessao(sessao);
        
        Cliente cliente = new Cliente("joao@email.com","(11) 99999-9999","João Silva", "123.456.789-00");
        
        cinema.venderIngresso(cliente, sessao);
}

}
