package kabaSaranTP1;

import interfaces.KabaSaran_Interface_Nesteloop;

/**
* TP n°1 V n°1 :
*
* Titre du TP : Array Nested Loop
*
* Date : 19 octobre 2019
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


public class KabaSaranTP1NestedLoop implements KabaSaran_Interface_Nesteloop {
	
	@Override
	public char[] arrayNestedLoop(char[] R, char[] S){
	
		int k = 0, taille = 1;
		
		char []ret  = new char[taille];
		char[] tCopy = null;
		for(int i = 0; i < R.length; i++){
			for(int j = 0; j < S.length; j++){
				
				if(R[i] == S[j]){

					ret[k] = R[i];
					
					tCopy = ret;
					
					ret = new char [++taille];
					
					for(int a = 0; a < taille - 1; a++)
						ret[a] = tCopy[a];
					
					k++;
				}
			}
		}
		
		return tCopy;
	}
	
	public static void help() {
		System.out.println("------------------------------------------------------------------------------------------ ");
		System.out.println("|  Usage: java KabaSaranTP1_V1 chemin_fichier1.txt chemin_fichier2.txt -taille <chiffre>  |");
		System.out.println("------------------------------------------------------------------------------------------ ");

	}
	
}
