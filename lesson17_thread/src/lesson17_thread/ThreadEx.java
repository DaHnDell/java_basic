package lesson17_thread;

public class ThreadEx extends Thread{
	public static void main(String[] args) {
		
		Thread t1 = new ThreadEx();
		Thread t2 = new Thread(new RunnableImpl());
		
		t2.setPriority(6);

		new ThreadExtend().start();
		new Thread(new RunnableImpl(), "러너블쓰레드").start(); // 무엇을 하던지 스타트로 호출하면 계속 무한정으로 호출 가능
		System.out.println("메인 종료" + Thread.currentThread().getName());
	}

class ThreadExtend extends Thread{
	@Override
	public void run() {
		System.out.println("Thread 상속");
		for(int i = 0; i < 50; i++) {
			System.out.println("쓰레드 상속 : " + i);
		}
	}
}

class RunnableImpl implements Runnable  {
	@Override
	public void run() {
		System.out.println("러너블 구현");
		for(int i = 0; i < 500; i++) {
			System.out.println("Runnable 구현" + i);
		}
	}
	}
}

// 우선순위의 설정은 그저 중요도의 가중치로 이해하면 될듯.