package cinema;

public class Funcionario extends Pessoa{
	String cargo;
	double salario;
	
	public Funcionario(String nome, String cpf, String cargo, double salario) {
		super(nome, cpf);
		this.cargo = cargo;
		this.salario = salario;
	}
	
	public String GetCargo() {
		return cargo;
	}
	
	public double GetSalario() {
		return salario;
	}
}
