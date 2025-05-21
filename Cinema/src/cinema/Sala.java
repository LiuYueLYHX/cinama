package cinema;

public class Sala {
	int numero;
	String capacidade;
	
	public Sala(int numero, String capacidade) {
		this.numero = numero;
		this.capacidade = capacidade;
	}
	
	public int GetNumero() {
		return numero;
	}
	
	public String capacidade() {
		return capacidade;
	}
}
