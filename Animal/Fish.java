package Animal;
public class Fish extends Animal{

	private int sizeInFt;
	private boolean canEat;
	
	public Fish() {
		// TODO Auto-generated constructor stub
	}
	
	public Fish(int age, String gender) {
		super(age, gender);
	}

	private void swim (int x) {
		int location=0; 
		location = location + x;
		System.err.println("New location : "+location);
	}
	
}