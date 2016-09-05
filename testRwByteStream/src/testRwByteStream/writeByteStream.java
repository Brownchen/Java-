package testRwByteStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class writeByteStream {
	public static void main(String[] args){
    try {
		FileOutputStream fos = new FileOutputStream("textw.txt");     //流的打开
		String outputString = "写入字符流";                            
		byte output[] = outputString.getBytes("UTF-8");               
		fos.write(output);                                            //流的写入
		fos.close();                                                  //流的关闭
		
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    
	}
}
