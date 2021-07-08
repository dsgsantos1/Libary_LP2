package biblioteca.modelo;

public class Professor extends Autor{
	
	private String area, formacao;
	private int tContrato, dedicacao;
	
	
	
	public String getDedicacao() {
		
		if(this.dedicacao == 1) {
			return "20 horas";
		}
		if(this.dedicacao == 2) {
			return "40 horas";
		}
		if(this.dedicacao == 3) {
			return "Dedicação exclusiva";
		}
		else {
			return "Erro";
		}
		
	}
	
	public void setDedicacao(int dedicacao) {
		this.dedicacao = dedicacao;
	}
	
	public String getArea() {
		return area;
	}
	
	public String getFormacao() {
		return formacao;
	}

	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}

	public void setArea(String area) {
		this.area = area;
	}
	
	public void settContrato(int tContrato) {
		this.tContrato = tContrato;
	}
	
	public String gettContrato() {
		
		if(this.tContrato == 1) {
			return "Professor Substituto";
		}
		if(this.tContrato == 2) {
			return "Sevidor";
		}
		else {
			return "Sem Cadastro";
		}
	}
	
	
	
	public String toString() {
		return super.toString() + 
				"\nFormação: " + this.getFormacao() +
				"\nArea de atuação IF: " + this.getArea() + 
				"\nTipo contrato: " + this.gettContrato() +
				"\nDedicação: " + this.getDedicacao();
	}
	
	

}
