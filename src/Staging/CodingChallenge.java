package Staging;

public class CodingChallenge {
	
	//1
    public static int findDistance(int[][] arry, int N) {
    	int result = 0;
    	int j = 0;
    	int k =0;
        for (int i=N; i>=1; i--) {
            	result+= arry[i][j]-arry[k][0];
            	result+= Math.abs(arry[j][0]-arry[i][j]);
            	k++;
        }
        return result;
    }
    
    //2
    public static boolean yourNameIsMyName(String value, String testString) {
    	int index = -1;
    	//add string to string builder class
    	 StringBuilder str = new StringBuilder(testString);
    	 
    	//loop through each character in string
    	  for (int i = 0; i < value.length(); i++) {
    		  //when it fails automatically return false else just continue.  The index must be larger to ensure duplicate characters in string work
    		  try 
    		  {
    	            char letter = value.charAt(i);
    	            String stringLetter = Character.toString(letter);
    	            int position = str.indexOf(stringLetter);
    	            str.deleteCharAt(position);
    	             if (position < index) {
    	            	 return false;
    	             }else {
    	            	 index = position;
    	             }
    		  } catch (Exception e){ 
    			  return false;
    		  }
          }
    	
    	return true;
    }
} 
