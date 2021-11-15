package com.javaex.ex03;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수: ");
		int num = sc.nextInt();
		
		if(num>=60) {
			//조건문이 True 일때
			System.out.println("합격입니다.");
		} else {
			//조건문이 False 일때
			System.out.println("불합격입니다.");
		}
		
		
		sc.close();
	}

}
