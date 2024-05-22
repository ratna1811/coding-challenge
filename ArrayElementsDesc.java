package com.demo.collections;

import java.util.Arrays;
import java.util.Collections;

public class ArrayElementsDesc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] array = {12,56,92,89,90,54,46};
		System.out.println("Original Array: "+Arrays.toString(array));
		
		Arrays.sort(array, Collections.reverseOrder());
		
		System.out.println("Sorted Array : "+Arrays.toString(array));

	}

}
