package com.sh.collection.list.book.run;

import java.util.Scanner;

import com.sh.collection.list.book.controller.BookManager;
import com.sh.collection.list.book.model.vo.Book;

public class TestBookManager {
	Scanner sc = new Scanner(System.in);
	BookManager bm = new BookManager();
	
	public static void main(String[] args) {
		TestBookManager t = new TestBookManager();
		t.menu();
		System.out.println("프로그램을 종료합니다.");
	}

	public void menu() {
		String menu = "*** 도서 관리 프로그램 ***\n"
				   + "1. 새 도서 추가\n"
				   + "2. 도서정보 정렬후 출력\n"
				   + "3. 도서 삭제\n"
				   + "4. 도서 검색출력\n"
				   + "5. 전체 출력\n"
				   + "6. 끝내기\n"
				   + "메뉴선택 : ";
		
		while(true){
			System.out.print(menu);
			int selected = sc.nextInt();
			switch (selected) {
			case 1: bm.addBook(inputBook()); break;
			case 2: bm.printBookList(bm.sortedBookList()); break;
			case 3: bm.deleteBook(bm.searchBook(inputBookTitle())); break;
			case 4: bm.printBook(bm.searchBook(inputBookTitle())); break;
			case 5: bm.printAll(); break;
			case 6: return;
			default: System.out.println("잘못 입력하셨습니다."); break;
			}
			
		}
	
	}

	public String inputBookTitle() {
		sc.nextLine();
		System.out.print("책제목을 입력하세요 : ");
		return sc.nextLine();
	}

	public Book inputBook() {
		System.out.print("책번호 : ");
		String bNo = sc.next();
		System.out.print("책카테고리 (1.인문/2.자연과학/3.의료/4.기타) : ");
		int category = sc.nextInt();
		sc.nextLine();
		System.out.print("책제목 : ");
		String title = sc.nextLine();
		System.out.print("저자 : ");
		String author = sc.nextLine();
		return new Book(bNo, category, title, author);
	}

}
