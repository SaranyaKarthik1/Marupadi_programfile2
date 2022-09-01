package Programs;
import java.util.Arrays;


public class Merge2array {
	
	
	    public static void main(String[] args)
	    {
	        // first array
	        int[] a = { 1,2,3,4,5,6,};
	  
	        // second array
	        int[] b = {7,8,9,0 };
	  
	        // determines length of firstArray
	        int a1 = a.length;
	        
	        // determines length of secondArray
	        int b1 = b.length;
	        
	        // resultant array size
	        int c1 = a1 + b1;
	  
	        // create the resultant array
	        int[] c = new int[c1];
	  
	        // using the pre-defined function arraycopy
	        System.arraycopy(a, 0, c, 0, a1);
	        System.arraycopy(b, 0, c, a1, b1);
	        // prints the resultant array
	        System.out.println("The resultant array is \n"+Arrays.toString(c));
	        //System.out.println(Arrays.toString(c));
	    }
	
}

