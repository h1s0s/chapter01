package com.javaex.study01;

public class Ex08_while {

	public static void main(String[] args) {
		//while문
		int i = 0;//초기화, 초기값
		// i의 값이 10보다 같거나 작다면 true, 크다면 false가 된다.
		while (i<=10) { //조건식: 값이 true일때 반복, false일때 중단.
			System.out.println("Hello World"+i);//반복영역
			
			i++;//i에 1을 더함, 증감식
		}
	}
}
