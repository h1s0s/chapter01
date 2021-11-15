package com.javaex.ex01;

public class Ex09 {
	public static void main(String[] args) {
		
		//논리연산자
		System.out.println("6.논리연산자");
		int a = 5;
		int b = 7;
		
		//AND(&&)
		System.out.println("AND(&&)연산자");
		System.out.println(true&&true); // true (비교 대상에 boolean타입이 아닌 것이 오면 에러남)
		System.out.println(true&&false); //false
		System.out.println(false&&true); //false
		System.out.println(false&&false);//false
		//응용
		System.out.println("AND(&&)응용");
		System.out.println(a<b&&a<b); //T&&T true
		System.out.println(a>b&&a<b); //F&&T false
		System.out.println(a>b&&a>b); //F&&F false
		
		//OR(||)
		System.out.println("OR(||)연산자");
		System.out.println(true||true);//true
		System.out.println(true||false);//true
		System.out.println(false||true);//true
		System.out.println(false||false);//false
		System.out.println("OR(||)응용");
		System.out.println(a<b||a<b); //T||T true
		System.out.println(a>b||a<b); //F||T true
		System.out.println(a>b||a>b); //F||F false
		
		//NOT(!)
		System.out.println("NOT(!)연산자");
		System.out.println(!true); //false
		System.out.println(!false); //true
		System.out.println("NOT(!)응용");
		System.out.println(a>b); //false
		System.out.println(!(a>b)); //!F -> true
	}
}
