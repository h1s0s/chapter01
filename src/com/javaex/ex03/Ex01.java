package com.javaex.ex03;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수: ");
		int num = sc.nextInt();
		//if문, if-else문
		if(num>=60) { // 입력한 값이 60점 "이상" 이니 ?
			//질문이 True 이면 실행 되는 영역.
			System.out.println("합격입니다.");
		} 
		
		sc.close();
	}
}
