package Programs;

public class Mirrorinverse {
	
		 
	    // Function that returns true if
	    // the array is mirror-inverse
	    static boolean isMirrorInverse(int arr[])
	    {
	        for (int i = 0; i < arr.length; i++) {
	 
	            // If condition fails for any element
	            if (arr[arr[i]] != i)
	                return true;
	        }
	 
	        // Given array is mirror-inverse
	        return false;
	    }

	    public static void main(String[] args)
	    {
	        int arr[] = { 1,1,1,1 };
	        if (isMirrorInverse(arr))
	            System.out.println("Mirror inverse");
	        else
	            System.out.println("Its not a mirror inverse");
	    }
	}

