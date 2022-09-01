package Programs;
import java.io.*;
import java.util.ArrayList;
  
class Separatestsub {
  
    private static final Separatestsub SubstringsOfAString = null;

	// function to split a string into all its substrings
    // and return the list as an object of ArrayList
    public static ArrayList<String>
    splitSubstrings(String s)
    {
  
        // variables to traverse through the
        // string
        int i, j;
  
        // to store the length of the
        // string
        int stringLength = s.length();
  
        // List object to store the list of
        // all substrings of the string s
        ArrayList<String> subStringList
            = new ArrayList<String>();
  
        // first for loop
        for (i = 0; i < stringLength; i++) {
  
            for (j = i + 1; j <= stringLength; j++) {
  
                subStringList.add(s.substring(i, j));
            }
  
        } // end of first for loop
  
        // returning the list (object
        // of ArrayList) of substrings
        // of string s
        return subStringList;
    }
  
    public static void main(String[] args)
    {
  
        // here "Gradute study" is our input string
        String stringInput = new String("Graduate Study");
  
        ArrayList<String> subStringList= SubstringsOfAString.splitSubstrings(
                stringInput);
  
        System.out.print(
            "\nSubstring list printed as an ArrayList : ");
        System.out.println(subStringList);
  
        System.out.print(
            "\n\nAll substrings printed 1 per line : ");
        //int count = 1;
  
        // each substring would be printed
        // within double quotes
        for (String it : subStringList) {
            System.out.print(" study \n");
            System.out.println("\nGraduate");
            //count++;
        }
    }
}

