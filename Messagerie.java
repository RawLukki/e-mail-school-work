package tp4EnPoo;

import java.util.ArrayList;

public class Messagerie {
	
	private String nomServ;
	private ArrayList<Message> listeMessages;
	private ArrayList<Client> listeClients;
	
	public Messagerie(String serv, ArrayList<Message> liste1,ArrayList<Client> liste2) {
		this.nomServ=serv;
		this.listeMessages=liste1;
		this.listeClients=liste2;
	}
	
	public void  ajoutClient(Client c) {
		this.listeClients.add(c);
	}
	
	public void ajoutMessage(Client c,Message m) {
		for(Client parcour:this.listeClients) {
			if(c == parcour) {				
				this.listeMessages.add(m);
			}
			System.out.println();
		}
		
	}
	
	public ArrayList<Client> listeClient(){
		return this.listeClients;
	}
	
	
	public ArrayList<Message> ListeMessages(){
		return this.listeMessages;
	}
		
	}
	
	
	

