package _03_More_Algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Write your methods in this class
 */
public class Algorithms {

	public static String multiply(int num1, int num2) {
		return (num1 + " x " + num2 + " = " + (num1 * num2));

	}

	public static boolean isPrime(int num1) {
		boolean isFalse = true;
		for (int i = 2; i <= num1 / 2; i++) {
			if (num1 % i == 0) {
				isFalse = false;
				break;
			}
		}
		return isFalse;

	}

	public static boolean isSquare(int num1) {
		boolean isTrue = false;
		for (int i = 0; i <= num1; i++) {
			if (i * i == num1) {
				isTrue = true;
				break;
			}
		}
		return isTrue;
	}

	public static boolean isCube(int num1) {
		boolean trueOrFalse = false;
		for (int i = 0; i <= num1; i++) {
			if (i * i * i == num1) {
				trueOrFalse = true;
				break;
			}
		}
		return trueOrFalse;
	}

	public static int findBrokenEgg(List<String> eggs) {
		int numBrokenEggs = 0;
		for (int i = 0; i < eggs.size(); i++) {
			if (eggs.get(i).equals("cracked")) {
				numBrokenEggs += 1;
			}
		}
		return numBrokenEggs;
	}

	public static int countPearls(List<Boolean> oysters) {
		int pearls = 0;
		for (int i = 0; i < oysters.size(); i++) {
			if (oysters.get(i) == true) {
				pearls += 1;
			}
		}
		return pearls;
	}

	public static double findTallest(List<Double> peeps) {
		double tallest = 0.0;
		for (int i = 0; i < peeps.size() - 1; i++) {
			if (peeps.get(i) > peeps.get(i + 1)) {
				tallest = i;
			}
		}
		return tallest;
	}

	public static String findLongestWord(List<String> words) {
		String longest = words.get(0);
		for (int i = 0; i < words.size(); i++) {
			if (words.get(i).length() > longest.length()) {
				longest = words.get(i);

			}
		}
		return longest;
	}

	public static boolean containsSOS(List<String> message) {
		boolean isTrueOrFalse = false;
		for (int i = 0; i < message.size(); i++) {
			if (message.contains("... --- ...")) {
				isTrueOrFalse = true;
				break;
			}
		}
		return isTrueOrFalse;
	}

	public static List<Double> sortScores(List<Double> results) {
		List<Double> values = new ArrayList<Double>();
		for (int i = 0; i < results.size(); i++) {
			values.add(results.get(i));

		}
		boolean isInOrder = false;
		while (isInOrder == false) {
			isInOrder = true;

			for (int x = 0; x < values.size() - 1; x++) {
				if (values.get(x) > values.get(x + 1)) {
					double temp = values.get(x);
					values.remove(x);
					values.add(x+1, temp);
					isInOrder = false;

				}

			}

		}
		//System.out.println(values);
		return values;

	}
	
	public static List<String> sortDNA( List<String> unsortedSequences){
		List<String>DNA = new ArrayList<String>();
		for(int i=0; i<unsortedSequences.size(); i++) {
			DNA.add(unsortedSequences.get(i));
		}
		
		boolean isInOrder = false;
		while(isInOrder == false) {
			isInOrder = true;
			for(int x=0; x<DNA.size()-1; x++) {
				if(DNA.get(x).length() > DNA.get(x+1).length()) {
					String temp = DNA.get(x);
					DNA.remove(x);
					DNA.add(x+1, temp);
					isInOrder = false;
				}
			}
		}
		//System.out.println(DNA);
		return DNA;
	}
	
	public static List<String> sortWords( List<String> words){
		List<String>List = new ArrayList<String>();
		for(int i=0; i<words.size(); i++) {
			List.add(words.get(i));
		}
		
		boolean isInOrder = false;
		while(isInOrder == false) {
			isInOrder = true;
			for(int x=0; x<List.size()-1; x++) {
				if(List.get(x).compareTo(List.get(x+1))>0){
					String temp = List.get(x);
					List.remove(x);
					List.add(x+1, temp);
					isInOrder = false;
				}
			}
		}
		return List;
	}
	
}
