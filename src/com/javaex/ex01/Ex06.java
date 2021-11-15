package com.javaex.ex01;

public class Ex06 {

	public static void main(String[] args) {
		
		double v01 = 5/4;
		System.out.println(v01);
		//결과 => 1.0
		//이유(내생각) : 숫자 5와 4는 정수이기 때문에 정수값으로 버림이 됨.
		//정답 :
		
		double v02 = (double)5/4;
		System.out.println(v02);
		//결과 => 1.25
		//이유(내생각) : 실수가 더 큰 자료형이기 때문에 정수 4가 실수가 됨.
		//정답 :
		
		double v03 = 5/(double)4;
		System.out.println(v03);
		//결과 => 1.25
		//이유(내생각) : 실수가 더 큰 자료형이기 때문에 정수 5가 실수가 됨.
		//정답 :
		
		double v04 = (double)5 / (double)4;
		System.out.println(v04);
		//결과 => 1.25
		//이유(내생각) : 실수끼리의 계산으로 실수값으로 출력.
		//정답 :
		
		int v05 = (int)1.3 + (int)1.8;
		System.out.println(v05);
		//결과 => 2
		//이유(내생각) : 1 + 1로 계산됨.
		//정답 :
		
		int v06 = (int)(1.3+1.8);
		System.out.println(v06);
		//결과 => 3
		//이유(내생각) : 3.1이라는 값을 int로 변환해서 3이 되었음.
		//정답 :
	}
}
