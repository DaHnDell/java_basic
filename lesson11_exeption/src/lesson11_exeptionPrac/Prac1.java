package lesson11_exeptionPrac;

import java.io.FileOutputStream;
import java.io.IOException;

public class Prac1 {
	public static void main(String[] args) {
		FileOutputStream fos = (null);
		try {
			fos = new FileOutputStream("1.txt");
			byte[] bs = {'A', 'B', 'C', 'D', 'E', 234 - 256, 176 -256, 144-256};
			fos.write(bs);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				fos.close();	// 반납 제어문 ; 			
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}	
	}

}
