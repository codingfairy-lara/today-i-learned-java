package sh.java.args;

public class ArgumentsStudy {

	/**
	 * 실행 매개인자
	 * 
	 */
	
	
	public static void main(String[] args) {
		ArgumentsStudy study = new ArgumentsStudy()	;
		
//		System.out.println(args.length);
//		for(int i = 0; i < args.length; i++)
//			System.out.printf("%d :%s\n", i, args[i]);
		
//		study.test1(args);
		study.test2(args);
		
		// 가변 매개인자
		int sum = study.add(1,2,3);
		System.out.println(sum); // 6
		
		sum = study.add(10, 20, 30, 40);
		System.out.println(sum); // 100

		sum = study.add(10, 20, 30, 40, 50);
		System.out.println(sum); // 150
		
		int[] arr = {4,5,6};
		sum = study.add(arr);
		System.out.println(sum); // 15
	}
	
	/**
	 * 가변 매개인자 처리
	 * - 배열로 처리
	 * - 다른 매개변수 사용시에는 마지막 자리에서 딱 한번만 사용 가능하다.
	 * 
	 */
	
	public int add(int... nums) { // 
		int sum = 0;
		for(int i = 0; i < nums.length; i++) {
			System.out.printf("%d : %d\n", i, nums[i]);
			sum += nums[i];
		}
		return sum;
	}
	
	
	/**
	 * @실습문제
	 * - 실행 인자로 넘긴 임의의 정수값을 모두 더한 총합을 출력
	 * - 1 2 3 -> 6
	 * - 10 20 30 40 -> 100
	 * 
	 */
	
	public void test2(String[] args) {
		int sum = 0;
//		for(int i = 0; i < args.length; i++) 
//			sum += Integer.parseInt(args[i]);
		for(String str : args)
			sum += Integer.parseInt(str);
		System.out.println(sum);
	}
	
	/**
	 * 사용자 정보 가져와서 출력
	 * 
	 */
	
	public void test1(String[] args) {
//		System.out.println(args.length);

		String name = null;
		char gender = ' ';
		int age = 0;
		double height = 0.0;
		double weight = 0.0;
		
		for(int i = 0; i < args.length; i++) {
			System.out.printf("%d :%s\n", i, args[i]);
			switch(i) {
			case 0 : name = args[i]; break;
			case 1 : gender = args[i].charAt(0); break;
			case 2 : age = Integer.parseInt(args[i]); break; // String -> int
			case 3 : height = Double.parseDouble(args[i]); break; // String -> double
			case 4 : weight = Double.parseDouble(args[i]); break;
			}
		}
			
		
		System.out.printf("이름 : %s\n", name);
		System.out.printf("성별 : %c\n", gender);
		System.out.printf("나이 : %d\n", age);
		System.out.printf("키 : %.1f\n", height);
		System.out.printf("몸무게 : %.1f\n", weight);
	
	
	}

}
