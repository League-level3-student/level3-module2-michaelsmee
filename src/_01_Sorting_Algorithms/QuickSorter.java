package _01_Sorting_Algorithms;

public class QuickSorter extends Sorter {
    public QuickSorter() {
        type = "Quick";
    }
    
    /*
     * For further reference:
     * https://en.wikipedia.org/wiki/Quicksort
     */
    
    @Override
    void sort(int[] array, SortingVisualizer display) {
        // 10. call the quickSort method with 0 and the length of the array minus one
       quickSort(array, 0, array.length-1, display);
    }
    private void quickSort(int[] array, int low, int high, SortingVisualizer display) {
        // 2. create two integer variables called i and j and set them equal
        //    to low and high respectively.
    	int i = low;
    	int j = high;
       
        // 3. create an integer called pivot and set it equal to the element
        //    in the array that is the halfway point between low and high
      int pivot = array[(i+j)/2];

        // 4. make a while loop that goes while i is less than or equal to j
    		  while(i<=j) {
    			  while(array[i]<pivot) {
    				  i++;
    			  }
    			  while(array[j]>pivot) {
    				  j--;
    			  }
    			  if(i<=j) {
        			  Integer temp = array[i];
        			  array[i] = array[j];
        			  array[j] = temp;
        			  i+=1;
        			  j-=1;
        			  display.updateDisplay();
        		  }
    		  }
    		  
                   // 5. make a while loop that increments i while 
            //    the array element at i is less than pivot
            
            // 6. make a while loop that decrements j while 
            //    the array element at j is greater than pivot
           
            // 7. if i is less than or equal to j, 
            //    swap the array elements at i and j.
            //    In the same if-statement, increase i by 1 
            //    and decrease j by 1.
    		
        
        // 8. if low is less than j, call the quickSort method using
        //    low for the low and j for the high
        if(low < j) {
        	quickSort(array, low, j, display);
        }
        
        // 9. if i is less than high, call the quickSort method using
        //    i for the low and high for the high.
       if(i < high) {
    	   quickSort(array, i, high, display);
       }
    }
    
}