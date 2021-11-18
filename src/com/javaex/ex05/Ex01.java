package com.javaex.ex05;

public class Ex01 {

	public static void main(String[] args) {
		// 난수, 로또번호 만들기, 배열
		//1. 난수 코드로 로또번호 출력하기
//		int num01 = (int)(Math.random()*45)+1;
//		int num02 = (int)(Math.random()*45)+1;
//		int num03 = (int)(Math.random()*45)+1;
//		int num04 = (int)(Math.random()*45)+1;
//		int num05 = (int)(Math.random()*45)+1;
//		int num06 = (int)(Math.random()*45)+1;
//		
//		System.out.print(num01+"\t");
//		System.out.print(num02+"\t");
//		System.out.print(num03+"\t");
//		System.out.print(num04+"\t");
//		System.out.print(num05+"\t");
//		System.out.print(num06+"\t");
		//배열
		int[] ball = new int[6];//int형태의 배열 ball 선언후 6개의 공간 선언(0부터 만들어짐)
		
//		ball[0] = (int)(Math.random()*45)+1;
//		ball[1] = (int)(Math.random()*45)+1;
//		ball[2] = (int)(Math.random()*45)+1;
//		ball[3] = (int)(Math.random()*45)+1;
//		ball[4] = (int)(Math.random()*45)+1;
//		ball[5] = (int)(Math.random()*45)+1;
//		for(int i=0; i<6; i++) {
//			System.out.println(ball[i]);
//		}
		//위의 배열을 반복문으로 작성->
		for(int i=0; i<6; i++) {
			ball[i] = (int)(Math.random()*45)+1;
			System.out.println(ball[i]);
		}
		

		
	}

}
