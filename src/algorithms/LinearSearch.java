/**
 * 
 */
package algorithms;

/**
 * @author vettle
 *
 * This is the solution for Introduction to Algorithms by CORMEN 3rd Edition
 * Exercise 2.1 - 3
 */
public class LinearSearch {

	/**
	 * @param args
	 * 
	 * Time Complexity of Insertion sort : O(n^2)
	 * Time Complexity of Linear Search is : O(n)
	 * 
	 */
	
	static int a[] = {5,2,4,6,1,3};
		
	public static void main(String[] args) {
		LinearSearch linearSearch = new LinearSearch();
		linearSearch.printArray(a);
		linearSearch.insetionSortAscending(a);
		linearSearch.printArray(a);
		System.out.println("Index of number 3 is :" + linearSearch.linearSearch(a, 3));
		System.out.println("Index of number 10 is :" + linearSearch.linearSearch(a, 10));
	}
	
	public void printArray(int a[]){
		for(int i=0;i<a.length;i++){
			System.out.print(" " + a[i]);
		}
		System.out.println();
	}
	
	public void insetionSortAscending(int a[]){
		for(int i=1;i<a.length;i++){
			int key = a[i];
			int j = i-1;
			while(j >= 0 && a[j]>key){
				a[j+1]=a[j];
				j--;
			}
			a[j+1] = key;
		}
	}
	public String linearSearch(int a[], int number){
		for(int i=0;i<a.length;i++){
			if(a[i] == number){
				return i+"";
			}
		}
		return "NIL";
	}

}
