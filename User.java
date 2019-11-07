package inheritence;

import java.util.Scanner;

public class User {

	public static void main(String[] args) {
		
		// To do with the lion
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the weight of the lion to determine what type it is: \n");
		int lionWeight = reader.nextInt();
		
		Lion lionObj = new Lion (23, true, lionWeight); // object creation and calling of the Lion constructor in the Lion Class; setting values
		
		System.out.println(lionObj);
		
		
		
		// To do with the cheetah
		
		System.out.println("Enter the number of teeth a cheetah has: \n");
		int cheetahTeeth = reader.nextInt();
		
		System.out.println("Enter the number of cheetahs present in January: \n");
		int janChNum = reader.nextInt();
		
		System.out.println("Enter the number of cheetahs present in May: \n");
		int mayChNum = reader.nextInt();
		
		Cheetah CheetahObj = new Cheetah (23, true, cheetahTeeth, janChNum, mayChNum); // object creation and calling of the Cheetah constructor in the Cheetah Class; setting values
		
		System.out.println(CheetahObj);
		
		reader.close();
		
	}

}
