package com.javaex.ex01;

public class Ex07 {

	public static void main(String[] args) {
		//대입연산자
		int a = 7;
		int b = 2;
		
		//1. 산술연산자
		System.out.println("1.산술연산자:");//sysout 컨+스페이스바 하면 자동완성
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		
		System.out.println(a/b); // 3.5 "몫 3" 나머지 1 나눈 값의 몫을 표시해 주는 명령어
		System.out.println(a%b); // 3.5 몫 3 "나머지 1" 나눈 값의 나머지를 표시해주는 명령어
	
		//2. 산술연산자 / % 심화
		System.out.println("2.산술연산자 / % 심화");
		System.out.println(7.0/2.0); // 3.5
		System.out.println(7.0%2.0); // 1.0
		System.out.println(0.007%0.002); // 0.001
		
		//3. 부호연산자
		System.out.println("3.부호연산자");
		int var = -3;
		int pVar = +var;
		int mVar = -var;
		System.out.println(pVar); // +(-3)
		System.out.println(mVar); // -(-3)
	
		//4. 증감연산자
		System.out.println("4.증감연산자");
		System.out.println("a="+ a);// a값 7
		System.out.println("a="+ ++a);// a를 1 올린다, a를 출력한다.
		System.out.println("a="+ a++);// a를 출력한 뒤 1을 올린다.
		System.out.println("a="+ a);// a값 9
	
		System.out.println("b="+ b); // b=2
		System.out.println("b="+ --b);
		System.out.println("b="+ b--);
		System.out.println("b="+ b);// b=0
	}
}
