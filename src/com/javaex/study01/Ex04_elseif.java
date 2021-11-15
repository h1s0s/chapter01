package com.javaex.study01;

import java.util.Scanner;

public class Ex04_elseif {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.");
		System.out.print("숫자:");
		int num = sc.nextInt();
		if(num>0) {
			System.out.println("양수입니다.");
		} else if(num<0) {
			System.out.println("음수입니다.");
		} else {
			System.out.println("0입니다.");
		}
		
		sc.close();
	}
}
