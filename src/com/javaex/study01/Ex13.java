package com.javaex.study01;

public class Ex13 {

	public static void main(String[] args) {
		//복습, 예습
		System.out.println("난수=====");
		//난수 선언
		int num = (int)(Math.random()*10)+1;
		//int 변수명 = (int)(Math.random()*최댓값)+최솟값;
		//1. Math.random() 이라는 난수 메소드는 0.000...~0.999 까지의 무한한 숫자를 가지고 있다.
		//2. 이 코드에 사용자가 원하는 난수 범위의 최댓값을 곱하고 (int)로 강제형변환을 하고(실수->정수)
		//   이후 +최솟값을 더해주면 정수의 숫자들만 남는다. 
		System.out.println(num);
		//기본자료형 <-> 참조자료형
		//기본자료형(int, double 등)
		//1.선언되는 변수는 실제의 값을 변수에 저장한다.
		//2.
		//참조자료형(string, Scanner 등)
		System.out.println("배열=====");
		//1.배열, 열거, 클래스, 인터페이스를 이용하여 선언된 변수는 메모리의 번지를 값으로 갖는다(참조한다).
		//배열
		int[] intArray = new int[5];//배열 선언 메소드
		//자료형[] 변수명 = new 자료형[배열개수];
		intArray[0] = 1;//선언한 배열의 [0]번째 칸에 수를 대입함.
		//대괄호 안의 숫자는 변수를 넣어 반복문으로 값을 조정할 수 있다.
		System.out.println(intArray[0]);//배열에 대입한 값을 불러온다.
		//배열 생성과 동시에 초기화하는 방법(두가지 방법 모두 가능)
		int[] intArray2 = new int[] {1,2,3,4};
		int[] intArray3 = {1,2,3};
		//배열 복사 방법
		System.out.println("배열복사=====");
		int[] intArray4 = new int[3];//선언
		intArray4[0] = intArray3[0];//초기화 선언
		System.out.println(intArray4[0]);
		//배열의 비교
		System.out.println("배열비교=====");
		//배열이 같으려면 "1.배열의 갯수 2.순서에 따른 값" 이 같아야 한다
		int[] intArray5 = {1,2,3};
		int[] intArray6 = {1,2,3};
		System.out.println(intArray5==intArray6);//false가 나옴..
		//내가 생가한 이유 : 배열마다 번지가 다르기 때문에, 각 칸마다 비교해주어야 한다고 생각함.
	}

}
