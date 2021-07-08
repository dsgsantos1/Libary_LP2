package biblioteca.modelo;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Biblioteca {

	private ArrayList <Livro> acervo;
	private ArrayList <Autor> bibliotecaAutor;
	private ArrayList <Cliente> clientes;
	
	public boolean carregarDados(){
		String caminho;
		boolean ret = true;
		
		//carregar no linux
		caminho = System.getProperty("user.dir") + "/src/biblioteca/modelo/autores.txt";
		
		//carregar no windows
		//caminho = System.getProperty("user.dir") + "\\src\\biblioteca\\modelo\\autores.txt";
		
		File arquivo = new File(caminho);
		try {
			
			FileReader ler = new FileReader(arquivo);
			BufferedReader buffer = new BufferedReader(ler);
			String linha = buffer.readLine();
			while (linha != null){
				String[] dados = linha.split(";");
				//Autor professor
				if (dados[1].equals("1")) {
					Professor autorProfessor = new Professor();
					autorProfessor.setNomeCompleto(dados[2]);
//					System.out.println(autorProfessor.getNomeCompleto());
					autorProfessor.setCpf(dados[3]);
//					System.out.println(autorProfessor.getCpf());
					autorProfessor.setEmail(dados[4]);
//					System.out.println(autorProfessor.getEmail());
					autorProfessor.setTelefone(dados[5]);
//					System.out.println(autorProfessor.getTelefone());
					autorProfessor.setCampus(dados[6]);
//					System.out.println(autorProfessor.getCampus());
					autorProfessor.setMatricula(Integer.parseInt(dados[7]));
//					System.out.println(autorProfessor.getMatricula());
					autorProfessor.setFormacao(dados[8]);
//					System.out.println(autorProfessor.getFormacao());
					autorProfessor.settContrato(Integer.parseInt(dados[9]));
//					System.out.println(autorProfessor.gettContrato());
					autorProfessor.setArea(dados[10]);
//					System.out.println(autorProfessor.getArea());
					autorProfessor.setDedicacao(Integer.parseInt(dados[11]));
//					System.out.println(autorProfessor.getDedicacao());
					
					this.bibliotecaAutor.add(Integer.parseInt(dados[0]),autorProfessor);
				}
				//Autor aluno
				else {
					Aluno autorAluno = new Aluno();
					autorAluno.setNomeCompleto(dados[2]);
//					System.out.println(autorAluno.getNomeCompleto());
					autorAluno.setCpf(dados[3]);
//					System.out.println(autorAluno.getCpf());
					autorAluno.setEmail(dados[4]);
//					System.out.println(autorAluno.getEmail());
					autorAluno.setTelefone(dados[5]);
//					System.out.println(autorAluno.getTelefone());
					autorAluno.setCampus(dados[6]);
//					System.out.println(autorAluno.getCampus());
					autorAluno.setMatricula(Integer.parseInt(dados[7]));
//					System.out.println(autorAluno.getMatricula());
					autorAluno.setCurso(dados[8]);
//					System.out.println(autorAluno.getCurso());
					autorAluno.setSituacao(Integer.parseInt(dados[9]));
//					System.out.println(autorAluno.getSituacao());
					this.bibliotecaAutor.add(Integer.parseInt(dados[0]), autorAluno);
				}
				linha = buffer.readLine();
				
			}
		} catch (Exception e) {
			ret = false;
		} 
		
		//carregar no linux
		caminho = System.getProperty("user.dir") + "/src/biblioteca/modelo/acervo.txt";
		
		//carregar no windows
		//caminho = System.getProperty("user.dir") + "\\src\\biblioteca\\modelo\\acervo.txt";
		
		arquivo = new File(caminho);
		try {
			int copias = 1;
			FileReader ler = new FileReader(arquivo);
			BufferedReader buffer = new BufferedReader(ler);
			String linha = buffer.readLine();
			while (linha != null){
				String[] dados = linha.split(";");
				Livro livro = new Livro();
				livro.setTitulo(dados[0]);
//				System.out.println(livro.getTitulo());
				livro.setIsbn(Integer.parseInt(dados[1]));
//				System.out.println(livro.getIsbn());
				livro.setEditora(dados[2]);
//				System.out.println(livro.getEditora());
				livro.setArea(Integer.parseInt(dados[3]));
//				System.out.println(livro.getArea());
				livro.setAutor(bibliotecaAutor.get(Integer.parseInt(dados[4])));
//				System.out.println(livro.getAutor());
				livro.setPreco(Double.parseDouble(dados[5]));
//				System.out.println(livro.getPreco());
				copias = Integer.parseInt(dados[6]);
//				System.out.println(copias);
				
				this.addLivro(livro, copias);
				
				linha = buffer.readLine();
			}
		} catch (Exception e) {
			ret = false;
		} 
		
		//carregar no linux
		caminho = System.getProperty("user.dir") + "/src/biblioteca/modelo/clientes.txt";
		
		//carregar no windows
		//caminho = System.getProperty("user.dir") + "\\src\\biblioteca\\modelo\\clientes.txt";
		
		arquivo = new File(caminho);
		
		try {
			
			FileReader ler = new FileReader(arquivo);
			BufferedReader buffer = new BufferedReader(ler);
			String linha = buffer.readLine();
			while (linha != null){
				String[] dados = linha.split(";");
				//Professor Cliente
				if (dados[1].equals("1")) {
					Cliente clienteGeral = new Cliente();
					clienteGeral.setNomeCompleto(dados[2]);
//					System.out.println(autorProfessor.getNomeCompleto());
					clienteGeral.setCpf(dados[3]);
//					System.out.println(autorProfessor.getCpf());
					clienteGeral.setEmail(dados[4]);
//					System.out.println(autorProfessor.getEmail());
					clienteGeral.setTelefone(dados[5]);;
//					System.out.println(autorProfessor.getTelefone());
					clienteGeral.setEndereco(dados[6]);
					
//					System.out.println("Ola");
//					System.out.println(clienteGeral.toString());
//					System.out.println();
					this.clientes.add(Integer.parseInt(dados[0]),clienteGeral);
				}
				
				//Aluno Cliente
				if (dados[1].equals("2")) {
					ClienteEstudante aluno = new ClienteEstudante();
					aluno.setNomeCompleto(dados[2]);
//					System.out.println(autorProfessor.getNomeCompleto());
					aluno.setCpf(dados[3]);
//					System.out.println(autorProfessor.getCpf());
					aluno.setEmail(dados[4]);
//					System.out.println(autorProfessor.getEmail());
					aluno.setTelefone(dados[5]);;
//					System.out.println(autorProfessor.getTelefone());
					aluno.setEndereco(dados[6]);
					aluno.setInstituicao(dados[7]);
					aluno.setCurso(dados[8]);
					
//					System.out.println(aluno.toString());
//					System.out.println();
					this.clientes.add(Integer.parseInt(dados[0]),aluno);
				}
				
				if(dados[1].equals("3")) {
					ClienteProfessor professor = new ClienteProfessor();
					professor.setNomeCompleto(dados[2]);
//					System.out.println(autorProfessor.getNomeCompleto());
					professor.setCpf(dados[3]);
//					System.out.println(autorProfessor.getCpf());
					professor.setEmail(dados[4]);
//					System.out.println(autorProfessor.getEmail());
					professor.setTelefone(dados[5]);;
//					System.out.println(autorProfessor.getTelefone());
					professor.setEndereco(dados[6]);
					professor.setInstituicao(dados[7]);
					professor.setFormacao(dados[8]);
					
//					System.out.println(professor.toString());
//					System.out.println();
					this.clientes.add(Integer.parseInt(dados[0]),professor);
				}
				
				linha = buffer.readLine();
				
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			ret = false;
		} 
		
		return ret;
	}
	
	public Biblioteca() {
		this.acervo = new ArrayList<Livro>();
		this.bibliotecaAutor = new ArrayList<Autor>();
		this.clientes = new ArrayList<Cliente>();
	}
	
	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}

	public ArrayList<Autor> getBibliotecaAutor() {
		return bibliotecaAutor;
	}

	public void setBibliotecaAutor(ArrayList<Autor> bibliotecaAutor) {
		this.bibliotecaAutor = bibliotecaAutor;
	}

	public void addLivro(Livro livro, int quantidade) {
		while (quantidade > 0) { 
			this.acervo.add(livro);
			quantidade--;
		}
	}

	public void removerLivro(Livro livro) {
		this.acervo.remove(livro);
	}
	
	public ArrayList<Livro> buscarLivroPorTitulo(String titulo) {
		ArrayList<Livro> lista = new ArrayList<Livro>();
		for (Livro livro : this.acervo){
			if (livro.getTitulo().toUpperCase().contains(titulo.toUpperCase())) {
				lista.add(livro);
			}
		}
		return lista;
	}
	
	public ArrayList<Livro> buscarLivroPorAutor(String autor) {
		ArrayList<Livro> lista = new ArrayList<Livro>();
		for (Livro livro : this.acervo){
			if (livro.getAutor().getNomeCompleto().toUpperCase().contains(autor.toUpperCase())) {
				lista.add(livro);
			}
		}
		return lista;
	}

	public ArrayList<Livro> getAcervo() {
		return acervo;
	}

	public void setAcervo(ArrayList<Livro> acervo) {
		this.acervo = acervo;
	}
	
	public ArrayList<Autor> buscarAutor(String nome) {
		// TODO Auto-generated method stub
		ArrayList<Autor> lista1 = new ArrayList<Autor>();
		for (Autor autor : this.bibliotecaAutor){
			if (autor.getNomeCompleto().toUpperCase().contains(nome.toUpperCase())) {
				lista1.add(autor);
			}
		}
		return lista1;
	}
}