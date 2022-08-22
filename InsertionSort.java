// Name: Deziallia Morris

package com.dezji;

import static java.lang.System.out;
import java.util.ArrayList;

public class InsertionSort {

	public static void main(String[] args) {
		ArrayList<Integer> array = new ArrayList<>();
		
		
		// generates a random number for ten elements with no repeats
		for (int i = 0; i < 10; i++) {
			int randomNumber = (int)(Math.random() * 1000);
			
			while (array.contains(randomNumber)) {
				randomNumber = (int)(Math.random() * 1000);
			}
			
			array.add(randomNumber);
		}
		
		
		
		// top border for output
		
		for (int i = 0; i < 138; i++) {
			out.print("*");
		}
		out.println();
		for (int i = 0; i < 138; i++) {
			out.print("*");
		}
		out.println();
		
		
		
		// title with asterisk borders
		for (int i = 0; i < 50; i++) {
			out.print("*");
		}
		
		out.print("\tTesting datatype: Integer\t");
		
		for (int i = 0; i < 50; i++) {
			out.print("*");
		}
		
		
		// displays the sort before and after
		out.println("\n\n\t\t\t\t\tList before insertion sort:\n\t\t\t\t\t" + array);
		
		// sort array
		insertionSort(array);
		
		out.println("\n\n\t\t\t\t\tList after insertion sort:\n\t\t\t\t\t" + array);
		
		
		
		
		
		// new array for second testing of strings
		ArrayList<String> names = new ArrayList<>();
		
		// names added to second test array
		names.add("Jessica");
		names.add("Morty");
		names.add("Rick");
		names.add("Jerry");
		names.add("Beth");
		names.add("Tammy");
		names.add("BirdPerson");
		
		
		
		// border for inbetween the tests
		out.println();
		for (int i = 0; i < 138; i++) {
			out.print("*");
		}
		out.println();
		for (int i = 0; i < 138; i++) {
			out.print("*");
		}
		out.println();
		
		
		
		// title with border
		for (int i = 0; i < 50; i++) {
			out.print("*");
		}
		
		out.print("\tTesting datatype: String\t");
		
		for (int i = 0; i < 50; i++) {
			out.print("*");
		}
		
		
		// displays the output for the second array
		out.println("\n\n\t\t\t\t\tList before insertion sort:\n\t\t\t\t\t" + names);
		
		// sort array
		insertionSort(names);
		
		out.println("\n\n\t\t\t\t\tList after insertion sort:\n\t\t\t\t\t" + names);	
		
		
		
		
		
		// final bottom border
		out.println();
		for (int i = 0; i < 138; i++) {
			out.print("*");
		}
		out.println();
		for (int i = 0; i < 138; i++) {
			out.print("*");
		}
	}
	
	
	// generic method to take different datatypes
	public static <E extends Comparable<E>> void insertionSort(ArrayList<E> array) {
		int j = 0;
		int i = 1;
		E element; // to be used to compare values with j to 0
		
		while (i < array.size()) {
			element = array.get(i);
			j = i - 1;
			
			while (j >= 0 && array.get(j).compareTo(element) > 0) {
				array.set(j + 1, array.get(j)); // swaps the array's elements
				j -= 1;
				
			}
			
			array.set(j + 1, element); // swaps the array's elements
			i += 1;
			
		}
	}
}
