package chapter5_loops;

//Purpose: Simulate five cycle of the traffic light:
//			print red light --> 5 times
//			print green light --> 3 times
//			print yellow light --> 1 time
//			(Using for loop)

public class RepetiveTrafficLight {

	public static void main(String[] args) {

		for(int i=0;i<5;i++) {
			// 1. Print red light --> 5 times
			for (int redLightCount = 0; redLightCount < 5; redLightCount++) {
				System.out.println("Red Light");
				// Inside the loop block
//				System.out.println(redLightCount);
			}
	
			// 2. Print green light --> 3 times
			for (int greenLightCount = 0; greenLightCount < 3; greenLightCount++) {
				System.out.println("Green Light");
			}
	
			// 3. Print yellow light --> 1 time
			for (int yellowLightCount = 0; yellowLightCount < 1; yellowLightCount++) {
				System.out.println("Yellow Light");
			}
		}
	}

}
