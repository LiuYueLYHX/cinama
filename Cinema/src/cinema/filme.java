package cinema;

public class Filme {
	String titulo;
	String genero;
	int duracao;
	
	public Filme(String titulo, String genero, int duracao){
		this.titulo = titulo;
		this.genero = genero;
		this.duracao = duracao;		
	}
	
	public String GetTitulo() {
		return titulo;
	}
	
	public String Getgenero() {
		return genero;
	}
	
	public int Getduracao() {
		return duracao;
	}
}
