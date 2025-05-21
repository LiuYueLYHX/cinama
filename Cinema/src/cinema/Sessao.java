package cinema;

import java.time.LocalTime;

public class Sessao implements Reservavel{
	Filme filme;
	Sala sala;
	LocalTime horario;
	
	public Sessao(Filme filme , Sala sala, LocalTime horario) {
		this.filme = filme;
		this.sala = sala;
		this.horario = horario;
	}
	
	public Filme GetFilme(){
		return filme;
	}
	
	public Sala GetSala() {
		return sala;
	}
	
	public LocalTime GetHorario() {
		return horario;
	}
	
	@Override
	public void reserva() {
		System.out.println("Sessao reservado em" + horario);
	}
}
