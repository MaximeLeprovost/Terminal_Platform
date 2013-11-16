import java.util.*;

public class Joueur extends Plateau{


	int posy = 37;
	int posytarget = 0;



	Joueur() {

		posy = 37;

	}


	public void iaDeplacement() {

		int debutobj = 0;
		int finobj = 0;
			
			if(tab[56-30][posy]==1){


				for (int i = 0; i < (75);i++) {
					if (tab[56-30][i] == 1) {
						debutobj = i;
					}

					if (tab[56-30][i] == 0) {
						finobj = i-1;
					}
				}

				if ((debutobj - posy) > (posy - finobj)) {
					posy = debutobj -1;
					
				}else{

					posy = debutobj +1;
				}


				posy++;
				tab[56][posy-1]=0;

			}
	}

	public void cleverRandom() {

		posmax = posy;
		posmin = posy - 10;
	}

	public void showDeplacement() {


		int abs = (int)(Math.random() * (55-0));
		for (int i = abs; i < (abs+20);i++ ) {
				tab[0][i]=0;
			}
	}

	public void hideDeplacement() {


		int abs = (int)(Math.random() * (55-0));
		for (int i = abs; i < (abs+20);i++ ) {
				tab[0][i]=0;
			}
	}


}
