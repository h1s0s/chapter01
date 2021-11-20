package com.javaex.study01;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		// Practice03 Ex07 => 2분
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		
		for(int y=1; y<=num; y++) {
			for(int x=1; x<=y; x++) {
				System.out.print(y);
			}System.out.println("");
		}
		
		
		sc.close();
		
	}

}
