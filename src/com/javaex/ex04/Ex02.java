package com.javaex.ex04;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("단을 입력해 주세요");
		System.out.print("단: ");
		int dan= sc.nextInt();
		
		int i=1;//i=0이면? dan*0부터 반복됨.
		
		while(i<10) {
			System.out.println(dan+"*"+i+"="+dan*i);
			i++;//i=i+1;과 같음, 증감식에서 값이 1보다 클경우 사용.
		}
		
		sc.close();
	}

}
