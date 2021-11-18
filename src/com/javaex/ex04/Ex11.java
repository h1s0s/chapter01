package com.javaex.ex04;

public class Ex11 {

	public static void main(String[] args) {

		for(int i=1; i<=10; i++) {//반복문을 1->10까지 10번 돌려라
			
			if ( i%2==0 && i%3==0 ) {//2의 배수&&3의 배수이면 이 안에 들어와라
				//break;
				continue;
			}
			
			System.out.println(i);//반복횟수를 출력하라	
		}
		
	}

}
// if문 안에 break일때 출력결과
// 6번째 일때 break가 만나 반복문을 탈출함. => 출력을 하기 전에 반복문이 끝남.
//1
//2
//3
//4
//5
// if문 안에 continue일때 출력결과
// 6번째 일때 continue를 만나 반복문의 처음으로 돌아감 => 출력을 하기 전에 반복문이 처음으로 돌아갔고 7번째가 됨.
//1
//2
//3
//4
//5
//7
//8
//9
//10
