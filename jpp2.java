import java.util.Scanner;
class jpp1{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int og=n;
		int rev=0;
		while(n>0){
			rev = rev*10 + n%10;
			n=n/10;
		}
		boolean palin;
		if(og==rev){
			palin = true;
		}
		else{
			palin = false;
		}
		
		//prime.check
		int count = 0;
		boolean prime=true;
		if(og<=1){
			prime = false;
		}
		else{
			for(int i=1;i<=og;i++){
				if(og%i==0){
					count++;
				}
				else{
					prime=true;
				}
			}
		if(count==2){
			prime=true;
		}
		else{
			prime=false;
		}
		}
		if(prime&&palin){
			System.out.println(og + " is a prime palindrome");
		}
		else{
			System.out.println(og + " is not a prime palindrome");
		}
	}
}