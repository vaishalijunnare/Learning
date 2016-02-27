package javapractice;


public class SumOfArray {
	int[] myList = {10, 20, 30, 40, 50, 60};
	int length = myList.length;
	int result=0;
	public static void main(String[] args) {
		SumOfArray SOA = new SumOfArray();
		SOA.Sum();
		SOA.Average();
	}

	private int Sum(){
        for (int i=0; i<(length-1);i++){
        		result = myList[i]+result;
    	}System.out.println("The sum of all Array content is :" +result);
    	return result;
    }
	
	private void Average(){
		double avg = 0;
		avg = result/length;
		System.out.println("Average of total Sum is: "+avg);
	}
}
