package biblioteca.modelo;

public class Livro {
	
	private String titulo, editora = "Editora IFMS";
	private int area, isbn;
	private Autor autor;
	private double preco;
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public double getPreco() {
		
		if((this.preco >= 100) && (this.preco < 200)) {
			return this.preco - (this.preco*9)/100;
		}
		
		if((this.preco >= 200) && (this.preco < 300)) {
			return this.preco - (this.preco*80)/100;
		}
		
		if(this.preco >= 300){
			return this.preco - (this.preco*70)/100;
		}
		
		else {
			return preco;
		}
		
	}
	
	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public String getArea() {
		
		String descritivo;
		
		switch(this.area) {
		case 1:
			return descritivo = "Exatas";
		case 2:
			return descritivo = "Biológicas";
		case 3:
			return descritivo = "Engenharias";
		case 4:
			return descritivo = "Saúde";
		case 5:
			return descritivo = "Agrárias";
		case 6:
			return descritivo = "Socias";
		case 7:
			return descritivo = "Lingusticas";
		case 8:
			return descritivo = "Artes";
		default:
			return descritivo = "Erro";
		}	
	}

	public void setArea(int area) {
		this.area = area;
	}

	
	 
	public String toString() {
		return "━━━━━━━━━━━━━━━━━━━━━" +
				"\nTitulo: " + this.titulo + 
			   "\nISBN: " + this.isbn + 
			   "\nEditora: " + this.editora + 
			   "\nArea: " + this.getArea() +
			   "\nPreço: " + this.getPreco() + 
			   "\n"; 
//			   "\n" + this.autor.toString() +
//			   "\n━━━━━━━━━━━━━━━━━━━━━";
	}
	
	public String Nomezin() {
		return "Titulo: " + this.titulo;
	}
		 
	 }

