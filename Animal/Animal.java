/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Animal;

public class Animal {

	public int age;
	public String gender;

	public Animal() {
	}
	public Animal(int age, String gender) {
		super();
		this.age = age;
		this.gender = gender;
	}

	public void isMammal(boolean bool) {

		if (bool == true) {
			System.out.print("This animal is mammal.");
		} 
		else {
			System.out.print("This animal is not mammal.");
		}
	}

	public void mate(boolean bool) {
		if (bool == true) {
			System.out.print("This animal is mate.");
		} 
		else {
			System.out.print("This animal is not mate.");
		}
		
	}

}
