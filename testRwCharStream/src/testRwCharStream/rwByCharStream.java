package testRwCharStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;


public class rwByCharStream {

	public static void main(String[] args) {
       try {
		//File file = new File("java.txt");
		   FileInputStream fis = new FileInputStream("java.txt");
		   FileOutputStream fos = new FileOutputStream("java_new.txt");
		   InputStreamReader isr = new InputStreamReader(fis,"UTF-8");
		   OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
		   char input[] = new char[100];
		   int l = 0;
           while((l=isr.read(input)) != -1){
        	  // System.out.println(new String(input,0,l));
        	   osw.write(input,0,l);
           }
           isr.close();
           fis.close();
           osw.close();
           fos.close();
		   
		   
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
	}

}