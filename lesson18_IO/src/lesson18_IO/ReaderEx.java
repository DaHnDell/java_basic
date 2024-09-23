package lesson18_IO;

import java.io.FileReader;
import java.io.IOException;

public class ReaderEx {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("C:\\Users\\tj\\Desktop\\새 텍스트 문서.txt");
		int c = 0;
		int cnt = 0;
		while ((c = fr.read()) != -1) {
			System.out.println((char)(c));
			cnt++;
		}
		System.out.println(cnt + "글자 읽음");
		fr.close();
	}
}
