package com.sh.test.condition;

import java.util.Scanner;

public class Test9 {

	public static void main (String[] args) {
		
		Test9 study = new Test9();
		study.test();
	}
	
	/**
	 * [문제 9]
- 클래스 : com.sh.test.condition.Test9.java
- 메소드명 : public void test()

    
       *********주메뉴*********
       a. 불고기버거 ------------5000
       b. 새우버거 --------------4000
       c. 치킨버거 --------------4500
       d. 한우버거 -------------10000
       e. 디버거 ----------------7000
       ***********************    
       
       *******사이드메뉴********
        1. 콜라 -------------------1500
        2. 사이다 -----------------1500
        3. 밀크쉐이크-------------2500
        4. 레드불------------------3000
        ***********************

       두메뉴를 순서대로 제시하고, 각각 사용자선택번호를 받으세요.
    예) 주메뉴에서 a, 선택후 사이드메뉴에서 4 선택시
    “불고기버거, 레드불은 총 8000원입니다“출력.
    
    각메뉴선택시 다른문자를  입력하면 “번호를 잘못 누르셨습니다. 영업을 종료합니다.”

	 */
	public void test() {
		Scanner sc = new Scanner(System.in);
		String menu = "*********주메뉴*********\n"
				+ "a. 불고기버거 ------------5000\n"
				+ "b. 새우버거 --------------4000\n"
				+ "c. 치킨버거 --------------4500\n"
				+ "d. 한우버거 -------------10000\n"
				+ "e. 디버거 ----------------7000\n"
				+ "***********************\n"
				+ "메뉴를 선택하세요 : ";
		String sideMenu = "*******사이드 메뉴********\n"
				+ "1. 콜라 -------------------1500\n"
				+ "2. 사이다 -----------------1500\n"
				+ "3. 밀크쉐이크-------------2500\n"
				+ "4. 레드불------------------3000\n"
				+ "***********************\n"
				+ "사이드 메뉴를 선택하세요 : ";
		System.out.print(menu);
		String choice1 = sc.next();
		String name1 = "";
		int price = 0;
		switch(choice1) {
		case "a" :
			name1 = "불고기버거";
			price = 5000;
			break;
		case "b" :
			name1 = "새우버거";
			price = 4000;
			break;
		case "c" :
			name1 = "치킨버거";
			price = 4500;
			break;
		case "d" :
			name1 = "한우버거";
			price = 10000;
			break;
		case "e" :
			name1 = "디버거";
			price = 10000;
			break;
		default : System.out.println("번호를 잘못 누르셨습니다. 영업을 종료합니다."); return;
		}

		System.out.print(sideMenu);
		String choice2 = sc.next();
		String name2 = "";
		switch(choice2) {
		case "1" :
			name2 = "콜라";
			price += 1500;
			break;
		case "2" :
			name2 = "사이다";
			price += 1500;
			break;
		case "3" :
			name2 = "밀크쉐이크";
			price += 2500;
			break;
		case "4" :
			name2 = "레드불";
			price += 3000;
			break;
		default : System.out.println("번호를 잘못 누르셨습니다. 영업을 종료합니다."); return;

		}

		System.out.printf("%s, %s 의 가격은 %d입니다.", name1, name2, price);
		
		
	}
}
