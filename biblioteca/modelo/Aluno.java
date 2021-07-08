package biblioteca.modelo;

public class Aluno extends Autor{

	private String curso;
	private int situacao;
	
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String getSituacao() {
		
		switch(this.situacao) {
			case 1:
				return "Em curso";
			case 2:
				return "Transferido";
			case 3: 
				return "Concluido";
			default:
				return "Sem Cadastro";
		}
		
	}
	public void setSituacao(int situacao) {
		this.situacao = situacao;
	}
	
}
