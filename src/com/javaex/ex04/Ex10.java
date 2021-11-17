package com.javaex.ex04;

import java.util.Scanner;

public class Ex10 {
	
	public static void main(String[] args) {
		//반복문 연습문제
		//숫자를 입력받아 3의 배수인지 판별하는 프로그램을 작성하세요
		//0이 입력되면 프로그램이 종료됩니다.
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("숫자를 입력하세요");
			int num = sc.nextInt();
			if(num==0) {//0이 입력되면 종료, 반복문 탈출
				System.out.println("종료");
				//Tip. 반복문 탈출 응용법
				//반복문 전에 boolean형의 변수를 true로 초기화 해놓고
				//while(변수)로 작성하면 변수=false로 사용해도 탈출 가능
				//차이점은 break는 바로 빠져 나가지만
				//변수=false로 놓았을때 반복문 끝까지 간 후 처음으로 돌아가 걸러짐.
				break;
			} else if(num%3==0) {
				System.out.println("3의 배수 입니다.");
			} else {
				System.out.println("3의 배수가 아닙니다.");
			}
		}
		
		
		sc.close();
	}
}
