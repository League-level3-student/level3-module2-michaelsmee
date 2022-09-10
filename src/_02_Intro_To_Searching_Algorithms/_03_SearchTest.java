package _02_Intro_To_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _03_SearchTest {

    /*
     *  A minimum of 3 tests are required for each method
     */

    @Test
    public void testLinearSearch() {
        // 1. Use the assertEquals() method to test your linear search method
    	String[] arr = {"a", "b", "c", "d", "e"};
    	
    	int result = _01_LinearSearch.linearSearch(arr, "c");
       assertEquals(2, result);
    }

    @Test
    public void testBinarySearch() {
        // 2. Use the assertEquals() method to test your binary search method
        //    remember that the array must be sorted
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    	
        int result2 = _02_BinarySearch.binarySearch(arr2, 0, 8, 4);
    	assertEquals(3, result2);
    }
}
