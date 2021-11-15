package com.javaex.ex01;

public class Ex08 {
	public static void main(String[] args) {
		//관계연산자, 결과값은 boolean형
		System.out.println("5.관계연산자");
		int n1 = 5; 
		int n2 = 3;
		System.out.println(n1<n2);//5가 3보다 작은가 false
		System.out.println(n1>n2);//5가 3보다 큰가 true
		System.out.println(n1<=n2);//5가 3보다 같거나 작은가 false
		System.out.println(n1>=n2);//5가 3보다 같거나 큰가 true
		System.out.println(n1==n2);//5와 3은 같은가 false
		System.out.println(n1!=n2);//5와 3은 다른가 true
	}
}
