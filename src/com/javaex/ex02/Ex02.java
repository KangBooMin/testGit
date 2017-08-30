package com.javaex.ex02;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System. in);
		System.out.println("숫자를 입력해 주세요.");
		System.out.print("숫자: ");
		int num = sc.nextInt();
		
		if(num>0) {
			if(num%2==0)
				System.out.print("\"짝수\"");	
			}else if(num%2!=0) {
				System.out.println("\"홀수\"");
			}
		if(num<0) {
			System.out.println("\"음수입니다.\"");
		}else if(num==0) {
			System.out.println("\"0입니다.\"");
		}
		sc.close();
			
		
	}
}
