package tp4EnPoo;

public class Message {

	private String message;
	private Client expediteur;
	private Client receveur;
	//private int date;
	
	public Message(Client exp,Client recev, String mess) {
		this.message = mess;
		this.expediteur= exp;
		this.receveur = recev;
	
	}
	
	public String getMessage() {
		return this.message;	
	}
	
	public String setMessage(String leMessage) {
		return this.message = leMessage;
	}
	
	public String toString() {
		return this.expediteur + " a envoyé le message : // " + this.message + " // à l'intention de : " + this.receveur;
	}
	
	public Client getExpediteur() {
		return this.expediteur;
	}
	
	public Client getReceveur() {
		return this.receveur;
	}
}