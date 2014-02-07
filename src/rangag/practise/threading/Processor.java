package rangag.practise.threading;

public class Processor implements Runnable {
	public Processor(int id) {
	}

	@Override
	public void run() {
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("hello "+Thread.currentThread().getId());
	}
}
