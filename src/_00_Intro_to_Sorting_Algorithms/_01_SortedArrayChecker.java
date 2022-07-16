package _00_Intro_to_Sorting_Algorithms;

public class _01_SortedArrayChecker {
    /*
     * Write a static method called intArraySorted.
     *
     * This method takes in an array of integers and it returns a boolean.
     * The method returns true if the integer array is in ascending order
     * and false otherwise.
     */
    public static boolean intArraySorted(int[] arr) {
        boolean decides = true;
    	for(int i=0; i<arr.length-1; i++) {
        	if(arr[i+1]>=arr[i]) {
        		decides = true;
        	}
        	else {
        		decides = false;
        		break;
        	}
        }
        return decides;
        	
		
    }

    /*
     * 2. Write a static method called doubleArraySorted.
     *
     * This method takes in an array of doubles and it returns a boolean.
     * The method returns true if the double array is in ascending order
     * and false otherwise.
     */
    public static boolean doubleArraySorted(double[] arr) {
    		boolean decides2 = true;
    	for(int x = 0; x<arr.length-1; x++) {
    		if(arr[x+1]>=arr[x]) {
    			decides2 = true;
    		}
    		else {
        		decides2 = false;
        		break;
    		}	
    		}
    		return decides2;
    }

    /*
     * 3. Write a static method called charArraySorted.
     * 
     * This method takes in an array of characters and it returns a boolean.
     * The method returns true if the character array is in alphabetical
     * order and false otherwise (You can compare characters just like
     * integers).
     */
    public static boolean charArraySorted(char[] arr) {
    		boolean decides3 = true;
    	for(int z=0; z<arr.length-1; z++) {
   
    			if( arr[z]<=(arr[ z+1 ])) {
    				decides3 = true;
    			}
    			else {
    				decides3 = false;
    				break;
    			}
    		}
    		
    	return decides3;
    }

    /*
     * 4. Write a static method called stringArraySorted.
     *
     *  This method takes in an array of Strings and it returns a boolean.
     *  The method returns true if the String array is in alphabetical
     *  order and false otherwise (Use the compareTo(String) method).
     */
    public static boolean stringArraySorted(String[] arr) {
    		boolean decides4 = true;
    	for(int y=0; y<arr.length-1; y++) {
    		if(arr[y].compareTo(arr[y+1])<0){
    			decides4 = true;
    		}
    		else {
    			decides4 = false;
    			break;
    		}
    	}
    	return decides4;
    }

}
