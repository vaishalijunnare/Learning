/**
 * 
 */
package algorithms;

/**
 * @author vettle
 * 
 * This is the solution for Introduction to Algorithms by CORMEN 3rd Edition
 * Exercise 2.2 - 3
 *
 */
public class SelectionSort {

	/**
	 * @param args
	 * Time Complexity : O(n^2)
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SelectionSort selectionSort = new SelectionSort();
		int a[] = { 5, 2, 4, 6, 1, 3 };
		Utils.printArray(a);
		selectionSort.selectionSort(a);
		Utils.printArray(a);
	}

	private void selectionSort(int[] a) {
		// TODO Auto-generated method stub
		for (int i = 0; i < a.length - 1; i++) {
			int smallest = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[smallest] > a[j]) {
					smallest = j;
				}
			}
			int temp = a[smallest];
			a[smallest] = a[i];
			a[i] = temp;
		}
	}
}
