/**
 * 
 */
package com.study.search;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author
 *
 */
public class BinaryDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> list=List.of(1,2,3,5,4,6,7,8);
		int[] arr= list.stream().mapToInt(i->i).toArray();
		//sort array in reverse order
		arr=Arrays.stream(arr).boxed().sorted(Collections.reverseOrder()).mapToInt(i->i).toArray();
		//System.out.println(arr);
		Arrays.sort(arr);
		System.out.println(binarySearch((int[]) arr,7));
	}

	private static int binarySearch(int[] arr, int num) {
		int start=0;
		int end=arr.length-1;
		int mid;
		while(start<=end) {
			mid =(start+end)/2;
			if(arr[mid]==num) {
				return mid;
			}else if(num>arr[mid]) {
				start=mid;
			}else {
				end=mid-1;
			}
		}
		return -1;
	}

}
