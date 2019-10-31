
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

package resources;

public class KabaSaranTP2_Configurator {

	private static int N_ELT = 10;

	
	static String fileR = "./src/resources/R.txt";

	static String fileS = "./src/resources/S.txt";
	
	static String fileRS = "./src/resources/RS.txt";

	public String getFileRS() {
		return fileRS;
	}

	public void setFileRS(String fileRS) {
		KabaSaranTP2_Configurator.fileRS = fileRS;
	}

	public String getFileR() {
		return fileR;
	}

	public static void setFileR(String fileR) {
		KabaSaranTP2_Configurator.fileR = fileR;
	}

	public String getFileS() {
		return fileS;
	}

	public void setFileS(String fileS) {
		KabaSaranTP2_Configurator.fileS = fileS;
	}

	public  int getN_ELT() {
		return N_ELT;
	}

	public void setN_ELT(int n_ELT) {
		N_ELT = n_ELT;
	}

}
