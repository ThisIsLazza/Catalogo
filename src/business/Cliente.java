package business;

public class Cliente extends Utente {
	
	//private Carrello carrello; //carrello che verrà implementsto successivamente
	//private Statistiche stat; //statistiche che verranno implementate successivamente
	private int saldoPunti;	//punti ottenuti da ogni utante in base agli acquisti effettuati
	
	public Cliente (String user,String pwd,String email,String indirizzo,String tel) {
		super(user,pwd,email,indirizzo,tel);
		this.saldoPunti=0;
		//effetti dul db
	}
	
	public int getSaldoPunti(){
		return this.saldoPunti;
	}
}
