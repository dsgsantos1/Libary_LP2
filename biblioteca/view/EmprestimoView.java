package biblioteca.view;

import java.util.ArrayList;
import java.time.LocalDate;
import java.util.Scanner;

import biblioteca.modelo.Aluno;
import biblioteca.modelo.Autor;
import biblioteca.modelo.Biblioteca;
import biblioteca.modelo.Cliente;
import biblioteca.modelo.DataFormato;
import biblioteca.modelo.Emprestimo;
import biblioteca.modelo.Livro;
import biblioteca.modelo.Professor;


public class EmprestimoView {
	
	public static void texto () {
		System.out.println("\nMenu de Empréstimo!");
		System.out.println("1-Emprestar");
		System.out.println("0-Sair");
	}
	
	public static void erro() {
		System.out.println("Opção Incorreta");
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int opcao;
		
		Biblioteca bib = new Biblioteca();
	
		bib.carregarDados();
		
		for(Livro livro: bib.getAcervo()) {
			System.out.println();
			System.out.print(livro.Nomezin());
		}
		
		String texto = "o conceito";
		// utilizei "o conceito", pois no meu linux não pega
		// utf - 8 quando recebe de windows
		
		
//		System.out.println("");
		
		do{
			
			System.out.println("");
			texto();
			
			opcao = ler.nextInt();
			
			if(opcao != 1 && opcao != 0) {
				erro();
			}
			
			if(opcao == 1) {
				
				System.out.println("\nSeja bem vinda: " + bib.getClientes().get(2).getNomeCompleto());
				bib.getClientes().get(2).getEntrega();
				
				Livro emprestimoLivro = null;
				Emprestimo emprestimo = new Emprestimo();
				
				DataFormato data = new DataFormato();
				data.setDataAtual(LocalDate.now()); 
				
//				System.out.println(data.getDataAtual());
//				System.out.println(data.getDataAtual().plusDays(bib.getClientes().get(2).getEntrega()));
//				
				emprestimo.setCliente(bib.getClientes().get(2));
				emprestimo.setDataEmprestimo(data.getDataAtual());
				emprestimo.setDataDevolucao(data.getDataAtual().plusDays(bib.getClientes().get(2).getEntrega()));
				
				System.out.println("Data de Emprestimo: " + emprestimo.getDataEmprestimo());
				System.out.println("Data de Entrega: " + emprestimo.getDataDevolucao());

				ArrayList <Livro> lista = bib.buscarLivroPorTitulo(texto);
				if (lista.isEmpty()) {
					System.out.println("Nenhum livro encontrado!");
//					break;
				}
				else {
					System.out.println();
					System.out.println("\n=== LIVROS ENCONTRADOS ===");
					for (Livro livro : lista){
						System.out.println("=> " + livro.getTitulo());
//						emprestimoLivro = livro;
						emprestimo.setLivro(livro);
						bib.removerLivro(livro);
						break;
					}
				}				
				
				
				
			}
			
		} while (opcao != 0);
		
		ler.close();
		
	}

}

