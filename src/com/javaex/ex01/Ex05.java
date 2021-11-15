package com.javaex.ex01;

public class Ex05 {

	public static void main(String[] args) {
		
		System.out.println(2+3.4); // 계산값이 출력
		
		System.out.println("2+3.4"); //계산되지 않고 식 자체를 문자열로 인식하여 출력.
		
		double var01 = 2+3.4; // 3.4라는 실수가 있기때문에 실수형인 double을 사용
		
		System.out.println(var01);
		
		//1. 자동형변환(int+double)
		int var02 = 2;
		double var03 = 3.4;
		
		System.out.println(var02+var03);
		// 정수+실수 = 실수로 나옴. int가 실수로 형이 변환됨.
		
		//2. 강제 형변환
		int i = (int)11112.323232; // int는 소수점을 띄우지 못함.
		System.out.println(i);
		// 정수형에 실수값을 주었을때 정수값만 표현됨. 강제로 형이 변환된것.
		float f01 = 12.5f;
		int i01 = (int)f01;
		System.out.println("강제형변환 결과:"+i01);// 결과 12
		//=> 실수값인 f01이 정수형으로 삽입됨.
		
		//1.2 강제형변환 확대변환
		byte v01 = 10;
		int v02 = v01;
		System.out.println("확대변환 결과:"+v02);//결과 : 10
		
		//1.3 강제형변환 축소변환(정상)
		int v03 = 10;
		byte v04 = (byte)v03;
		System.out.println("축소변환 결과:"+v04);//결과 : 10
		//int값이 더 작은 자료형인 byte값으로 변환됨.
		//작은 크기의 자료형에 값을 저장하는 방법으로, 자료를 잃을 가능성이 있다.
		
		//1.3 강제형변환 축소변환(비정상)
		int v05 = 34324324;
		byte v06 = (byte)v05;
		System.out.println("축소변환(비정상) 결과:"+v05);
		System.out.println("축소변환(비정상) 결과:"+v06);//결과 : 100
		
		//1.4 실수-->정수 : 소수부분이 없어짐
		double v07 = 5.57;
		int v08 = (int)v07;
		System.out.println("실수->정수:"+v08);//결과 : 5
		
		//1.5 정수-->실수 :
		int v09 = 7;
		double v10 = (double)v09;
		System.out.println("정수->실수:"+v10);//결과 : 7.0
	}
}
