package com.san.prac.sorting;

import com.san.prac.sorting.util.SortingUtil;

public class HeapSort {
	public static <T extends Comparable<T>> void sort(T[] arr) {
		int n = arr.length;
		for (int i = n / 2 - 1; i >= 0; i--)
			heapify(arr, n, i);
		for (int i = n - 1; i >= 0; i--) {
			T tmp = arr[i];
			arr[i] = arr[0];
			arr[0] = tmp;
			heapify(arr, i, 0);

			SortingUtil.printDebug(arr);
		}
	}

	private static <T extends Comparable<T>> void heapify(T[] arr, int size, int largestElementIndex) {
		int largesEIndex = largestElementIndex;
		int l = largesEIndex * 2 + 1;
		int r = largesEIndex * 2 + 2;

		if (l < size && (arr[l].compareTo(arr[largesEIndex]) > 0))
			largesEIndex = l;
		if (r < size && arr[r].compareTo(arr[largesEIndex]) > 0)
			largesEIndex = r;
		if (largesEIndex != largestElementIndex) {
			T tmp = arr[largestElementIndex];
			arr[largestElementIndex] = arr[largesEIndex];
			arr[largesEIndex] = tmp;
			heapify(arr, size, largesEIndex);
		}
	}
}
