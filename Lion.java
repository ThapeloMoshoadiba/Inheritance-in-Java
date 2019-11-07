/*

14 September 2019
Thapelo Moshoadiba
Introduction to programming Task 11.1

● Add a field (i.e. method or variable) for lion type.
● Add a method in this class which sets the lion type based on it’s weight (note that the weight is a derived field from the superclass).
● If their weight is less than 80kg, it’s type should be a cub. If less than 120kg, it should be female. And if greater than 120kg.

*/

package inheritence;

public class Lion extends Animal {

	public Lion (int numTeeth, boolean spots, int weight) { // this is a constructor and it expects all those values when it gets called
		
		super (numTeeth, spots, weight); // here we're calling the super class and we're giving it those values (specified in the super class)
		
		setLionType(); // call the method below
	
	}
	
	String typeLion; // a field/variable for lion type has been set
	
	void setLionType () {
		
		if (this.getWeight() <= 80 ) {
			
			typeLion = "Cub";
			
		} else if (this.getWeight() <= 120 && this.getWeight() > 80) {
			
			typeLion = "Adult Female";
			
		} else if (this.getWeight() > 120) {
			
			typeLion = "Adult Male";
			
		}
		
	}
	
	public String toString() {
		
		String type = "The lion type is: " + typeLion + "\n";
		
		return type;
		
	}

}
//for main method refer to the User.java file