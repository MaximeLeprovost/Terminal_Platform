
import java.io.*; 

public class Main {

	public static void main(String[] args) throws InterruptedException {
	

		Joueur j = new Joueur();
		Plateau p = new Plateau();
		
		int test = 29;
		
			
				
		System.out.print(p);
			
	
		while(test<30){


		//j.iaDeplacement();
			p.tab[56][j.posy]=0;
			j.posy = 37;
			j.cleverRandom();

			test++;

			Thread.sleep(30);

			for (int x = 63; x > 0; x--) {
				for (int y = 0; y < 75; y++){

						p.tab[x][y] = p.tab[x-1][y];
						p.tab[x-1][y]=0;

					}
					
			}

			p.tab[56][j.posy]=2;
			


			if(test == 30){test = 0;
				p.testLigne();
			}

			System.out.print(p);


		}

	}
}
