package Assignments;

public class Duplicate {

public static void main(String[] args) {
		
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = i+1; j < arr.length-1; j++) {
			
				if(arr[i]==arr[j]) {
				
					System.out.println("Print Duplicate Values: "+arr[i] );
					
				}
			}
		}
		
					
			
			
		
	}

}
