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
			System.out.println("1.����ó ���");
			System.out.println("2.����ó ����");
			System.out.println("3.����ó ����");
			System.out.println("4.��� ����ó ����");
			System.out.println("5.����");
			System.out.print(">>>");
			num = sc.nextInt();
			
			switch(num) {
			case 1: System.out.print("�̸� �Է� : ");
					newN = sc.next();
					if(name.contains(newN)) {
						System.out.println("�̸��� ���� �մϴ�");
						break;
					}
					else name.add(newN);
					
					System.out.print("����ó �Է� : ");
					newP = sc.next();
					phone.add(newP);
					break;
					
			case 2: System.out.print("ã�� �̸� �Է� : ");
					n = sc.next();
					if(name.contains(n)==false) {
						System.out.println(n+"���� ��Ͽ� �����ϴ�");
					}
					if(name.contains(n)) {
						i=name.indexOf(n);
						System.out.println(name.get(i)+" : "+phone.get(i));
					}
					break;
					
			case 3: System.out.println("������ ����ó �̸� �Է� : ");
					n = sc.next();
					i = name.indexOf(n);
					System.out.println(name.remove(i));
					System.out.println(phone.remove(i));
					System.out.println("����ó�� �����Ǿ����ϴ�");
					break;
				
			case 4: for(int j=0; j<name.size(); j++) {
						System.out.println(name.get(j)+" : "+phone.get(j));
					}
					break;
					
			case 5: System.out.println("���α׷��� ����˴ϴ�");
					System.exit(1);
			
			}
			System.out.println();
					
		}
	}

}
