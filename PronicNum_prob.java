package Programs;

import java.util.Scanner;

public class PronicNum_prob {
	public static void main(String args[]) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number" );
		n=sc.nextInt();
		int result=0;
		
		
			for(int i=0;i<n;i++) {
				if(i*(i+1)==n) {
					result=1;
					break;
				}
			//temp++;
			}
			
		
		if(result==1)
			System.out.print("The number is pronic" +n);
		else
			System.out.print("The number is not pronic"+n);
		
	}
	}
	


