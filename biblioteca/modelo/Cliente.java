package biblioteca.modelo;

public class Cliente {

	private String nomeCompleto, cpf, email, endereco;
	private String telefone;
	protected int entrega = 10;
	
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public int getEntrega() {
		return entrega;
	}
	public void setEntrega(int entrega) {
		this.entrega = entrega;
	}
	
	public String toString() {
		return "Nome Completo: " + this.getNomeCompleto() + 
				"\nCPF: " + this.getCpf() + 
				"\nE-mail: " + this.getEmail() +
				"\nTelefone: " + this.getTelefone() +
				"\nEndereço: " + this.getEndereco();
		
	}
	
}
