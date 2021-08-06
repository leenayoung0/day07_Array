package day07_Array;

import java.util.ArrayList;

public class Ex03_List {
	public static void main(String[] args) {
		/*
		 List
		 - ArrayList
		 - LinkedList
		 - Stack...���� �ִ�.
		 
		 ArrayList
		 - �����Ϳ� ���� ������ �ִ�. index�� ���� �����ϴ�
		 - �ߺ��� �����͸� ������ �� �ִ�.
		 - �迭���� �ٸ��� ���� �ٸ� �ڷ����� ���� �� �ִ�.
		 - ������ ũ�⸦ ���´�.
		 
		 int [] a = new int[10]
		 */
		ArrayList arr = new ArrayList();
		
		arr.add("123");
		arr.add("456");
		
		System.out.println(arr.get(0));
		System.out.println(arr.get(1));
		
		System.out.println(arr.size());
		
		System.out.println(arr.contains("123")); //�ش��ϴ� ���� �ִ��� ����
		System.out.println(arr.remove("123")); // �ش��ϴ� �� �����
		//-> System.out.println(arr.remove(1));  //index�� �ش��ϴ� �ε����� �ִ� �� �����
		System.out.println(arr);
		System.out.println(arr.get(0));
		
		arr.clear(); // ���� �����
		System.out.println("���� �� arr : "+arr);
	}

}
