class TypeCast{
	public static void main (String args[]){
		System.out.println("Widening conversion");
		byte b = 100;
		short s = b;       
		int i = s;         
		long l = i;       
		float f = l;       
		double d = f;
		System.out.println(d);
	}
}