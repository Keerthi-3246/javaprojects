package javaprojects;

class Car implements Runnable{
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Car is moving " + i);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            	
            }
        }
    }
}

class Bike implements Runnable{
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Bike is moving " + i);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            	
            }
        }
    }
}

public class Race {
    public static void main(String[] args) {
        // Creating and starting Ca r thread
    	Thread caThread=new Thread(new Car());
    	Thread baThread=new Thread(new Bike());
    	

        caThread.start();
        baThread.start();

      
    }
}
