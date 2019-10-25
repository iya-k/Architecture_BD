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
	public KabaSaranTP2_MergeDup(int n) {
		this.nElt = n;
	}	

	@Override
	public char[] join(char[] R, char[] S){

		int i = 0, j = 0; m = 0;
		
		Arrays.sort(R);
		Arrays.sort(S);
		/*
		for(int r = 0; r < nElt; r++) 
			System.out.println(R[r]+":"+S[r]);
		*/
		char []ret  = new char[nElt];

		while(i < nElt && j < nElt){
			System.out.println(j+":"+i);
			System.out.println(R[i]+":"+S[j]);
				if(R[i] < S[j]){
					i++;
				}
				else if(R[i] > S[j]){
					j++;
				}
				else{
					for(int l = 0; l < j; l++) {
						if(R[i] == S[l])
							System.out.println("Match:"+R[i]);
					}
					//mergeDup(i, j, R, S, ret);
					
					j++;
				}
			}

		return ret;
	}
	
	public void mergeDup(int i, int j, char[] R, char[] S, char[] ret) {
		int k = j;
		
		while (i < nElt && R[i] == S[j]) {
			while (j < nElt && R[i] == S[j]) {
				while(R[i] == S[j]) {
					ret[m] = R[i] ;
					m++;
					j++;
				}
			}
			i++;
			j = k;
		}
		System.out.println("fin mergeDup");
	}


}
