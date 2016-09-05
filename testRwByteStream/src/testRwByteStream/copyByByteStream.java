package testRwByteStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class copyByByteStream {

	public static void main(String[] args) {

		try {
			FileInputStream fis = new FileInputStream("ABC.jpg");         //括号里的参数指定了读取的目标
			FileOutputStream fos = new FileOutputStream("ABC_new.jpg");   //这里括号指定的时读取后写入的地方
			
			byte input[] = new byte[50];
			while(fis.read(input) != -1){                                 //读取后放在input字符数组里
			fos.write(input);                                             //从input字符数组中拿出来写入指定地方
			}
			fis.close();
			fos.close();
			System.out.println("done");
			
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
