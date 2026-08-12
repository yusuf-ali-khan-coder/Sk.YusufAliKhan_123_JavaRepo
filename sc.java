import java.util.Scanner;

class sc{
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name: ");
		String name = sc.nextLine();
		System.out.print("Enter age: ");
		int age = sc.nextInt();
		System.out.println("Hello, " + name + "! Age: " + age);
        System.out.printf("Formatted: %s is %d years old%n", name, age);
		
		sc.close();
	}
}
		