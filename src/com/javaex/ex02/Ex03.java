package com.javaex.ex02;

import java.util.Scanner;

public class Ex03 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System. in);
		System.out.println("과목 코드를 입력해 주세요.");
		System.out.print("코드: ");
		int num = sc.nextInt();
		
		if(num>0 && num<5) {
			if(num==1) {
				System.out.print("\"R101호 입니다.\"");	
			}
			if(num==2) {
				System.out.print("\"R202호 입니다.\"");	
			}
			if(num==3) {
				System.out.print("\"R303호 입니다.\"");	
			}
			if(num==4) {
				System.out.print("\"R404호 입니다.\"");	
			}
		}else {
			System.out.println("\"상담원에게 문의하세요.\"");
		}
		
	sc.close();
		
	
	
	}
	
}
