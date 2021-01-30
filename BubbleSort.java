package edu.adarsh.sorting;

public class BubbleSort {

	public static void bubbleSort(int a[]) {

		int len = a.length;
		/*
		 * 
		 */
		for (int i = 0; i <= len - 2; i++) {
			for (int j = 0; j <= len - 2-i; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j + 1];
					a[j + 1] = a[j];
					a[j] = temp;
				}
			}
		}

		for (int i : a) {
			System.out.print(i + " ");
		}
	}

	public static void main(String[] args) {
		int a[] = { 5, 10, 1, 6, 8 };
		bubbleSort(a);
	}
}
