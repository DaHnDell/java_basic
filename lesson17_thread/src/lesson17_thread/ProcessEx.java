package lesson17_thread;

import java.io.IOException;

public class ProcessEx {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException, InterruptedException {
		Process p1 = Runtime.getRuntime().exec("notepad");
		Process p2 = Runtime.getRuntime().exec("mspaint");
		
		p1.waitFor(); // 메모장만 닫아도 그림판이 같이 닫혀버림!!! , 즉 메모장의 수행이 끝날 때까지 대기하는 것.
		p2.destroy();
		
		// 멀티프로세스라 자바가 실행해주고 있음.
		// 위 두 메서드 없이는 둘 다 연관이 없어짐.
		
	}
}
