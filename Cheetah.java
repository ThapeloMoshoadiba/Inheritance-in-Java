/*

14 September 2019; Thapelo Moshoadiba
Introduction to programming Task 11.2

● Create a class called ‘Cheetah’ that:
  ○ Inherits from the Animal class.
  ○ Makes use of at least one static field (AKA static variable/method [it's a variable in a class that can only be utilized in that class and can't be accessed another class])
    which needs to have a static setter (methods used to set data i.e. give value to variable) and getter (methods used to get data i.e. where you'll put the return statements).
    # This is just long-winded, in my opinion
  ○ Contains a constructor.
  ○ Contains a toString() method.
  ○ Has an array as one of it’s fields (variables).

*/

package inheritence;

import java.util.ArrayList;
import java.util.List;

public class Cheetah extends Animal {

	public Cheetah(int numTeeth, boolean spots, int weight, int numberOfJanCheetahsFromUser, int numberOfMayCheetahsFromUser) { // a parameterised constructor
		super(numTeeth, spots, weight);
		
		
		setJanuaryNumber (numberOfJanCheetahsFromUser);
		setMayNumber (numberOfMayCheetahsFromUser);
		monthlyCheetahPop (); // calling the array method
		
	}
	
	static int january; // a static variable/field
	int may;
	int september;
	int december;
	
	public static void setJanuaryNumber (int janNumFromConstructor) { // a static setter field/method
		
		january = janNumFromConstructor;
		
	}
	
	public static int getJanuaryNumber () { // a static getter method
		
		return january;
		
	}
	
	public void setMayNumber (int mayNumFromConstructor) {
		
		this.may = mayNumFromConstructor;
		
	}
	
	public String toString() { // a toString method
		
		String cheetahPopSoFar = "The cheetah population in January was: " + getJanuaryNumber () + "\n";
		cheetahPopSoFar += "The cheetah population in May was: " + may + "\n";
		cheetahPopSoFar += "The cheetah population in September is: " + september + "\n";
		cheetahPopSoFar += "The cheetah population in December will be: " + december + "\n";
		
		return cheetahPopSoFar;
		
	}
	
	int [] monthlyCheetahPop = new int [4]; // array field created
	
	public void monthlyCheetahPop () {
		
		monthlyCheetahPop [0] = january;
		monthlyCheetahPop [1] = may;
		monthlyCheetahPop [2] = september;
		monthlyCheetahPop [3] = december;
		
		// an array cannot be printed so a list must be made so that that can be printed
		
		List <Integer> list = new ArrayList <Integer> (); // creating a list to hold integers
		
		for (int i = 0; i < monthlyCheetahPop.length; i++) {
			
				list.add(monthlyCheetahPop[i]); // adding elements to a list
		
		}
		
		System.out.println("The cheetah populations for January, May, September, and December are as follows, respectively: " + list + "\n"); // printing the list
		
	}
	
	
}

//for main method refer to the User.java file