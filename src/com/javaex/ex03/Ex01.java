package com.javaex.ex03;

public class Ex01 {

	public static void main(String[] args) {
		/*
		int i = 0;
		
		while(i<5) {
			System.out.println("i like java" + i);
		
			i++;
		}		
		*/
		
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("\"단을 입력하세요.\"");
		int dan = sc.nextInt();
		int i = 1;
		
		while(i<10) {
			System.out.println(dan + " * " + i + " = " + dan*i);
			i++;
		}
		sc.close();
		*/
		
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("\"단을 입력하세요.\"");
		int dan = sc.nextInt();
		
		for(int i = 1;  i<10; i++) {
			System.out.println(dan + " * " + i + " = " + dan*i);
		}
		sc.close();
		*/
		
		/*
		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.println("\"숫자를 입력하세요.\"");
			int num = sc.nextInt();
			
		if(num==0) {
			System.out.println("종료");
			break;
		}
		if(num%3==0) {
			System.out.println("3의 배수입니다.");
		}else {
			System.out.println("3의 배수가 아닙니다.");	
		}	

		}
		sc.close();
		*/
		
		/*
		for(int i =1; i<=20; i++) {
			if(i%2==0||i%3==0) {
			}else {
				System.out.println(i);
			}
			
		}
		*/

			/*
			for(int dan = 2;  dan<10; dan++) {
				for(int i = 1; i<10; i++) {
					System.out.println(dan + " * " + i + " = " + dan*i);
				}
			}
			*/

		for(int i = 1; i<7; i++) {
			for(int a = 1; a<i; a++) {
				System.out.print("*");
			}
			System.out.println("*");	
		}				
			
		
		
			}


	}