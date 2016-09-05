package testRwByteStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Logger;

public class readByteStream {

	public static void main(String[] args) {
      try {
		FileInputStream fis = new FileInputStream("text.txt");  //流的打开
		byte input[] = new byte[16];
		fis.read(input);                                        //流的读取
		fis.close();                                            //流的结束
		
		String inputString = new String(input, "UTF-8");
		System.out.println(inputString);
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      
	}

}
