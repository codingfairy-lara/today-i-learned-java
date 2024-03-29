package sh.java.inheritance.basic;

/**
 * extends
 * - Child클래스는 Parent클래스를 확장한다.
 *
 */
public class Child extends Parent {
	
	/**
	 * Overriding 부모로 부터 물려받은 메소드를 자식클래스에서 고쳐쓰기
	 * - 메소드 시그니처(접근제한자, 리턴타입, 메소드명, 매개변수선언)가 동일
	 * - @Override 어노테이션 사용
	 */
	@Override
	public void say() {
		System.out.println("자식입니다.");
	}
	
	public void game() {
		System.out.println("자식이 LOL을 한다.");
	}
}
