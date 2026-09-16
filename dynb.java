class bank{
	double getRate(){
		return 0.0;
	}
}
class SBI extends bank{
	double getRate(){
		return 5.0;
	}
}
class HDFC extends bank{
	double getRate(){
		return 7.0;
	}
}
class dynb{
		public static void main(String[] args){
			bank b1 = new SBI();
			System.out.println(b1.getRate());
			bank b2 = new HDFC();
			System.out.println(b2.getRate());
		}
}