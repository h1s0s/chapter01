package com.javaex.ex04;

public class Ex07 {

	public static void main(String[] args) {
		//for 반복문 연습문제(중첩반복문)-1
		//내가 짠 코드
//		for(int x=0; x<6; y++) {
//			System.out.print("*");
//			for(int x=0; x<=5; x++) {
//				System.out.print("*");
//			} System.out.println("");
//		}
		//강사님이 짠 코드
		for(int y=1; y<=6; y++) {
			for(int x=1; x<=6; x++) {//가로로 별을 6번 찍게 한다.
				System.out.print("*");
			}
			System.out.println("");//가로로 별을 6번 찍은 후 -> 줄을 바꿈
		}
	}

}

