import java.util.*;

public class Plateau {


	protected static int[][] tab;
	public int posmax;
	public int posmin;
	int apparition = 29;
	

	Plateau() {

		tab = new int[64][75];

		for (int x = 0; x < 64; x++) {
			for (int y = 0; y < 75; y++){
				tab[x][y] = 0;
				}
			}
	}


	public String toString() {
		String str = "";
		
		for (int x = 63; x > -1; x--) {

			str += "" + (x-1 + 1);
			if(x<10){str += "  ";}
			else{str += " ";}
			str += "|";

			for (int y = 0; y < 74; y++) {

				if (tab[x][y] == 2) {
				 	str += "^";
				 }else{
				 if (tab[x][y] == 1) {
				 	str += "+";
				 } else{ str += " ";}
				}
				str += " ";
			}
			str += "|";
			str += "\n";
		}

		return str;

	}

	public void cleverRandom(int posy) {
		
		if (posy>55) {
			posmax=55;
		}else{
			posmax = posy;
		}

		if (posy<19) {
			posmin=0;
		}else{
			posmin = posy - 19;
		}
	
	}

	public void testLigne() {

		int abs = (int)(Math.random() * (posmax-1-posmin)) + posmin;
		
		for (int i = abs; i < (abs+20);i++) {
				tab[0][i]=1;
			}
	}

	public void deplacementPlatform() {

		for (int x = 63; x > 0; x--) {
				for (int y = 0; y < 75; y++){

						tab[x][y] = tab[x-1][y];
						tab[x-1][y]=0;

					}
			}
	}

	public void setAppartion(int value) {

		apparition = value;

	}



	public int getAppartion() {

		return apparition;

	}


}
