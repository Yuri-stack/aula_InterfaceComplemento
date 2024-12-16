package exemplo.controller;

import java.util.ArrayList;

public class ListaController{

	ArrayList<String> lista = new ArrayList<String>();

	public void cadastrar(String livro) {
		lista.add(livro);
	}
}
