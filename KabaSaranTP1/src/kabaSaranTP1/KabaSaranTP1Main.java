package kabaSaranTP1;

import interfaces.KabaSaran_Interface_File;
import interfaces.KabaSaran_Interface_Nesteloop;
import ressources.KabaSaranTP1_Configurator;

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

public class KabaSaranTP1Main {
	
	

	public static void main(String[] args) {

		KabaSaranTP1_Configurator conf = new KabaSaranTP1_Configurator();
		KabaSaran_Interface_Nesteloop nl = new KabaSaranTP1NestedLoop();
		KabaSaran_Interface_File f = new KabaSaranTP1File(KabaSaranTP1_Configurator.getN_ELT());
		KabaSaranTP1Main moi = new KabaSaranTP1Main();
		
		System.out.println("Ecriture dans le fichier RS ");
		f.ecrireFichier(nl.arrayNestedLoop(f.lireFichier(conf.getFileR()), f.lireFichier(conf.getFileS())), conf.getFileRS());
	}

}
