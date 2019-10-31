
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

package test;
import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.Before;
import org.junit.Test;

import interfaces.*;
import kabaSaranTP2.*;
import resources.KabaSaranTP2_Configurator;


public class KabaSaranTP2_V2Test {
	final int N_ELT = 10;
	char[] tab;
	char[] r;
	KabaSaran_Interface_MergeDup mg;
	KabaSaran_Interface_File f;
	KabaSaranTP2_V2 tp;
	KabaSaranTP2_Configurator conf;

	@Before
	public void setUp() throws Exception {
		
		tp = new KabaSaranTP2_V2();
		mg = new KabaSaranTP2_MergeDup(N_ELT);
		f = new KabaSaranTP2File(N_ELT);
		conf = new KabaSaranTP2_Configurator();
	}
	
	@Test
	public void testJoin() {
		char[] arrayTest1 = new char[10];
		char[] arrayTest2 = new char[10];
		char[] arrayTestResultat = new char[10];
		
		arrayTest1[0] = 'A';
		arrayTest1[1] = 'B';
		arrayTest1[2] = 'G';
		arrayTest1[3] = 'J';	
		arrayTest1[4] = 'U';
		arrayTest1[5] = 'K';	
		arrayTest1[6] = 'E';
		arrayTest1[7] = 'Z';	
		arrayTest1[8] = 'V';
		arrayTest1[9] = 'B';
		
		arrayTest2[0] = 'B';
		arrayTest2[1] = 'U';
		arrayTest2[2] = 'E';
		arrayTest2[3] = 'K';	
		arrayTest2[4] = 'X';
		arrayTest2[5] = 'V';	
		arrayTest2[6] = 'N';
		arrayTest2[7] = 'B';	
		arrayTest2[8] = 'M';
		arrayTest2[9] = 'U';	
				
		arrayTestResultat[0] = 'B';
		arrayTestResultat[1] = 'B';
		arrayTestResultat[2] = 'B';
		arrayTestResultat[3] = 'B';	
		arrayTestResultat[4] = 'E';
		arrayTestResultat[5] = 'K';
		arrayTestResultat[6] = 'U';
		arrayTestResultat[7] = 'U';
		arrayTestResultat[8] = 'V';
		arrayTestResultat[9] = '\n';
		
		assertArrayEquals(arrayTestResultat, mg.join(arrayTest1, arrayTest2));
	
	}
	
	
	@Test
	public void testKabaSaranTP2Merge() {

		mg = new KabaSaranTP2_MergeDup(conf.getN_ELT());
	}
	
	@Test
	public void testEcrireFichier() throws IOException {

		Path target = Paths.get(conf.getFileS());
	    if (Files.exists(target)) {
			f.ecrireFichier(f.lireFichier(conf.getFileS()) , conf.getFileRS());
	    }
	    else throw new IOException("file doesn't exist");
	}
	
	@Test
	public void testLireFichier() throws IOException {

		Path target = Paths.get(conf.getFileR());
	    if (Files.exists(target)) {
			tab = f.lireFichier(conf.getFileR());
			assertNotNull("le tableau r", tab);
			assertEquals(tab.length, conf.getN_ELT());
	    }
	    else 
	    	throw new IOException("file doesn't exist");
	}

}
