package com.javaex.ex04;

public class Ex08 {

	public static void main(String[] args) {
		//for 반복문 연습문제(중첩반복문)-2
		//내가 짠 코드
//		for(int x=0; x<=6; x++) {
//			System.out.print("*");
//			if(x==1) {
//				System.out.print("*");
//			} else if(x==2) {
//				System.out.print("*");
//				System.out.print("*");
//			} else if(x==3) {
//				System.out.print("*");
//				System.out.print("*");
//				System.out.print("*");
//			} else if(x==4) {
//				System.out.print("*");
//				System.out.print("*");
//				System.out.print("*");
//				System.out.print("*");
//			} else if(x==5) {
//				System.out.print("*");
//				System.out.print("*");
//				System.out.print("*");
//				System.out.print("*");
//				System.out.print("*");
//			} else if(x==6) {
//				System.out.print("*");
//				System.out.print("*");
//				System.out.print("*");
//				System.out.print("*");
//				System.out.print("*");
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
//	}
//
//}
		//강사님이 짠 코드 ★★★★★ 응용하기 어려운 부분,, 많이 해보기
		for(int y=1; y<=6; y++) {
			for(int x=1; x<=y; x++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}
}
