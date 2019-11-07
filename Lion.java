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
