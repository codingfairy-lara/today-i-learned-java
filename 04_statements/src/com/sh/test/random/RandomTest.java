package com.sh.test.random;

import java.util.Random;
import java.util.Scanner;

public class RandomTest {

	public static void main(String[] args) {
		RandomTest r = new RandomTest();

		r.test1();

		r.test3();

	}

	public void test1() {
		Random rnd = new Random();
		System.out.println("0~9까지의 랜덤수 : " + rnd.nextInt(10));
		System.out.println("1~10까지의 랜덤수 : " + (rnd.nextInt(10) + 1));
		System.out.println("20~35까지의 랜덤수 : " + (rnd.nextInt(16) + 20));
		System.out.println("0 또는 1 : " + (rnd.nextInt(2)));
	}

	/**
	 * 가위바위보게임
	 */
	public void test3() {
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();

		System.out.println("=== 가위 바위 보 게임 ===");
		System.out.print("숫자를 선택하세요(1.가위/2.바위/3.보) : ");

		int userNo = sc.nextInt();
		int comNo = rnd.nextInt(3) + 1;

		String user = userNo == 1 ? "가위" : (userNo == 2 ? "바위" : "보");
		String com = comNo == 1 ? "가위" : (comNo == 2 ? "바위" : "보");

		System.out.println("======= 결과 =======");
		System.out.println("당신은 " + user + "를 냈습니다");
		System.out.println("컴퓨터는 " + com + "를 냈습니다");
		System.out.println("===================");

		// 실행결과
		if (comNo == userNo)
			System.out.print("비겼습니다.");
		else if (comNo == 1 && userNo == 2)
			System.out.print("당신이 이겼습니다.");
		else if (comNo == 2 && userNo == 3)
			System.out.print("당신이 이겼습니다.");
		else if (comNo == 3 && userNo == 1)
			System.out.print("당신이 이겼습니다.");
		else if (comNo == 1 && userNo == 3)
			System.out.print("당신이 졌습니다.");
		else if (comNo == 2 && userNo == 1) 
			System.out.print("당신이 졌습니다.");
		else if (comNo == 3 && userNo == 2)
			System.out.print("당신이 졌습니다.");
		
		if (comNo == userNo)
			System.out.print("비겼습니다.");
		else if ((comNo == 1 && userNo == 2) || (comNo == 2 && userNo == 3) || (comNo == 3 && userNo == 1))
			System.out.print("당신이 이겼습니다.");
		else if ((comNo == 1 && userNo == 3) || (comNo == 2 && userNo == 1) || (comNo == 3 && userNo == 2))
			System.out.print("당신이 졌습니다.");
	}

}
