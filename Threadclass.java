class Processor extends Thread {
	public void run()
	{
		System.out.println("Hello All");
	}
}

public class Main{
	public static void main(String[] args)
	{
		for (int i = 0; i < 5; i++) {
			Processor p= new Processor();
			p.start();
		}
	}
}
