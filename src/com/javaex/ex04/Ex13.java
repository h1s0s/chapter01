package com.javaex.ex04;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		//do~while문
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.[0]이면 종료");
		
		int num;
		int sum = 0;

		//do~while문을 사용한 코드
		do {
			num = sc.nextInt();
			sum = sum + num;//입력한 숫자를 sum에 저장한다
			System.out.println("합계: "+sum);
		} while(num != 0);//숫자가 0이 아니면 반복
		System.out.println("종료");
			
		/*do~while문을 쓰지 않은 코드
		while(true) {
			int push = sc.nextInt();
			if(push==0) {
				System.out.println("합계: "+sum);
				System.out.println("종료");
				break;
			} else {
				sum = sum+push;
				System.out.println("합계: "+sum);
			}
		}*/
		sc.close();

			
	}

}
