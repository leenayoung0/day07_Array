package day07_Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList name = new ArrayList();
		ArrayList phone = new ArrayList();
		String n, p, newN, newP;
		int num, i;
		while(true) {
			System.out.println("1.연락처 등록");
			System.out.println("2.연락처 보기");
			System.out.println("3.연락처 삭제");
			System.out.println("4.모든 연락처 보기");
			System.out.println("5.종료");
			System.out.print(">>>");
			num = sc.nextInt();
			
			switch(num) {
			case 1: System.out.print("이름 입력 : ");
					newN = sc.next();
					if(name.contains(newN)) {
						System.out.println("이름이 존재 합니다");
						break;
					}
					else name.add(newN);
					
					System.out.print("연락처 입력 : ");
					newP = sc.next();
					phone.add(newP);
					break;
					
			case 2: System.out.print("찾을 이름 입력 : ");
					n = sc.next();
					if(name.contains(n)==false) {
						System.out.println(n+"님은 목록에 없습니다");
					}
					if(name.contains(n)) {
						i=name.indexOf(n);
						System.out.println(name.get(i)+" : "+phone.get(i));
					}
					break;
					
			case 3: System.out.println("삭제할 연락처 이름 입력 : ");
					n = sc.next();
					i = name.indexOf(n);
					System.out.println(name.remove(i));
					System.out.println(phone.remove(i));
					System.out.println("연락처가 삭제되었습니다");
					break;
				
			case 4: for(int j=0; j<name.size(); j++) {
						System.out.println(name.get(j)+" : "+phone.get(j));
					}
					break;
					
			case 5: System.out.println("프로그램이 종료됩니다");
					System.exit(1);
			
			}
			System.out.println();
					
		}
	}

}
