package Livros;

import javax.swing.JOptionPane;

public class Livro {
	
	String titulo;
	String autor;
	String categoria;
	String codigo;
	float preco;
	
	public Livro(String titulo, String autor, String categoria, String codigo, float preco) {
		if(titulo.isEmpty()) {
			System.out.println("Campo vazio. Por favor digite o t�tulo");
			throw new IllegalArgumentException();
		}
		else if(autor.isEmpty()) {
			System.out.println("Campo vazio. Por favor digite o nome do autor");
			throw new IllegalArgumentException();
		}
		else if(categoria.isEmpty()) {
			System.out.println("Campo vazio. Por favor digite a categoria");
			throw new IllegalArgumentException();
		}
		else if(codigo.isEmpty()) {
			System.out.println("Campo vazio. Por favor digite o c�digo");
			throw new IllegalArgumentException();
		}
		else if(preco<0) {
			System.out.println("Valor negativo. Por favor digite novamente");
			throw new IllegalArgumentException();
		}
		
		this.titulo = titulo;
		this.autor = autor;
		this.categoria = categoria;
		this.codigo = codigo;
		this.preco = preco;
		
	}
	
	public void AtualizarDados(float preco) {
		this.preco = preco;
		System.out.println("Pre�o atualizado: R$ "+preco);
	}
	
	public void AtualizarDados(String autor, String codigo) {
		this.autor = autor;
		System.out.println("Autor atualizado: "+autor.substring(0,1).toUpperCase().concat(autor.substring(1)));	
		this.codigo = codigo;
		System.out.println("C�digo atualizado: "+codigo);
	}
	
	public void FormatacaoDados(String titulo, String autor, String categoria) {
		this.titulo = titulo.substring(0,1).toUpperCase().concat(titulo.substring(1));	
		this.autor = autor.substring(0,1).toUpperCase().concat(autor.substring(1));	
		this.categoria = categoria.substring(0,1).toUpperCase().concat(categoria.substring(1));	

	}
	
	public void Mostrar() {
		System.out.println("-----Livraria Panini-----\n");
		System.out.println("T�tulo: "+titulo);
		System.out.println("Autor: "+autor);
		System.out.println("Categoria: "+categoria);
		System.out.println("Codigo: "+codigo);
		System.out.println("Pre�o: R$ "+preco);
	}
	
	public static void main(String[] args) {
		String titulo;
		String autor;
		String categoria;
		String codigo;
		float preco;
		
		titulo = JOptionPane.showInputDialog("Digite o titulo do livro");
		autor = JOptionPane.showInputDialog("Digite o autor do livro");
		categoria = JOptionPane.showInputDialog("Digite a categoria do livro");
		codigo = JOptionPane.showInputDialog("Digite o codigo do livro");
		preco = Float.parseFloat(JOptionPane.showInputDialog("Digite o preco do livro"));
		
		Livro liv = new Livro(titulo, autor, categoria, codigo, preco);
		
		liv.FormatacaoDados(titulo, autor, categoria);
		liv.Mostrar();
		liv.AtualizarDados(Float.parseFloat(JOptionPane.showInputDialog("Digite o novo pre�o: ")));
		liv.AtualizarDados(JOptionPane.showInputDialog("Digite o novo autor: "), JOptionPane.showInputDialog("Digite o novo codigo: "));
	}
}


