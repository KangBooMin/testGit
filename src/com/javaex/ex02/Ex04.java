package com.javaex.ex02;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		/*
		Scanner sc = new Scanner(System. in);
		System.out.println("\"입력하세요.\"");
		int code = sc.nextInt();
		switch(code) {
			case 2 : code = 28;
			break;
			case 4: 
			case 6: 
			case 9: 
			case 11: code = 30;
			break;
			default : code = 31;
			break;			
		}
		System.out.println(code);
		
		
		sc.close();
		*/
		
		Scanner sc = new Scanner(System. in);
		System.out.println("\"점수를 입력하세요.\"");
		System.out.print("점수: ");
		int num = sc.nextInt();
		
		if(num>=90) {
			System.out.println("\"A등급 입니다.\"");
		}else if(num>=80) {
			System.out.println("\"B등급 입니다.\"");
		}else if(num>=70) {
			System.out.println("\"C등급 입니다.\"");
		}else if(num>=60) {
			System.out.println("\"D등급 입니다.\"");
		}else {
			System.out.println("\"F등급 입니다.\"");
		}
		
		
		sc.close();
	}
	
}
