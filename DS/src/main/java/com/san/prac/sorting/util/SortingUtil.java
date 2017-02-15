package com.san.prac.sorting.util;

import com.san.prac.constant.PracConstant;

public class SortingUtil {
	static boolean isDebugMode=PracConstant.isDebugModeOn;

	public static void setToDebugMode(boolean debugMode){
		isDebugMode=debugMode;
	}
	public static void setToDebugModeToDefault(){
		isDebugMode=PracConstant.isDebugModeOn;
	}
	public static <T> void printDebug(T[] arr) {
		if (isDebugMode) {
			for (T k : arr) {
				System.out.print(k + ", ");
			}
			System.out.println();
		}
	}
	
	public static void printDebug(int[] arr) {
		if (isDebugMode) {
			for (int k : arr) {
				System.out.print(k + ", ");
			}
			System.out.println();
		}
	}

	public static void printDebug(Object[] arr, int lastIndex) {
		if (isDebugMode) {
			for (int k = 0; k <= lastIndex; k++) {
				System.out.print(arr[k] + ", ");
			}
			System.out.println();
		}
	}

	public static void printDebug(int[] arr, int lastIndex) {
		if (isDebugMode) {
			for (int k = 0; k <= lastIndex; k++) {
				System.out.print(arr[k] + ", ");
			}
			System.out.println();
		}
	}
}
