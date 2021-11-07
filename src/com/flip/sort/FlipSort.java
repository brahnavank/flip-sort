package com.flip.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlipSort {

	public static void main(String[] args) {
		int[] arr = new int[] { 3, 2, 4, 1 };
		System.out.println("Unsorted: " + Arrays.toString(arr));
		List<Integer> result = sort(arr);
		System.out.println("Output : " + Arrays.toString(result.stream().toArray()));
		System.out.println("Sorted  : " + Arrays.toString(arr));

	}

	/**
	 * Method to srot
	 * @param arr
	 * @return
	 */
	public static List<Integer> sort(int[] arr) {
		List<Integer> result = new ArrayList<Integer>();
		for (int i = arr.length - 1; i > 0; --i) {
			for (int j = 1; j <= i; ++j) {
				if (arr[j] == i + 1) {
					flip(arr, j);
					result.add(j + 1);
					break;
				}
			}

			flip(arr, i);
			result.add(i + 1);
		}

		return result;
	}

	/**
	 * Method for flip
	 * @param arr
	 * @param index
	 */
	private static void flip(int[] arr, int index) {
		for (int i = 0; i <= index / 2; ++i) {
			int temp = arr[i];
			arr[i] = arr[index - i];
			arr[index - i] = temp;
		}

		System.out.println("Sort  : " + Arrays.toString(arr));

	}

}
