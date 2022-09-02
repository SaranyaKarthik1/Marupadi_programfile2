package Programs;

//import java .io.*;
import java.util.Arrays;

public class Highestnumberinan_array {

	    // returns maximum in arr[] of size n
	    static int largest(int []arr,   
	                       int n)
	    {
	        Arrays.sort(arr);
	        return arr[n - 2];//lowest number is n-n
	    }
	   
	    // Driver code
	    static public void main (String[] args)
	    {
	        int []arr = {40, 50, 45, 
	                     70, 56};//sorted list are=40,45,50,56,70
	        int n = arr.length;
	        System.out.println("The fourth highest number is");
	        System.out.println(largest(arr, n));
	    }
}