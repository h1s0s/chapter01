package com.javaex.ex04;

public class Ex09 {
	
	public static void main(String[] args) {
		//While문 6의 배수이자 14의 배수인 가장 작은 정수 찾기 문제.
		
		int i = 0;//비교할 정수 초기화
		
		while(true) {//조건식 true로 적으면 무한 반복됨.
			i++;//증감식
			
			if(i%6==0 && i%14==0) {//6의 배수 이면서, 14의 배수인가?
				System.out.println(i);
				break;//반복문 탈출
			}
		}
	}
 }
