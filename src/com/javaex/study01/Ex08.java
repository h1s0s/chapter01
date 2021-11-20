package com.javaex.study01;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Practice04 Ex08
		//오래 걸렸던 문제
		int[] lotto = new int[6];
		for(int y=0; y<lotto.length; y++) {
			lotto[y] = (int)(Math.random()*6)+1;
			for(int x=0; x<y; x++) {//조건식이 true일때 반복됨!!!
				if(lotto[y]==lotto[x]) {
					y--;
				}
			}
		}
		
		for(int i=0; i<lotto.length; i++) {
			System.out.print(lotto[i]+"  ");
		}
	}

}
