
public class BasicThreads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Thread t = new Thread(new LiftOff());
       t.start();
      System.out.print("Waiting for LiftOff");
	}

}
