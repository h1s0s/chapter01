package com.javaex.ex04;

public class Ex05 {

	public static void main(String[] args) {
		
		int result=0;
		
		for(int i=1; i<=10; i++) {
			result= i+result;
			System.out.println(i+" 까지의 합은"+(result));
			}
			System.out.println("1부터 10까지의 정수의 합은 "+ result +" 입니다.");
		}
	}

