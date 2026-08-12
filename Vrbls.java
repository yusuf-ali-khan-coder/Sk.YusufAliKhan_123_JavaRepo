class Vrbls{
	static int i = 0;
	int iv;
void display(){
	System.out.println(i);
	System.out.println(iv);
}
void local(){
	int vb = 10;
	System.out.println(vb);
}
	public static void main (String args[]){
		Vrbls op = new Vrbls();
		op.display();
		op.local();
	}
}