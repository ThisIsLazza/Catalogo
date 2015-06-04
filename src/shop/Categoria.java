package shop;

import java.util.Vector;

public class Categoria extends Vector<Prodotto> {
	protected String nome;
	protected Categoria superCategoria;
	protected Categoria [] sottoCategoria;
	
	public Categoria (String nome,Categoria superCategoria,Categoria... sottoCategoria) {
		this.nome=nome;
		this.superCategoria = superCategoria;
		this.sottoCategoria = sottoCategoria;
	}
}
