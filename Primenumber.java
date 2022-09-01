package Programs;
import java.util.Scanner;
public class Primenumber {
public static void main(String args[]) {
	int n,i,count=0;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the number" );
	n=sc.nextInt();
	for(i=2;i<n;i++) {
		if(n%i==0) {
			count++;
			break;
		}
	}
	if(count==0) 
	System.out.println("\n Its a prime "+n);
	else
		System.out.println("\n It's not a prime "+n);
		
	
}
}
