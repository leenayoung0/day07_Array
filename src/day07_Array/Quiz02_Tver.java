package day07_Array;

import java.util.Scanner;

public class Quiz02_Tver {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int arr[] = new int[] {10,54,13,17,25,30};
		String odd_even = null;
		System.out.print("Â¦, È¦ ÀÔ·Â : ");
		odd_even = input.next();
		if(odd_even.equals("Â¦¼ö")) {
			for(int i=0; i<arr.length ; i++) {
				if(arr[i]%2 == 0) {
					System.out.println(odd_even+":"+arr[i]);
				}
			}
		}else {
			for(int i=0; i<arr.length ; i++) {
				if(arr[i]%2 == 1) {
					System.out.println(odd_even+":"+arr[i]);
				}
			}
		}
		System.out.println("===============");
		for(int i=0; i<arr.length ; i++) {
			if(arr[i]%2 == 0 && odd_even.equals("Â¦¼ö")) {
				System.out.println(odd_even+":"+arr[i]);
			}else if(arr[i]%2 == 1 && odd_even.equals("È¦¼ö")){
				System.out.println(odd_even+":"+arr[i]);
			}
		}
	}
}




