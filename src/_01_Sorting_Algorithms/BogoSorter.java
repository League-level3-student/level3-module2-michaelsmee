package _01_Sorting_Algorithms;

import java.util.Random;

public class BogoSorter extends Sorter {
    public BogoSorter() {
        type = "Bogo";
    }

    /*
     * Bogo sort is a joke sorting algorithm. It is considered the most
     * inefficient sorting algorithm while still maintaining the possibility
     * of eventually sorting data.
     * 
     * It works by following these steps:
     * STEP 1. Is the array in order?
     * if yes, finished; if no, go to step 2.
     * STEP 2. Take two random elements in the array and swap them.
     * STEP 3. Go back to step 1.
     */
    @Override
    void sort(int[] array, SortingVisualizer display) {
        boolean isInOrder = false;
        Random rand = new Random();
        while(isInOrder == false) {
    		isInOrder = true;
        	for(int i =0; i<array.length-1; i++) {
        		if(array[i]>array[i+1]) {
        		Integer one = rand.nextInt(array.length);
        		Integer two = rand.nextInt(array.length);
        		Integer temp = array[one];
        		array[one] = array[two];
        		array[two] = temp;
        		display.updateDisplay();
        		isInOrder = false;
        		}
        	}
        }
    }
}
