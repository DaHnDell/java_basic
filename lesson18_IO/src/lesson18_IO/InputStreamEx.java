package lesson18_IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputStreamEx {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\tj\\Desktop\\새 텍스트 문서.txt");
		FileOutputStream fos = new FileOutputStream("C:\\Users\\tj\\Desktop\\복사 텍스트 문서.txt");
		
//		int i = fis.read();
//		System.out.println(i);
//		i = fis.read();
//		System.out.println(i);
		
		int i = 0;
		int cnt = 0;
		
		while((i = fis.read()) != -1) {
			System.out.println((char)i + " : : : " + i);
			fos.write(i);
			cnt ++;
			System.out.println(cnt);
		}
		fis.close();
		fos.close();
	}
}
