package _04_JavaClassSearchAndSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * Use the Arrays and Collections classes to implement the search and sort
 * methods below.
 */
public class _02_JavaClassSearchSort {
    
    public static int[] arraySort(int[] arr) {
        List<Integer> ints = new ArrayList<Integer>();
    	for(int i=0; i<arr.length; i++) {
    		ints.add(arr[i]);
    	}
    	
        Collections.sort(ints);
    	
        int[] ints2 = new int[ints.size()];
        for(int i=0; i<ints2.length; i++) {
        	ints2[i] = ints.get(i);
        }
        
        return ints2;
    }
    
    public static List<Double> listSort(List<Double> list){
       
       Collections.sort(list);
    	
        return list;
    }

    public static Boolean arraySearch(char[] arr, char key) {
        Boolean tOrF = false;
    	for(int i=0; i<arr.length; i++) {
    		if(arr[i] == key) {
    			tOrF = true;
    		}
    	}
    	
        return tOrF;
    }
    
    public static Boolean listSearch(List<Character> list, Character key) {
    	Boolean tOrF = false;
    	
    	if(list.contains(key)) {
    		tOrF = true;
    	}
    	
        return tOrF;
    }
}
