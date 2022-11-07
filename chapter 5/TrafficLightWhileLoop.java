package chapter5_loops;

//Purpose: Print red light 5 times, green light 3 times, yellow light 1 time
public class TrafficLightWhileLoop {

	public static void main(String[] args) {
		//Print red light 5 times
		int redLightCount = 0;
		
		while(redLightCount<5) {
			System.out.println("Red Light");
			redLightCount++;
		}
		
		
		//Print green light 3 times
		int greenLightCount = 0;
		
		while(greenLightCount<3) {
			System.out.println("Green Light");
			greenLightCount++;
		}
		
	
		//Print yellow light 1 time
		
		int yellowLightCount = 0;
		
		while(yellowLightCount<1) {
			System.out.println("Yellow Light");
			yellowLightCount++;
		}
		
		
	}

}
