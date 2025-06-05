package javaprojects;
abstract class Car1{
	abstract void start();
	public void stop() {
		System.out.println("the car is stopped");
	}
}
class Speakers extends Car1{
	void start() {
		System.out.println("Listining music");
	}
}
class Seat extends Car1{
	void start() {
		System.out.println("The passenger wearing seatbelt");
	}
}
class Drive extends Car1{
	void start() {
		System.out.println("driving the car using stering");
	}
}

public class AbstarctClassEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Speakers sp=new Speakers();
		sp.start();
		Seat s=new Seat();
		s.start();
		Drive d=new Drive();
		d.start();

	}

}
