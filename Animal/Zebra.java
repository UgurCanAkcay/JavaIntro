
package Animal;

public class Zebra extends Animal {

	public boolean is_wild;
	
	public Zebra(int age, String gender) {
		super(age, gender);
	}


	public void run(int x) { 
		
		int location=0; 
		location = location + x;
		System.err.println("New location : "+location);
	}
}