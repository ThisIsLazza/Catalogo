package shop;

public class Prodotto {
	String codProdotto;
	String nome;
	String marca;
	//String modello; /???
	double prezzoIntero;
	double sconto;	//in %
	double prezzoFinale;
	int disponibilita;
	//statistiche /???
	//double spedizione; /???
	
	public Prodotto (String cod,String nome,String marca,double prezzo,double sconto,int disponibilita) {
		this.codProdotto=cod;
		this.nome=nome;
		this.marca=marca;
		this.prezzoIntero=prezzo;
		this.sconto=sconto;
		calcolaPrezzoFinale();
		this.disponibilita=disponibilita;
		//effetti dul db
	}
	
	private void calcolaPrezzoFinale(){
		this.prezzoFinale = this.prezzoIntero-(this.sconto*this.prezzoIntero);	}
	
	public void setPrezzo(double newPrezzo){
		this.prezzoIntero=newPrezzo;
		calcolaPrezzoFinale();	
		//effetti dul db
		}
	public void setSconto(double newSconto) {
		this.sconto=newSconto;
		calcolaPrezzoFinale();
		//effetti dul db
	}
	public void modificaDisponibilita(int mod){
		this.disponibilita+=mod;
		//effetti dul db
	}
	
}
