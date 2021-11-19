package com.javaex.ex05;

public class Ex03 {

	public static void main(String[] args) {
		
		//메모리개념, length
		//int[]공간이 메모리에 생성될때 칸의 갯수가 length라는 속성에 부여됨.
		//배열변수명.length == 칸의개수
		//
//		int[] intArray = new int[3];
//		
//		intArray[0] = 3;
//		intArray[1] = 7;
//		intArray[2] = 13;
//		intArray[3] = 55;
		//==>요약
		int[] intArray = {3,7,13,55};
		
		for(int i=0; i<intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		//배열을 출력할때 없는 방을 출력하라고 하거나
		//비어있는 방을 출력하라고 할때는 0이 보여진다.
		
		//배열의 복사
		//int[] intB = intA(X)
		//이유: 위에 메소드는 복사 방법이 아닌 intArray와 intArray가 가르키는 배열이 똑같음. 이말은 하나의 배열의 방을 수정하면 같이 바뀜.
		//요약하자면 힙에있는 배열에 접근하는 변수가 2개가 생긴거임
		//더 요약하면 주소(번지)가 대입된거임.
		//옳은 방법
		//intB[0] = intA[0];
		//intB[1] = intA[1];
	}
}
