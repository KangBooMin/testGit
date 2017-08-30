package com.javaex.ex04;

public class Ex01 {

	public static void main(String[] args) {

		/*
		 * for (int i = 1; i < 7; i++) {
		 * 
		 * int num = (int) (Math.random() * 45) + 1;
		 * 
		 * System.out.print(num + " "); }
		 */
		
		/*
		int no1 = (int) (Math.random() * 45) + 1;
		int no2 = (int) (Math.random() * 45) + 1;
		int no3 = (int) (Math.random() * 45) + 1;
		int no4 = (int) (Math.random() * 45) + 1;
		int no5 = (int) (Math.random() * 45) + 1;
		int no6 = (int) (Math.random() * 45) + 1;
		
		System.out.print(no1 + " ");
		System.out.print(no2 + " ");
		System.out.print(no3 + " ");
		System.out.print(no4 + " ");
		System.out.print(no5 + " ");
		System.out.print(no6 + " ");
		*/
		
		
		int[] noArr = new int[6];

		
		for(int i=0; i<noArr.length; i++) {
			noArr[i] = (int) (Math.random() * 45) + 1;
		}

		for(int i=0; i<noArr.length; i++) {
			System.out.print(noArr[i] + "  ");
		}
		
	}

}
