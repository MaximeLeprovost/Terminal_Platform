import java.util.*;

public class Joueur extends Plateau{


	public int posy = 37;
	int posytarget = 37;



	Joueur() {

		posy = 37;

	}


	public void iaDeplacement() {

		int debutobj = 0;
		int finobj = 0;
		boolean extremite = false;
			
			if(tab[56-29][posy]==1){


				for (int i = 0; i < (75);i++) {
					
					if (tab[56-29][0]==1) {
						debutobj = 1;
						extremite = true;
						//posy = 20;
						//break; 
					}else{

					if ((tab[56-29][i] == 1)&&(tab[56-29][i-1] == 0)) {
						debutobj = i;
					}
				}


					if (tab[56-29][73]==1) {
						finobj = 72;
						extremite = true;
						//posy = 20;
						//break; 

					}else{

					if (((tab[56-29][i] == 1)&&(tab[56-29][i+1] == 0))){
						finobj = i;
					}
				}
				}

				if (extremite) {
					posytarget = 37;
					
				} else{
				if ((posytarget - debutobj) < (finobj - posytarget)) {
					posytarget = debutobj-1;
					
				}else{

					posytarget = finobj+1;
				}

			}
		}
	}

	public void showDeplacement() {

			if(posy < posytarget){
				posy++;
			}

			if(posy > posytarget){
				posy--;
			}
	}

	public void hideDeplacement() {


		int abs = (int)(Math.random() * (55-0));
		for (int i = abs; i < (abs+20);i++ ) {
				tab[0][i]=0;
			}
	}


}
