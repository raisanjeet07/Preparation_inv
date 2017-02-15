package com.san.prac.main;

import com.san.prac.common.Employee;
import com.san.prac.sorting.RadixSort;
import com.san.prac.sorting.util.SortingUtil;

public class AppTester {
	static {
		SortingUtil.setToDebugMode(false);
	}

	public static void main(String[] args) {
//		 Integer[] arr = { 12, 53, 62, 41, 26, 69, 32, 95, 84, 13, 24, 16 };
		int[] arr = { 12, 53, 62, 41, 26, 69, 32, 95, 84, 13, 24, 16 };
		
		int len=12;
		Employee[] employees = new Employee[len];
		for (int i = 0; i < len; i++) {
			employees[i] = new Employee((int) ((Math.random()+0.111d) * 1000000), "");
		}
		
		
		printArray(arr);
//		printArray(employees);
		// printArray(employees);
		// HeapSort.sort(arr);
		// HeapSort.sort(employees);
		// BubbleSort.sort(arr);
		// BubbleSort.sort(employees);
		// InsertionSort.sort(arr);
		// InsertionSort.sort(employees);
		// MergeSort.sort(arr);
		// MergeSort.sort(employees);
		RadixSort.sort(arr);
		// QuickSort.sort(employees);
		 printArray(arr);
		// printArray(employees);
	}

	public static void printArray(int[] arr) {
		for (int i : arr) {
			System.out.print(i + ", ");
		}
		System.out.println();
	}

	public static <T> void printArray(T[] arr) {
		for (T i : arr) {
			System.out.print(i + ", ");
		}
		System.out.println();
	}
}
