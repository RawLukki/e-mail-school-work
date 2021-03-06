package tp4EnPoo;

import java.util.ArrayList;

public class Client {

	private String nom;
	private Message message;
	private Messagerie serveur;
	
	public Client(String nomClient) {
		this.nom = nomClient;
		
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public String toString() {
		return this.nom;
	}
	
	public void envoiMessage(Messagerie listeM,Client expediteur, Message message) {
		listeM.ajoutMessage(expediteur,message);
		
	}
	
	public ArrayList<Message> recupMessage(Client receveur, ArrayList<Message> listeGlobale) {
		ArrayList<Message> reception = new ArrayList<Message>();
		for(Message m : listeGlobale) {
			if(m.getReceveur()==receveur) {
				reception.add(m);
			}
		}
		return reception;
		
	}
	
	
	
	
	
}

