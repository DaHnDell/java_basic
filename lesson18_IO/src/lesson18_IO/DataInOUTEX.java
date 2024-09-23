package lesson18_IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class DataInOUTEX {
	public static void main(String[] args) throws IOException {
		System.out.println(Math.PI);
		String pi = Math.PI + "";
		char[] pis = pi.toCharArray();
		
		FileWriter fw = new FileWriter("C:\\Users\\tj\\Desktop\\라이프오브파이.txt");
		fw.write(pis);
		fw.close();
		
		FileInputStream fis = new FileInputStream("C:\\Users\\tj\\Desktop\\라이프오브파이.txt");
		
		byte[] bs = fis.readAllBytes(); // 있는거 싹 다 바이트로 반환해서 배열에 넣어줌..!
		String s = new String(bs);
		System.out.println(Double.parseDouble(s)+1);
		
		fis.close();
		
		// 실제 데이터 더블의 한계는 8바이트인데 이것만을 가지고 하는 것
		
//		FileInputStream fis = new FileInputStream("C:\\Users\\tj\\Desktop\\라이프오브파이.txt");
//		
//		fos.write();
//		데이터를파일로 저장
//		파일로저장된 데이터를 읽어와서 확인
//		
	}
}
