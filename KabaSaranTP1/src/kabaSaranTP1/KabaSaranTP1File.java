package kabaSaranTP1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import interfaces.KabaSaran_Interface_File;

public class KabaSaranTP1File implements KabaSaran_Interface_File {
	
int nElt;
	
	public KabaSaranTP1File(int n){
		nElt = n;
	}
	
	@Override
	public char[] lireFichier(String fR){
		char[] t  = new char[nElt];
		try{
			String ligne;
			InputStream isR = new FileInputStream(fR);
			InputStreamReader isrR = new InputStreamReader(isR);
			BufferedReader bfR = new BufferedReader(isrR);
			
			int i = 0;
			while(((ligne = bfR.readLine()) != null) && i < nElt){
				t[i] = ligne.charAt(0);
				i++;
			}
			
			isR.close();
			isrR.close();
			bfR.close();
		}
		catch (Exception e){
			System.out.println(e.toString());
		}
		return t;
	}
	
	@Override
	public void ecrireFichier(char[] out, String path){

		try{
			
			PrintWriter writer = new PrintWriter(path);
			int i = 0;
			while(i < out.length){
				writer.println(out[i]);
				writer.flush();
				i++;
			}
			
			writer.close();
		}
		catch (Exception e){
			System.out.println(e.toString());
		}
	}

}
