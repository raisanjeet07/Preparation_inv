package com.san.prac.sorting;

import com.san.prac.sorting.util.SortingUtil;

public class QuickSort {
	public static <T extends Comparable<T>> void sort(T[] arr) {
		sort(arr, 0, arr.length - 1);
	}

	private static <T extends Comparable<T>> void sort(T[] arr, int startIndex, int endIndex) {
		if (startIndex >= endIndex)
			return;
		int pivoteIndex = getPivoteIndex(arr, startIndex, endIndex);
		sort(arr, startIndex, pivoteIndex - 1);
		sort(arr, pivoteIndex + 1, endIndex);

	}

	private static <T extends Comparable<T>> int getPivoteIndex(T[] arr, int startIndex, int endIndex) {
		int pivoteIndex = endIndex;
		int k = startIndex - 1;
		for (int i = startIndex; i < endIndex; i++) {
			if (arr[i].compareTo(arr[pivoteIndex])<0) {
				k++;
				T tmp = arr[i];
				arr[i] = arr[k];
				arr[k] = tmp;
			}
		}
		T tmp = arr[k + 1];
		arr[k + 1] = arr[pivoteIndex];
		arr[pivoteIndex] = tmp;
		SortingUtil.printDebug(arr);
		return k + 1;
	}
}
