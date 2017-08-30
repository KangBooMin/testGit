package com.javaex.ex01;

import java.util.Scanner;

public class Ex07 {
	
	public static void main(String[] args) {
		/*
		Scanner sc = new Scanner(System. in);
		System.out.println("이름을 입력해 주세요.");
		System.out.print("이름: ");
		String name = sc.nextLine();
		System.out.println("당신의 이름은 " + name + " 입니다.");
		
		sc.close();
		*/
		
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해 주세요.");
		System.out.print("숫자: ");
		int num = sc.nextInt();
		System.out.println("입력하신 숫자는 " + num + " 입니다.");
		
		sc.close();
		*/
		
		/*
		Scanner sc = new Scanner(System. in);
		System.out.println("이름을 입력해 주세요.");
		System.out.print("이름: ");
		String name = sc.nextLine();

		System.out.println("숫자를 입력해 주세요.");
		System.out.print("숫자: ");
		int num = sc.nextInt();
		
		System.out.println("당신의 이름은 \"" + name + "\" 나이는 \"" + num + "\"입니다." );
		
		sc.close();
		*/
		
		Scanner sc = new Scanner(System. in);
		System.out.println("점수를 입력해 주세요.");
		System.out.print("점수: ");
		int num = sc.nextInt();
		if(num>=60) {
		System.out.println("합격입니다.");
		}
		if(num<60) {
		System.out.println("불합격입니다.");
		}
		
		sc.close();
	}

}
