/*Design a “farm animals” java application with the details of animals like cow, pig, horse. 
Consider the following details like where they stay, what they eat, the sound they make by 
using classes and objects.*/

class animal{
	String name;
	String place;
	String food;
	String sound;
	animal(String n, String p, String f, String s) 
	{ 
	name = n; 
	place = p; 
	food = f; 
	sound = s; 
	}
	void display(){
		System.out.println("Animal: " + name); 
		System.out.println("Stays in: " + place); 
		System.out.println("Eats: " + food); 
		System.out.println("Sound: " + sound); 
		System.out.println();
	}
}
class jpp3{
	public static void main (String[] args){
		animal cow = new animal("cow","cow shed","grass","mooooo");
		animal horse = new animal("horse","horse shed","hay","neigh");
		cow.display();
		horse.display();
	}
}