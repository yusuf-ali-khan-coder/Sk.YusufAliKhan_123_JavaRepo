class animal1{
	void sound(){	
		System.out.println("Animal makes a sound");
	}
}
class dog1 extends animal1{
	@Override
	void sound(){
		System.out.println("Barks");
	}
}
class cat1 extends animal1{
	@Override
	void sound(){
		System.out.println("Meow");
	}
}
class poly{
	public static void main(String[] args){
		animal1 a = new animal1();
		animal1 d = new dog1();
		animal1 c = new cat1();
		a.sound();
		d.sound();
		c.sound();
	}
}