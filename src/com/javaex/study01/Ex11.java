package com.javaex.study01;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		// while 반복문 문제
		// 구구단 문제
		Scanner sc = new Scanner(System.in);
		
		System.out.println("단을 입력해 주세요");
		System.out.print("단: ");
		int dan= sc.nextInt();
		int i=1;
		
		while(i<10) {
			System.out.println(dan+"*"+i+"="+dan*i);
			i++;
		}
		
		sc.close();
	}

}
