//package lesson18_IO;
//
//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.Arrays;
//
//public class InputStreamEx3 {
//	public static void main(String[] args) throws IOException {
//		FileInputStream fis = new FileInputStream("C:\\Users\\tj\\Desktop\\새 텍스트 문서.txt");
//		InputStreamReader isr = new InputStreamReader(fis, "ms949");
//		byte[] bytes = new byte[5];
//		System.out.println(fis.available());
//		
//		FileOutputStream fos = new FileOutputStream("C:\\Users\\tj\\Desktop\\복사 텍스트 문서2.txt");
//		int i = 0;
//		while((i = fis.read(bytes)) != -1) {
//			// 바이트 배열이라 원래 있던 값이 남아져 있음.
//			fos.write(bytes, 0, i ); // 0번부터 i번째까지~~
//			cnt ++;
//			
//		}
//		fis.close();
//		fos.close();
//	}
//}
