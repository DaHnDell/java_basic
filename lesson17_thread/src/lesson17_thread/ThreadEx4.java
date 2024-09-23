package lesson17_thread;

public class ThreadEx4 {
	public static void main(String[] args) throws InterruptedException {
		Counter c = new Counter(); // 공용 데이터를 공유 자원으로서 사용하기 때문
		
//		c.increase();
//		System.out.println(c.i);
		
		T t1 = new T(c);
		T t2 = new T(c);
		
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(c.i);
	}
}

class Counter{
	public int i;
	void increase() {
		synchronized (this) {
			for(int i = 0; i<100000; i++) {
				this.i++;	
			}
		}
	}
}

class T extends Thread{
	Counter c; 
	T(Counter c) {
		this.c = c;
	}
	public void run() {
		c.increase();
	}
}