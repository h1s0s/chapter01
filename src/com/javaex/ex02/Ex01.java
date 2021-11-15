package com.javaex.ex02;

public class Ex01 {

	public static void main(String[] args) {
		//콘솔출력 println print
		System.out.println("1. println print");
		System.out.print("안녕");
		System.out.println("하세요"); // 출력 후에 개행을 합니다.
		System.out.print("안녕하세요");
		System.out.print("안녕하세요\n");
		
		//println 사용법
		System.out.println("2. println 사용법");
		int i = 2345;
		double d = 3.14;
		String str = "굿모닝";
		char c = '한';
		String s = "한";
		
		String name ="한상선";
		
		System.out.println("안녕하세요");
		System.out.println(str); //굿모닝 출력
		System.out.println(i); //2345
		System.out.println(d);//3.14
		
		System.out.println(str+str); //굿모닝굿모닝 문자열의 합산이 가능.
		System.out.println(str+i+i); //문자열+정수 = 정수를 문자로 형변환함.
		System.out.println(i+i); //계산이됨.
		System.out.println("i+d");//i+d
		System.out.println(str+" 이랑 "+i);//굿모닝 이랑 2345
		
		System.out.println(i+i);
		System.out.println(i-i);
		System.out.println(i*i);
		System.out.println(i/i);
		
		System.out.println(c);//한
		System.out.println(c+c);//109240 = 한의 코드값이 더해져서 나옴
		System.out.println(c+s);//문자형이 문자열로 형변환이 됨
		
		System.out.println("제 이름은 "+name+" 입니다.");//제 이름은 한상선 입니다.
		
		
		//이스케이프시퀀스
		System.out.println("3. 이스케이프 시퀀스");
		System.out.println("안녕'하'세요");// 안녕'하'세요
		System.out.println("안녕\"하\"세요");// 안녕"하"세요 \"는 "로 출력
		System.out.println("안녕\\하\\세요");// 안녕\하\세요 \\는 \로 출력
		System.out.println("안녕\t하세요");//안녕	하세요 \t는 탭
		System.out.println("안녕\n하세요");//\n은 개행(엔터)
	}
}
