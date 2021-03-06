package tp4EnPoo;

import java.util.ArrayList;

public class Essai {
	
	public static void main(String []Args) {
		
		Client Arthur = new Client("Arthur");
		Client Timochut = new Client("Timochut");
		
		Message message1 = new Message(Arthur,Timochut,"On est là poto");
		Message message1Bis = new Message(Arthur,Timochut,"Dis moi où tu es stp ");
		Message message2 = new Message(Timochut,Arthur,"Je suis à Sarcelles, je règle deux trois choses et j'arrive");
		
		
		ArrayList<Message> lstMessage1= new ArrayList<Message>();
		ArrayList<Client> lstClient1= new ArrayList<Client>();
		
		Messagerie Gmail = new Messagerie("Gmail",lstMessage1,lstClient1);		
		Gmail.ajoutClient(Arthur);
		Gmail.ajoutClient(Timochut);
		
		System.out.println("Les personnes enregistrés sur le serveur sont : " + Gmail.listeClient());
		
		Arthur.envoiMessage(Gmail, Arthur, message1);
		Arthur.envoiMessage(Gmail, Arthur, message1Bis);
		System.out.println(Gmail.ListeMessages());
		
		Timochut.envoiMessage(Gmail, Timochut, message2);
		System.out.println(Gmail.ListeMessages());
		
		System.out.println(Timochut.recupMessage(Timochut, lstMessage1));

	}

}
