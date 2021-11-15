package com.javaex.ex01;

public class Ex03 {
	public static void main(String[] args) {
		// char은 문자형으로 1글자의 문자만 표시 가능.
		char ch01 = '1'; // 문자
		char ch02 = 65; // 정수형(코드값)으로 인식
		System.out.println(ch01);
		System.out.println(ch02);
		
		boolean b01 = true;
		boolean b02 = false;
		System.out.println(b01);
		System.out.println(b02);
		
		int a = 3;
		int b = 5;
		boolean result = a<b;
		
		System.out.println(result);
		
		char st = '안';
		String str = "안";
		String str2 = "안녕하세요";
		
		System.out.println(st);
		System.out.println(str);
		System.out.println(str2);
	}
}
