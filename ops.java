class ops{
	public static void main (String args[]){
		System.out.println("Arithmatic ops");
		int a = 10;
		int b = 20;
		int c = 10;
		System.out.println("a+b=" + (a+b) +  "\n" + "a-b=" + (a-b));
		System.out.println("a*b=" + (a*b) +  "\n" + "a/b=" + (a/b));
		System.out.println("a%b=" + (a%b));
		System.out.println("\n");
		
		System.out.println("Relational ops");
		System.out.println(a==b);
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a!=b);
		System.out.println("\n");
		
		System.out.println("Logical ops");
		if(a==b && a==c){
			System.out.println("1");
		}
		else{
			System.out.println("0");
		}
		if(a==b || a==c){
			System.out.println("1");
		}
		else{
			System.out.println("0");
		}
		System.out.println("\n");
		
		System.out.println("Bitwise ops");
		System.out.println(a&b);
		System.out.println(a|b);
		System.out.println(~a);
		System.out.println(a^b);
		System.out.println("\n");
		
		System.out.println("Assignment ops");
		System.out.println(a+=5);
		System.out.println(a-=5);
		System.out.println("\n");
		
		System.out.println("increment/decrement ops");
		System.out.println(++a);
		System.out.println(--a);
	}
}
		