package com.san.prac.sorting;

import com.san.prac.sorting.util.SortingUtil;

public class InsertionSort {

	public static <T extends Comparable<T>> void sort(T[] arr) {
		int length = arr.length;
		SortingUtil.printDebug(arr, 0);
		for (int i = 1; i < length; i++) {
			for (int j = i; j > 0; j--) {
				if (arr[j - 1].compareTo( arr[j])>0) {
					T tmp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = tmp;
				} else {
					j = 0;
				}
			}
			SortingUtil.printDebug(arr, i);
		}
	}
}
