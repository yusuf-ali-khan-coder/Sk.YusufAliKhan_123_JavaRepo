class animal{
	void sound(){
	System.out.println("Animal makes a sound");
	}
}
class dog extends animal{
	@Override
	void sound(){
		System.out.println("Dog barks");
	}
}
class methods2{
	public static void main(String[] args){
		dog d = new dog();
		animal a = new dog();
		a.sound();
	}
}