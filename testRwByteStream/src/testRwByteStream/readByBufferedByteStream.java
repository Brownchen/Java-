package testRwByteStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class readByBufferedByteStream {

	public static void main(String[] args) {
     try {
		FileInputStream fis = new FileInputStream("MP4.mp4");
		 BufferedInputStream bis = new BufferedInputStream(fis,10000);
		 FileOutputStream fos = new FileOutputStream("MP4_NEW.mp4");
		 BufferedOutputStream bos = new BufferedOutputStream(fos);
		 
 		 byte input[] = new byte[100000];
		 int count = 0;
		 long  before = System.currentTimeMillis();
		 while(bis.read(input) != -1){
			 count++;
		 }
		 bis.close();                //先打开的后关闭
		 fis.close();                //后打开的先关闭
		 bos.close();
		 fos.close();
		 System.out.println("读取了"+count+"次");
		 System.out.println(System.currentTimeMillis()-before+"ms");
		 
		 
		 
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
	}

}
