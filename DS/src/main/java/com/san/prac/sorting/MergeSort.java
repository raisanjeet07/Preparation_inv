package com.san.prac.sorting;

import com.san.prac.sorting.util.SortingUtil;

public class MergeSort {
	// Sort the given part of array for given startIndex and endIndex
	/*
	 * Devide the given part of array up-to single element the call the merge
	 * method to merge
	 * 
	 */
	private static <T extends Comparable<T>> void sort(T[] arr, int startIndex, int endIndex) {
		if (startIndex < endIndex) {
			int middleIndex = (endIndex + startIndex) / 2;
			sort(arr, startIndex, middleIndex);
			sort(arr, middleIndex + 1, endIndex);
			merge(arr, startIndex, middleIndex, endIndex);
		}
	}

	/*
	 * Merge the two sorted array to single array. For the passed indexs...
	 * create two array (*both will be sorted array) and merge in the passed
	 * array.
	 */
	@SuppressWarnings("unchecked")
	private static <T extends Comparable<T>> void merge(T[] arr, int startIndex, int middleIndex, int endIndex) {

		int n1 = middleIndex - startIndex + 1;
		int n2 = endIndex - middleIndex;

		Object[] array1 = new Object[n1];
		Object[] array2 = new Object[n2];

		for (int i = 0; i < n1; i++)
			array1[i] = arr[startIndex + i];
		for (int i = 0; i < n2; i++)
			array2[i] = arr[middleIndex + 1 + i];

		int i = 0;
		int j = 0;

		while (i < n1 && j < n2) {
			if (((T) array1[i]).compareTo((T) array2[j]) < 0) {
				arr[startIndex] = (T) array1[i];
				startIndex++;
				i++;
			} else {
				arr[startIndex] = (T) array2[j];
				startIndex++;
				j++;
			}
		}
		while (i < n1) {
			arr[startIndex] = (T) array1[i];
			i++;
			startIndex++;
		}
		while (j < n2) {
			arr[startIndex] = (T) array2[j];
			startIndex++;
			j++;
		}
		SortingUtil.printDebug(arr);
	}

	public static <T extends Comparable<T>> void sort(T[] arr) {
		int size = arr.length;
		sort(arr, 0, size - 1);
	}
}
