package chapter4_MathFuc;

//Purpose: Explore the basic features of the character.
public class TestCharacter {

	public static void main(String[] args) {
		int i = 0;
		char j ='0';
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(j==i);
		System.out.println(j-i);//When character meet any integer
								// they convert to integers --> take out their coding value.
		System.out.println(Character.getNumericValue(j)==i);

		

	}

}
