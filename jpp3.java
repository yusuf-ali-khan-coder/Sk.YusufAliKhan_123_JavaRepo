/* Write a java program which reads marks of five subjects through command line and print 
the total and average.*/

import java.util.Scanner;

class jpp2{
	public static void main (String[] args){
			int m1 = Integer.parseInt(args[0]); 
			int m2 = Integer.parseInt(args[1]); 
			int m3 = Integer.parseInt(args[2]); 
			int m4 = Integer.parseInt(args[3]); 
			int m5 = Integer.parseInt(args[4]);
			
			int total = m1 + m2 + m3 + m4 + m5;
			double avg = total/5.0;
			System.out.println("Total="+total);
			System.out.println("Average="+avg);
	}
}
		
			