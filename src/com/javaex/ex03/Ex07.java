package com.javaex.ex03;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		//조건문 연습문제-4
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요 : ");
		int point = sc.nextInt();

		//논리 연산자를 이용한 코드
//		if (point>=90) {
//			System.out.println("A등급");
//		} else if (90>point && point>=80) {
//			System.out.println("B등급");
//		} else if (80>point && point>=70) {
//			System.out.println("C등급");
//		} else if (70>point && point>=60) {
//			System.out.println("D등급");
//		} else {
//			System.out.println("F등급");
//		}

		//요약된 코드
		if (point>=90) {
			System.out.println("A등급");
		} else if (point>=80) {
			System.out.println("B등급");
		} else if (point>=70) {
			System.out.println("C등급");
		} else if (point>=60) {
			System.out.println("D등급");
		} else {
			System.out.println("F등급");
		}
		
		sc.close();
	}

}
