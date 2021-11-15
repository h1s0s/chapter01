package com.javaex.ex02;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력해 주세요.");
		System.out.print("이름:");
		String name = sc.nextLine();
		
		System.out.println("나이를 입력해 주세요.");
		System.out.print("나이:");
		int age = sc.nextInt();
		
		sc.nextLine(); //<--엔터를 흡수(숫자를 입력받은 후 문자열을 입력받을때 콘솔 입출력 문제 해결법)
		
		System.out.println("사는 곳을 입력해 주세요.");
		System.out.print("지역:");
		String adress = sc.nextLine();
		
		System.out.println("당신의 이름은 "+name+" 나이는 "+age+" 사는곳은 "+adress+" 입니다.");
		
		sc.close();
	}
}
