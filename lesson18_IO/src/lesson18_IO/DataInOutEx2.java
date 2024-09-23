package lesson18_IO;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataInOutEx2 {
	public static void main(String[] args) throws IOException {
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("C:\\Users\\tj\\Desktop\\라이프오브파이2.txt")); // 적당한 형태의 기본데이터타입만큼 기록할 수 있고 
//		dos.writeDouble(Math.PI);
		dos.writeInt(10);
		// 만약 
		dos.close();
		
		DataInputStream dis = new DataInputStream(new FileInputStream("C:\\Users\\tj\\Desktop\\라이프오브파이2.txt")); // 적당한 형태의 기본데이터타입만큼 읽어올 수 있다. 차이가 나면 EOF 문제가 발생;
		int d = dis.readInt();
		System.out.println(d);
		
		
		dis.close();
		// 00 04 뒤에 오는 글자들은 UTF 8이다 라는 구분선
		
		
	}
}
