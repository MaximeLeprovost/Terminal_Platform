
import java.io.*;
import java.util.*; 

public class Main {

	public static void main(String[] args) throws InterruptedException {
	

		Joueur j = new Joueur();
		Plateau p = new Plateau();		
		Scanner menu = new Scanner(System.in);


		System.out.println("Appuyer sur Entree pour commencer (CRTL+C pour quitter)");
		try {
			String menupartie = menu.nextLine();
		} catch (InputMismatchException e) {
			System.out.println("Erreur de caractere !");
			System.exit(0);
		}
		
		System.out.print(p);


			
	
		while(p.getAppartion()<30){

			p.apparition++;

			p.tab[56][j.posy]=0;
			
			Thread.sleep(20);

			p.deplacementPlatform();

			j.iaDeplacement();

			j.showDeplacement();

			p.tab[56][j.posy]=2;

			if(p.getAppartion() == 30){
				p.setAppartion(0);
				p.cleverRandom(j.posy);
				p.testLigne();
			}


			System.out.print(p);


		}

	}
}
