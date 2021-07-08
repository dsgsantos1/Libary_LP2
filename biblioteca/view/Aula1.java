package biblioteca.view;

import java.util.ArrayList;

import biblioteca.modelo.Aluno;
import biblioteca.modelo.Autor;
import biblioteca.modelo.Biblioteca;
import biblioteca.modelo.Cliente;
import biblioteca.modelo.Livro;
import biblioteca.modelo.Professor;

public class Aula1 {
	
	public static void main(String[] args) {
		
//		Professor roberto = new Professor();
//		Aluno carlos = new Aluno();
//		
//		roberto.setNomeCompleto("Milton Santos");
//		roberto.setCpf("888.888.888-88");
//		roberto.setEmail("milton.santos@ifms.edu.br");
//		roberto.setTelefone("(67) 97777-7777");
//		roberto.setCampus("Jardim");
//		roberto.setMatricula(1001);
//		roberto.setFormacao("Geografia");
//		roberto.settContrato(2);
//		roberto.setArea("Geografia");
//		roberto.setDedicacao(3);
		
//		Livro livroProf = new Livro();
//		livroProf.setTitulo("Geografia e pedagogia");
//		livroProf.setIsbn(123);
//		livroProf.setEditora("Editora IFMS");
//		livroProf.setArea(5);
//		livroProf.setAutor(roberto);
//		livroProf.setPreco(100.00);
		
//		System.out.println("═══ Ｌｉｖｒｏ Ｐｒｏｆｅｓｓｏｒ ═══");
//		System.out.println(livroProf.toString());
//		System.out.println();
		
//		carlos.setNomeCompleto("Kabengele Munanga");
//		carlos.setCpf("666.666.666-66");
//		carlos.setEmail("munanga@ifms.edu.br");
//		carlos.setTelefone("(67) 86666-6666");
//		carlos.setCampus("Jardim");
//		carlos.setMatricula(666);
//		carlos.setCurso("Informática");
//		carlos.setSituacao(1);
		
//		Livro livroAluno = new Livro();
//		livroAluno.setTitulo("Linguagem de Programação e Pedagogia");
//		livroAluno.setIsbn(456);
//		livroAluno.setEditora("Editora IFMS");
//		livroAluno.setArea(1);
//		livroAluno.setAutor(carlos);
//		livroAluno.setPreco(200.00);
	
//		System.out.println("=== LIVRO ALUNO ===");
//		System.out.println(livroAluno.toString());
//		System.out.println();
		
		//IMPRESS�O DOS DADOS RESUMIDOS - PROFESSOR
//		System.out.println("=== RESUMO PROFESSOR ===");
//		roberto.imprimir();
//
//		System.out.println();
		
		//IMPRESS�O DOS DADOS RESUMIDOS - PROFESSOR
//		System.out.println("=== RESUMO ALUNO ===");
//		carlos.imprimir();
//		System.out.println();
		
//		Biblioteca bibIfms = new Biblioteca();
//		bibIfms.addLivro(livroAluno, 3);
//		bibIfms.addLivro(livroProf, 2);
		
		Biblioteca bib = new Biblioteca();
		
		bib.carregarDados();
		
		for(Autor autor: bib.getBibliotecaAutor()) {
			System.out.println("============================");
			System.out.println(autor.toString());
		}
		
		for(Livro livro: bib.getAcervo()) {
			System.out.println();
			System.out.println(livro.toString());
		}
		
		for(Cliente cliente : bib.getClientes()) {
			System.out.println();
			System.out.println(cliente.toString());
		}
		
//		bib.addAutor(carlos);
	//		bib.addAutor(roberto);
		
		String texto = "Pedagogia";
//		String nome = "Santos";
//		
//		Livro livroQueSeraRemovido = null;
//		
//		ArrayList <Autor> lista1 = bib.buscarAutor(nome);
//		if(lista1.isEmpty()) {
//			System.out.println("Nenhum autor encontrado!");
//		}
//		else {
//			System.out.println("=== AUTORES ENCONTRADOS ===");
//			for(Autor autor: lista1) {
//				System.out.println("=> " + autor.getNomeCompleto());
//			}
//		}
		
		
//		System.out.println();
//		
		ArrayList <Livro> lista = bib.buscarLivroPorTitulo(texto);
		if (lista.isEmpty()) {
			System.out.println("Nenhum livro encontrado!");
		}else {
			System.out.println("=== LIVROS ENCONTRADOS ===");
			for (Livro livro : lista){
				System.out.println("=> " + livro.getTitulo());
				//Nesse caso, ser� removido a �ltima c�pia
//				livroQueSeraRemovido = livro;
			}
		}
//		System.out.println();
		
//		bibIfms.removerLivro(livroQueSeraRemovido);
		
//		lista = bibIfms.buscarLivroPorTitulo(texto);
//		System.out.println("=== LISTA DE LIVROS AP�S A REMOÇÃO ===");
//		for (Livro livro : lista){
//			System.out.println("=> " + livro.getTitulo());
//		}
		
	}	
}
