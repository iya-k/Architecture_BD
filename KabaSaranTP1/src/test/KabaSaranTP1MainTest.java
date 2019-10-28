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


package test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.Before;
import org.junit.Test;

import interfaces.KabaSaran_Interface_File;
import interfaces.KabaSaran_Interface_Nesteloop;
import kabaSaranTP1.KabaSaranTP1File;
import kabaSaranTP1.KabaSaranTP1Main;
import kabaSaranTP1.KabaSaranTP1NestedLoop;
import ressources.KabaSaranTP1_Configurator;

public class KabaSaranTP1MainTest {
	
final int N_ELT = 10;
	char[] tab;
	char[] r;
	KabaSaran_Interface_Nesteloop nl;
	KabaSaran_Interface_File f;
	KabaSaranTP1Main tp;
	KabaSaranTP1_Configurator conf;

	@Before
	public void setUp() throws Exception {
		
		tp = new KabaSaranTP1Main();
		nl = new KabaSaranTP1NestedLoop();
		f = new KabaSaranTP1File(N_ELT);
		conf = new KabaSaranTP1_Configurator();
	}

	@Test
	public void testKabaSaranTP1NestedLoop() {

		nl = new KabaSaranTP1NestedLoop();
	}

	@Test
	public void testLireFichier() throws IOException {

		Path target = Paths.get(conf.getFileR());
	    if (Files.exists(target)) {
			tab = f.lireFichier(conf.getFileR());
			assertNotNull("le tableau r", tab);
			assertEquals(tab.length, N_ELT);
	    }
	    else 
	    	throw new IOException("file doesn't exist");
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
	public void testArrayNestedLoop() {
		tab = nl.arrayNestedLoop(f.lireFichier(conf.getFileR()), f.lireFichier(conf.getFileR()));
		assertNotNull("le tableau est nul", tab);
		
	}
}
