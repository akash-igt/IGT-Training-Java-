
class P extends Thread
{
	public void run()
	{
		for (int i = 0; i <= 10; i++) {
			try {
				System.out.println("I : "+i);
				Thread.sleep(1000);
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		}
	}
}
class Q extends Thread
{
	public void run()
	{
		for (int j = 0; j <= 10; j++) {
			try {
				System.out.println("        J : "+j);
				Thread.sleep(1000);
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		}

	}
}
class R extends Thread
{
	public void run()
	{
		for (int k = 0; k <= 10; k++) {
			try {
				System.out.println("                K : "+k);
				Thread.sleep(1000);
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		}

	}
}
public class Demo6 {
	public static void main(String[] args) {
		P p=new P();
		Q q=new Q();
		R r=new R();
		p.start();
		q.start();
		r.start();
		
	}

}
