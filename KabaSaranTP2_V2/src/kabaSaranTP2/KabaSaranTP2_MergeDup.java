package kabaSaranTP2;

import java.util.Arrays;

import interfaces.KabaSaran_Interface_MergeDup;

/**
 * TP n°2 V n°1 :
 *
 * Titre du TP : Merge Duplicate
 *
 * Date : 25 octobre 2019
 *
 * Nom : KABA
 * Prénom : Saran
 * N° d'étudiant : 21605980
 *
 * email : skaba1606@gmail.com
 *
 * Remarques
 * 
 */


public class KabaSaranTP2_MergeDup implements KabaSaran_Interface_MergeDup {

	int nElt;
	int m = 0;

	char[] RS;

	public KabaSaranTP2_MergeDup(int n) {
		this.nElt = n;
	}	

	public  char[] join(char[] R, char[] S){
		RS = new char[nElt];
		int i, j, nbchar=0; 		// nbchar: indiquera le nombre d'Ã©lÃ©ments non vides

		i=j=0; 

		Arrays.sort(R);
		Arrays.sort(S);

		// Algorithme du Merge Join avec doublons:	
		while(i < R.length && j < S.length){
			if(R[i] == S[j]){
				//mergeDuplicate:
				int k = j;

				while(i < R.length && R[i] == S[j]){					
					while(j < S.length && R[i] == S[j]){
						RS[nbchar] = R[i];
						nbchar++;		
						j++;
					}					
					i++;
					j = k;
				}		
			}

			else if(R[i] > S[j])
				j++;

			else if(R[i] < S[j])
				i++;
		}

		RS[nbchar] = '\n';

		return RS;
	}


}
