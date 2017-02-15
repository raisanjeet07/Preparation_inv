package com.san.prac.sorting;

import java.util.Arrays;

import com.san.prac.sorting.util.SortingUtil;

public class RadixSort {
	public static void sort(int[] arr) {
		int max = getMax(arr);
		int exp = 1;
		for (; (max / exp) > 0; exp *= 10) {
//			System.out.println("exp"+"\t"+exp);
			count(arr, exp);
		}
	}

	private static void count(int[] arr, int exp) {
		int len = arr.length;
		int[] output = new int[len];
		int[] count = new int[10];
		Arrays.fill(count, 0);

		for (int i = 0; i < len; i++)
			count[(arr[i] / exp) % 10]++;

		for (int i = 1; i < 10; i++)
			count[i] += count[i - 1];

		for (int i = len-1; i > -1; i--) {
			output[count[(arr[i] / exp) % 10] - 1] = arr[i];
			count[(arr[i] / exp) % 10]--;
		}
		
		for(int i=0;i<len;i++)
			arr[i]=output[i];
		SortingUtil.printDebug(arr);
	}

	private static int getMax(int[] arr) {
		int max=arr[0];
		for(int i=1;i<arr.length;i++){
			if(arr[i]>max){
				max=arr[i];
			}
		}
		return max;
	}
}
