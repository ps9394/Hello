package day02;

/*
 * 오늘날짜를 출력하는대 
 * 날짜에 해당하는 데이터는 정수형 변수에담아서 출력해보세요.
 * 
 * 참고] 
 * 정수형  변수만드는방법
 * 형식]
 * int 변수이름; // 변수선언
 * 변수이름 = 데이터; // 변수초기화
 * 
 * 형식2] int 변수이름 = 데이터 ; // 변수선언 & 변수초기화
 * 
 *     ***
 *     변수만드는형식
 *     데이터타입        변수이름=데이터;
 *     
 *     예]
 *         1. 문자
 *         
 *              char ch = 'A';
 *              
 *         2. 논리값
 *              boolean bool = true;
 *              
 *         3. 정수
 *             int no = 7;
 *             
 *         4. 실수
 *             dounle val = 3.14;
 *            
 *         5. 문자열 : 문자열은 기본형 타입은 아니지만 
 *                      빈번히 사용되는 데이터이기때문에
 *                      자바에서 편의를 제공해주고 있다.
 *                      
 *                 a. 
 *                    String strl = "abcd"
 *                    
 *                 b.
 *                    String str2 = new String("abcd");
 *            
 *           변수작성형식
 *           
 *              [접근지정자] [속성] 데이터타입 변수이름 = 데이터;
 */

public class Test02 {
	// 문자열 변수
	static String msg ="오늘은";
	static int month = 2;
	static int day = 12;
	
	int num1 = 100;
	int num2 = 500;
	
					
	
	public static void main(String[] dsd) {
		// 문자열 변수
		String msg ="오늘은";
		int month = 2;
		int day = 12;
		
		System.out.println(msg + month + "월 " + day+"일 입니다.");
		
	}
	/*
	    class2와 단어와 Teacher를 결합해서 변수의 이름을 만들경우
	    
	       1. camel표기법
	           
	           String class2Teacher = "전은석";
	           
	       2. snake 표기법
	           String class2_teacher = "전은석";
	           
	 */

}
