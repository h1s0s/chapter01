package com.javaex.study01;

import java.util.Scanner;

public class Ex03_if {
	public static void main(String[] args) {
		//반복문
		Scanner sc=new Scanner(System.in);
		
		System.out.print("점수:");
		int point = sc.nextInt();
		if(point>=60) {						//if(조건식)
			System.out.println("합격입니다.");	//조건식이 True일때
		}else {								
			System.out.println("불합격입니다.");//if조건문이 false일때
		}
		
		
		sc.close();
	}
}
