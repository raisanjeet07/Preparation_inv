package com.san.parc.invques;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import com.san.prac.sorting.util.SortingUtil;

public class FourDigitSum {
	public static void main(String[] args) {
		printPossible(null, 2);
//		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//		int testCases;
//		try {
//			testCases=Integer.parseInt(br.readLine());
//			for(int i=0;i<testCases;i++){
//				String[] arg=br.readLine().split(" ");
//				int k=Integer.parseInt(arg[1]);
//				int n=Integer.parseInt(arg[0]);
//				int[] arr=new int[n];
//				String[] nos=br.readLine().split(" ");
//				for(int j=0;j<n;j++){
//					arr[j]=Integer.parseInt(nos[j]);
////					System.out.println("sd");
//				}
//				printPossible(arr,k);
//			}
//			
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	}
	public static void printPossible(int[] arr1,int no){
		 int[] arr={88 ,84, 3, 51, 54, 99, 32, 60, 76, 68, 39, 12, 26, 86, 94, 39, 95, 70, 34, 78, 67, 1, 97, 2, 17, 92, 52};
		 Arrays.sort(arr);
		 SortingUtil.printDebug(arr);
		 Set<Integer> set=new HashSet<Integer>();
		for(int i : arr)
			set.add(i);
		arr=new int[set.size()];
		int q=0;
		for(Integer p :  set){
			arr[q]=p;
			q++;
			}
		Arrays.sort(arr);
		SortingUtil.printDebug(arr);
		int len=arr.length;
		for(int i=0;i<len-3;i++){
			if(arr[1]>=no)
				continue;
			for(int j=i+1;j<len-2;j++){
				if(arr[1]+arr[j]>=no)
					continue;
				for(int k=j+1;k<len-1;k++){
					if(arr[1]+arr[j]+arr[k]>=no)
						continue;
					for(int l=k+1;l<len;l++){
						int sum = arr[i]+arr[j]+arr[k]+arr[l];
//						System.out.println(arr[i]+","+arr[j]+","+arr[k]+","+arr[l]+" : sum is : "+sum);
						if(sum==no){
							System.out.println(arr[i]+" "+arr[j]+" "+arr[k]+" "+arr[l]);
						}
							
					}
				}
			}
		}
	}
}
