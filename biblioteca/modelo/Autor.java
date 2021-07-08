package biblioteca.modelo;

public class Autor {
	
	private String cpf, nomeCompleto, email, telefone, campus;
	private int matricula;
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCampus() {
		return campus;
	}

	public void setCampus(String campus) {
		this.campus = campus;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	
	public void imprimir() {
		System.out.printf("Autor: %s\nCampus: %s\nMatricula: %d\n", this.nomeCompleto, this.campus, this.matricula);
	}
	
	public String toString() {
		return "Nome completo: " + this.getNomeCompleto() + 
				"\nCPF: " + this.getCpf() + 
				"\nE-mail: " + this.getEmail() +
				"\nTelefone: " + this.getTelefone() +
				"\nMatricula: " + this.getMatricula() + 
				"\nCampus: " + this.getCampus();
	}
}
