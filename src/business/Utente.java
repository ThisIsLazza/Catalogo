package business;

public abstract class Utente {
	
	//fare prove visibilità da altra classe che non sia sottoclasse
	protected String username;
	protected String password;
	protected String email;
	protected String indirizzo;
	protected String telefono;
	
	public Utente (String user,String pwd,String email,String indirizzo,String tel){
		this.username=user;
		this.password=pwd;
		this.email=email;
		this.indirizzo=indirizzo;
		this.telefono=tel;	}
	
	public String getUsername () {
		return this.username;	}
	public void setUsername (String newUsername) {
		this.username=newUsername;
		//effetti dul db
	}
	
	//non sicuro che public sia il modificatore più adatto,forse protected ma dipende come implemntiamo il login
	public String getPassword (){
		return this.password;	}
	
	/**
	 *metodo che imposta una nuova password da sostituire con changePassword 
	 * @param newPassword	nuovo password che si intende impostare
	 */
	protected void setPassword(String newPassword) {
		this.password=newPassword;	
		//effetti dul db
	}
	/**
	 * metodo che confronta oldPassword con la password attualmente impostata
	 * se corrispondono imposta newPassword come nuova password
	 * @param oldPassword	password da confrontare con quella attualmente impostata
	 * @param newPassword	nuova password da impostare
	 */
	public void changePassword (String oldPassword,String newPassword) {
		if (this.password == oldPassword) {
			this.password=newPassword;	
			//effetti dul db
			}
		else
			System.out.println("password errata! Impossibile modificare");	}
	
	public String getEmail() {
		return this.email;	}
	protected void setEmail (String newEmail){
		this.email=newEmail;	
		//effetti dul db
	}
	
	public String getIndirizzo(){
		return this.indirizzo;	}
	protected void setIndirizzo(String newIndirizzo){
		this.indirizzo=newIndirizzo;	
		//effetti dul db
	}
	
	public String getTelefono(){
		return this.telefono;	}
	protected void setTelefono(String newTelefono){
		this.telefono=newTelefono;	
		//effetti dul db
	}
}
