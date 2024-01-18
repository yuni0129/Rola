package com.desigin_shinbi.exercise;

import java.util.Scanner;

public class Rola {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("ローラもおもとしとうございます。");
		
		boolean agreed = false;
		while(!agreed) {
			System.out.println("このローラもつれってくださいますね。");
			System.out.print("[Y] はい [N] いいえ");
			String input =scanner.nextLine();
			if(input.equals("y")){
				agreed = true;		
			} else {
				System.out.println("そんなひどい・・・");
			}
		}
		System.out.println("うれしゅうございます。");
		
		scanner.close();

	}

}


