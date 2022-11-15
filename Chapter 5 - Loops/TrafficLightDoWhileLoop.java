package chapter5_loops;

//Purpose: Print red light 5 times, green light 3 times, yellow light 1 time
public class TrafficLightDoWhileLoop {

	public static void main(String[] args) {
		// Print red light 5 times
		int redLightCount = 0;

		do {
			System.out.println("Red Light");
			redLightCount++;
		}while (redLightCount < 5);

		// Print green light 3 times
		int greenLightCount = 0;

		do{
			System.out.println("Green Light");
			greenLightCount++;
		}while (greenLightCount < 3);

		// Print yellow light 1 time

		int yellowLightCount = 0;

		do{
			System.out.println("Yellow Light");
			yellowLightCount++;
		}while (yellowLightCount < 1); 

	}

}
