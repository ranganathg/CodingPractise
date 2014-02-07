package rangag.practise.sfint;

class Runner extends Thread {
	public void run() {
		run10Times();
	}

	private void run10Times() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Hello " + i + " from Thread"
					+ Thread.currentThread().getId());
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class RunnableRunner implements Runnable
{

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Hello " + i + " from Thread"
					+ Thread.currentThread().getId());
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
public class ThreadingPraactise {
	public static void main(String[] args) {
/*		Runner r1 = new Runner();
		r1.start();
		Runner r2 = new Runner();
		r2.start();*/
		Thread t = new Thread(new RunnableRunner());
		Thread t2 = new Thread(new RunnableRunner());
		t.start();
		t2.start();
	}
}
