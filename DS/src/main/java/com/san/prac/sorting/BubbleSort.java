package com.san.prac.sorting;

import com.san.prac.sorting.util.SortingUtil;

public class BubbleSort {

	public static <T extends Comparable<T>> void sort(T[] arr) {
		int length = arr.length;
		for (int i = 0; i < length; i++) {
			for (int j = 1; j < length; j++) {
				if (arr[j - 1].compareTo(arr[j]) > 0) {
					T tmp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = tmp;
				}
				SortingUtil.printDebug(arr);
			}
		}
	}
}
