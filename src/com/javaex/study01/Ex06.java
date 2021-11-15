package com.javaex.study01;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");
		int point = sc.nextInt();
		if (point<60) {
			System.out.println("F등급");
		} else if (point<69) {
			System.out.println("D등급");
		} else if (point<79) {
			System.out.println("C등급");
		} else if (point<89) {
			System.out.println("B등급");
		} else {
			System.out.println("A등급");
		}
		sc.close();
	}
	
	
}
