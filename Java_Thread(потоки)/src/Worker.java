 
public class Worker implements Runnable {

	public void run() {
		for(int i=0;i<2000;i++){
			Main.increceNumber(); //метод будет вызываться 2000 раз
		}


	}

}
