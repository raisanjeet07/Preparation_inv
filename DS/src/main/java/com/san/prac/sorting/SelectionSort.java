package com.san.prac.sorting;

import com.san.prac.sorting.util.SortingUtil;

public class SelectionSort {
	
	public static <T extends Comparable<T>> void sort(T[] arr) {
		int length = arr.length;
		for (int i = 0; i < length; i++) {
			int smallestIndex = i;
			for (int k = i; k < length; k++) {
				if (arr[smallestIndex].compareTo(arr[k])>0)
					smallestIndex = k;
			}
			T tmp = arr[i];
			arr[i] = arr[smallestIndex];
			arr[smallestIndex] = tmp;
			SortingUtil.printDebug(arr);
		}
	}
}
