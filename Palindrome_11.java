package Programs;

public class Palindrome_11 {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
int r,sum=0,temp;
{
	int n=545;
	temp=n;
	while(n>0) {
		r=n%10;
		sum=(sum*10)+r;
		n=n/10;
	}
	if(temp==sum)
		System.out.println("Palindrome numer");
	else
		System.out.println("not a palindrome");
}
	}

}
