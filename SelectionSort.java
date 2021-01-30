package edu.adarsh.sorting;

public class SelectionSort {

	static void sort(int[] input) {
		
		for(int i=0; i<input.length-1;i++ ) {
			int min = input[i];
			int index=0;
			for(int j=i+1; j<input.length;j++) {
				if(input[j] < min) {
					index=j;
				}
			}
			int temp = input[i];
			input[i] = input[index];
			input[index] = temp;
		}
		for (int i : input) {
			System.out.print(i + " ");
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 5, 10, 1, 6, 8 };
		sort(a);
	}

}
