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

package kabaSaranTP2;

import interfaces.KabaSaran_Interface_File;
import resources.KabaSaranTP2_Configurator;

public class KabaSaranTP2_V2 {

	public static void main(String[] args) {
		

		KabaSaranTP2_Configurator conf = new KabaSaranTP2_Configurator();
		KabaSaranTP2_MergeDup md = new KabaSaranTP2_MergeDup(conf.getN_ELT());
		KabaSaran_Interface_File f = new KabaSaranTP2File(conf.getN_ELT());
		
		f.ecrireFichier(f.lireFichier("\0"), conf.getFileRS());
		System.out.println("Fichier RS Vide");
		
		System.out.println("Ecriture dans le fichier RS !!! ");
		f.ecrireFichier(md.join(f.lireFichier(conf.getFileR()), f.lireFichier(conf.getFileS())), conf.getFileRS());
		
		System.out.println("Ecriture dans RS terminer !!! ");
	

	}

}
