package com.javaex.ex02;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		//콘솔입력
		System.out.println("1. 콘솔입력");
		
		Scanner sc = new Scanner(System.in); // Scanner 클래스 생성자 (System.in)키보드 입력

		System.out.println("숫자를 입력 하세요.");
		int num = sc.nextInt();//num이라는 변수에 사용자에게 입력을 받는다.
		System.out.println("입력하신 숫자는 "+num+" 입니다.");
		
		sc.close();// 생성한 키보드를 닫아주는 코드
		
	}
}
