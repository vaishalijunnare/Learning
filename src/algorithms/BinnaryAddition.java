/**
 * 
 */
package algorithms;

/**
 * @author vettle
 * 
 * This is the solution for Introduction to Algorithms by CORMEN 3rd Edition
 * Exercise 2.1 - 3
 *
 */
public class BinnaryAddition {

	/**
	 * @param args
	 * Time complexity O(n)
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1[] = {1,1,1,1};
		int number2[] = {1,1,1,1};
		
		
		BinnaryAddition binnaryAddition = new BinnaryAddition();
		int sum[] = binnaryAddition.sumBinaryNumbers(number1,number2);
		Utils.printArray(number1);
		Utils.printArray(number2);
		Utils.printArray(sum);
	}

	private int[] sumBinaryNumbers(int[] number1, int[] number2) {
		// TODO Auto-generated method stub
		int sum[]= new int[number1.length+1];
		int carry =0;
		for(int i=number1.length-1;i>=0;i--){
			int num1 = number1[i];
			int num2 = number2[i];
			sum[i+1] = getCarryAndSum(num1, num2, carry)[1];
			carry = getCarryAndSum(num1, num2, carry)[0];
			if(i==0){
				sum[0] = carry;
			}
		}
		return sum;
	}
	
	private int[] getCarryAndSum(int num1, int num2, int carry){
		int sum = num1+num2+carry;
		if(sum == 3){
			return new int[]{1,1};
		}else if(sum == 2){
			return new int[]{1,0};
		}else if(sum == 1){
			return new int[]{0,1};
		}else{
			return new int[]{0,0};
		}
	}
}
