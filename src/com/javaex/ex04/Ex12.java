package com.javaex.ex04;

public class Ex12 {

	public static void main(String[] args) {
		//반복문 continue 예제 문제
		for(int i=1; i<=20; i++) {//1에서 20까지 20번 반복해라
			
			if(i%2==0 || i%3==0) {//2의 배수거나 3의 배수면 여기에 들렸다 가라
				continue;//반복문의 처음으로 돌아가라
			}
			System.out.println(i);
		}
	}

}

//응용문 1
//for (int i=1; i<=20; i++){
//if(!(i%2==0 || i%3==00)) { !(i가 2나 3의 배수) 가 아니면 들어가서 i를 출력해라
//	System.out.println(i);
//}
//응용문 2
//for(int i=1; i<=20; i++) {
//	if(i%2==0 || i%3==0) { //2나 3의 배수면 들어가서 아무것도 하지 마라
//		
//	}else {//아니라면 i를 출력해라
//		System.out.println(i);
//	}
//}