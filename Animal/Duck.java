package Animal;

public class Duck extends Animal{

	public String beakColor = "yellow";
	public Duck() {
	}
	public Duck(int age, String gender) {
		super(age, gender);
	}
	public void swim(int x) { 
		int location=0; 
		location = location + x;
		System.err.println("New location : "+location);
		}
	public void quack() {
		System.out.println("quack quack");
	}
}

