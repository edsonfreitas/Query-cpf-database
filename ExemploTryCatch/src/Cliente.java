
public class Cliente {
	public Cliente(String nome, long cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
	private String nome;
	private  long cpf;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome (String nome) {
		this.nome= nome;
	}
	
	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
}
