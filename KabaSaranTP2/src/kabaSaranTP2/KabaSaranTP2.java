
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
import kabaSaranTP2.KabaSaranTP2File;

import resources.KabaSaranTP2_Configurator;

public class KabaSaranTP2 {

	public static void main(String[] args) {
		
		KabaSaranTP2_Configurator conf = new KabaSaranTP2_Configurator();
		KabaSaranTP2_MergeDup md = new KabaSaranTP2_MergeDup(conf.getN_ELT());
		KabaSaran_Interface_File f = new KabaSaranTP2File(KabaSaranTP2_Configurator.getN_ELT());
		KabaSaranTP2 moi = new KabaSaranTP2();
		
		System.out.println("Ecriture dans le fichier RS ");
		f.ecrireFichier(md.join(f.lireFichier(conf.getFileR()), f.lireFichier(conf.getFileS())), conf.getFileRS());
	
		
	}

}
