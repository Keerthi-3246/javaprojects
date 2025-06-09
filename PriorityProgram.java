package javaprojects;

public class PriorityProgram {

	public static void main(String[] args) {
		Thread lowPriorityThread=new Thread(()->{
			for(int i=1;i<=5;i++) {
				System.out.println("Low priority Thread"+i);
			}
		});
		Thread highPriorityThread=new Thread(()->{
			for(int i=1;i<=5;i++) {
				System.out.println("High priority Thread"+i);
			}
		});
		lowPriorityThread.setPriority(Thread.MIN_PRIORITY);
		highPriorityThread.setPriority(Thread.MAX_PRIORITY);
		
		lowPriorityThread.start();
		highPriorityThread.start();
	}

}
