package day07_Array;

public class Quiz01 {
	public static void main(String[] args) {
		int arr[] = new int[] {10,54,13,17,25,30};
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2==0) {
				System.out.println("¦�� : " +arr[i]);
			}
			//else
			if(arr[i]%2!=0) {
				System.out.println("Ȧ�� : " +arr[i]);
			}
		}
	}
	

}