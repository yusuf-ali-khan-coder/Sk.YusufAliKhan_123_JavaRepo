class student{
	String name;
	int age;
	int rno;
	
	student(String  s, int m, int r){
		name = s;
		age = m;
		rno = r;
	}
	void display(){
		System.out.println(name+" "+age+" "+rno);
	}
}
class constr{
	public static void main(String[] args){
		student s1 = new student("YUSUF",19,123);
		s1.display();
	}
}