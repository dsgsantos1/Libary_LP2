package biblioteca.modelo;

public class ClienteProfessor extends Cliente{
	
	private String instituicao, formacao;
	private int entrega = 45;
	
	
	
	public String getFormacao() {
		return formacao;
	}
	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}
	public String getInstituicao() {
		return instituicao;
	}
	public void setInstituicao(String instituicao) {
		this.instituicao = instituicao;
	}
	public int getEntrega() {
		return entrega;
	}
	public void setEntrega(int entrega) {
		this.entrega = entrega;
	}
	
	public String toString() {
		return super.toString() +
				"\nInstituição: " + this.getInstituicao() +
				"\nFormação: " + this.getFormacao();
	}
	
}
