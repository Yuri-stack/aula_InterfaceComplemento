package exemplo;

import java.util.Scanner;

import exemplo.controller.ListaController;
import exemplo.controller.PilhaController;

public class Principal {

	public static void main(String[] args) {
		ListaController lc = new ListaController();
		//PilhaController pc = new PilhaController();
		
		Scanner leia = new Scanner(System.in);
		String livro;
		
		/*
		System.out.println("Insira um Livro para adicionar na Pilha:");
		livro = leia.nextLine();
		pc.cadastrar(livro);
		*/
		
		System.out.println("\nInsira um Livro para adicionar na Lista:");
		livro = leia.nextLine();
		lc.cadastrar(livro);
		
		
		//Listando as Collections
		
		leia.close();
	}

}
