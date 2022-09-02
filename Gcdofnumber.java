package Programs;
import java.util.Scanner;  

public class Gcdofnumber {
 
public static void main(String[] args)   
{  
int a, b, gcd = 0;
int sum;  
Scanner sc = new Scanner(System.in);  
System.out.print("Enter the First Number: ");  
a = sc.nextInt();     
System.out.print("Enter the Second Number: ");  
b = sc.nextInt();  
gcd = fGCD(a, b);  
System.out.println("GCD of " + a + " and " + b + " =  " + gcd); 

sum=a+b;
System.out.println("The sum of digits of given number is "+sum);
}  

public static int fGCD(int a, int b)  
{    
	while(b != 0)  
	{  
	if(a > b)  
	{  
	a = a - b;  
	}  
	else  
	{  
	b = b - a;  
	}  
	}  
	return a;  
	}  

	}  



