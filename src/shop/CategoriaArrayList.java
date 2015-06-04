package shop;

import java.util.ArrayList;

public class CategoriaArrayList extends ArrayList<Prodotto> {
	
	protected String nome;
	protected CategoriaArrayList superCategoria;
	protected CategoriaArrayList sottoCategoria;
	
	public CategoriaArrayList (String nome,CategoriaArrayList superCategoria,CategoriaArrayList sottoCategoria) {
		this.nome=nome;
		this.superCategoria = superCategoria;
		this.sottoCategoria = sottoCategoria;
	}
}
