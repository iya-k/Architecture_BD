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


package ressources;

public class KabaSaranTP1_Configurator {

	private static int N_ELT = 10;

	
	static String fileR = "./src/ressources/R.txt";

	static String fileS = "./src/ressources/S.txt";
	
	static String fileRS = "./src/ressources/RS.txt";

	public String getFileRS() {
		return fileRS;
	}

	public void setFileRS(String fileRS) {
		KabaSaranTP1_Configurator.fileRS = fileRS;
	}

	public String getFileR() {
		return fileR;
	}

	public static void setFileR(String fileR) {
		KabaSaranTP1_Configurator.fileR = fileR;
	}

	public String getFileS() {
		return fileS;
	}

	public void setFileS(String fileS) {
		KabaSaranTP1_Configurator.fileS = fileS;
	}

	public static int getN_ELT() {
		return N_ELT;
	}

	public static void setN_ELT(int n_ELT) {
		N_ELT = n_ELT;
	}

}
