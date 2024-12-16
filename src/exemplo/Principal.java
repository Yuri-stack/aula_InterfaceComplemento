package exemplo;

import java.util.Scanner;

import exemplo.controller.ListaController;

public class Principal {

	public static void main(String[] args) {
		ListaController lc = new ListaController();
		
		Scanner leia = new Scanner(System.in);
		String livro;
			
		System.out.println("\nInsira um Livro para adicionar na Lista:");
		livro = leia.nextLine();
		lc.cadastrar(livro);
				
		leia.close();
	}

}
