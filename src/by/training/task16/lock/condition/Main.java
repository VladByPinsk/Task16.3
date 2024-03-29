package by.training.task16.lock.condition;

public class Main {
	public static void main(String[] args) {
		Resource resource = new Resource();

		ExampleThread exampleThread1 = new ExampleThread(resource, 1);
		ExampleThread exampleThread2 = new ExampleThread(resource, 2);

		new Thread(exampleThread1).start();
		new Thread(exampleThread2).start();

		try {
			Thread.sleep(10000);
			exampleThread1.stopRunning();
			exampleThread2.stopRunning();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
