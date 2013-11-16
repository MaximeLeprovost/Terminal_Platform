import java.util.*;

public class Plateau {


	protected static int[][] tab;
	int posmax;
	int posmin;
	

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

	public void testLigne() {

		//int random = (int)(Math.random() * (higher-lower)) + lower;
		int abs = (int)(Math.random() * ((posmax+30)-(posmax)));
		for (int i = abs; i < (abs+20);i++) {
				tab[0][i]=1;
			}
	}

	public void testLigneG() {


		for (int i = 0; i < (75);i++ ) {
				tab[0][i]=1;
			}
	}


}
