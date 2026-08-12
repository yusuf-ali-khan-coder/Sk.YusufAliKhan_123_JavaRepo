class loops{
	public static void main (String args[]){
		System.out.println("Loops");
		for(int i=0;i<=5;i++){
			System.out.println(i);
		}
		System.out.println("\n");
		int j=0;
		while(j<=5){
			System.out.println(j);
			j++;
		}
		System.out.println("\n");
		int k=0;
		do{
			System.out.println(k);
			k++;
		}while(k<=5);
		System.out.println("\n");
		System.out.println("Control flow");
		System.out.println("break at 2");
		for(int l=0;l<=5;l++){
			if(l==2){
				break;
			}
			System.out.println(l);
		}
		System.out.println("\n");
		System.out.println("skip at 2");
		for(int m=0;m<=5;m++){
			if(m==2){
				continue;
			}
			System.out.println(m);
		}
	}
}
			