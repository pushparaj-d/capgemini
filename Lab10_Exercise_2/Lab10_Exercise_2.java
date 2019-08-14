package Lab10_Exercise_2;

public class Lab10_Exercise_2 implements java.lang.Runnable{

    @Override
    public void run() {
        this.runTimer();
    }

    public void runTimer(){
        int i = 10;
         while (i>0){
          System.out.println("Remaining: "+i+" seconds");
          try {
            i--;
            Thread.sleep(1000L);    // 1000L = 1000ms = 1 second
           }
           catch (InterruptedException e) {
           }
         }
    }
    public static void main(String[] args) {
    	Thread t1= new Thread();
    	t1.start();
	}

}