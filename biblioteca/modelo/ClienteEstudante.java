package biblioteca.modelo;

public class ClienteEstudante extends Cliente {
	
	private String instituicao, curso;
	private int entrega = 30;
	
	public int getEntrega() {
		return entrega;
	}

	public void setEntrega(int entrega) {
		this.entrega = entrega;
	}

	public String getInstituicao() {
		return instituicao;
	}

	public void setInstituicao(String instituicao) {
		this.instituicao = instituicao;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public String toString() {
		return super.toString() +
				"\nInstituição: " + this.getInstituicao() +
				"\nCurso: " + this.getCurso();
	}
	

}
