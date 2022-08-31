package Programs;
import java.io.Scanner;

public class Oddevensum{
	int size,odds=0,evens=0;
Scanner sc=new Scanner(System.in);
System.out.print("Enter the number elements ");
size=sc.nexInt();
int array[]=new int[size];
System.out.print("Enter the numbers ");
for(int i=0;i<=size;i++) {
	array[i]=sc.nextInt();
	
}
for(int i=0;i<size;i++) {
	if(array[i]%2==0) {
		evens=evens+array[i];
	}
	else {
		odds=odds+array[i];
	}
}
System.out.print("\nThe sum of even numbers "+evens);
System.out.print("The sum of odd  numbers "+odds);



}

