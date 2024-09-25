package lesson11_exeption;

import java.io.FileOutputStream;
import java.io.IOException;

public class ExceptionEx09 {
	public static void main(String[] args) {
		
		try(FileOutputStream fos =  new FileOutputStream("1.txt")) {
//			fos = new FileOutputStream("1.txt");
			byte[] bs = {'A', 'B', 'C', 'D', 'E', 234 - 256, 176 -256, 144-256};
			fos.write(bs);
		}
		catch (IOException e) {
			e.printStackTrace();
		} // try 다음에 썼으면 알아서 close를 해준다..
//		finally {
//			try {
//				fos.close();	// 반납 제어문 ; 			
//			}
//			catch(IOException e) {
//				e.printStackTrace();
//			}
//		}	
	}
}
