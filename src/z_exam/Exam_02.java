package z_exam;

public class Exam_02 {
	public static void main(String[] arge) {
			
		/*
		[2-1] 
			다음 표의 빈 칸에 8개의 기본형(primitive type)을 알맞은 자리에 넣으시오.
           
           		크 기     1 byte     2 byte     4 byte     8 byte
           		종 류           
           		논리형    boolean 
		 		문자형    			char		
		 		정수형    byte		short		int		   long
		 		실수형							float	   double
		 
		 
		[2-2] 
			주민등록번호를 숫자로 저장하고자 한다. 이 값을 저장하기 위해서는 어떤 자료형
			(data type)을 선택해야 할까? regNo라는 이름의 변수를 선언하고 자신의 주민등록번호로
               초기화 하는 한 줄의 코드를 적으시오.
           
           		int nerNo;
           		int nerNo = 940219;
           		
           		=> [변수타입][변수명] = 값;
         
		[2-3] 
			다음의 문장에서 리터럴, 변수, 상수, 키워드를 적으시오.
         		
         		int i = 100; 
  		 		long l =100L;
  	  	 		final float PI = 3.14f;
  	  	 
		 		- 리터럴 : 100, 100L, 3.14F
		 		- 변수 : i, l, l, PI
		 		- 키워드 : int, long, final float
		 		- 상수 : PI
		 		
		 		=> 리터럴은 값이고 변수는 변수명, 키워드는 정해진 예약어, 상수는 변하지 않는 값이니깐 final
		 
		[2-4] 
			다음 중 기본형(primitive type)이 아닌 것은?  b
				
				a. int
				b. Byte
				c. double
				d. boolean
				
				=> Byte의 B가 대문자임.
 
		[2-5]
			다음 문장들의 출력결과를 적으세요. 오류가 있는 문장의 경우, 괄호 안에 ‘오
			류’라고 적으시오.
				
				
				System.out.println("1" + "2"); → (12)
				System.out.println(true + ""); → (true)
				System.out.println('A' + 'B'); → (131)
				System.out.println('1' + 2); → (51)			
				System.out.println('1' + '2'); → (99)				
				System.out.println('J' + "ava"); → (Java)				
				System.out.println(true + null); → (변수 명명규칙에 예약어 사용하지 말랬음)

		[2-6] 
			다음 중 키워드가 아닌 것은?(b, c, d, e)
				
				a. if
				b. True
				c. NULL
				d. Class
				e. System	
				
		[2-7] 
			다음 중 변수의 이름으로 사용할 수 있는 것은? (a, f )
			
				a. $ystem -> 특수문자는 $와_는 사용가능
				b. channel#5 -> 특수문자는 $와_는 사용가능
				c. 7eleven -> 숫자로 시작하면 안됨
				d. If -> 예약어 사용 불가
				e. 자바 -> 한글 사용 금지
				f. new -> 사용가능
				g. $MAX_NUM -> 상수의 이름은 모두 대문자
				h. hello@com -> 특수문자는 $와_는 사용가능		
				
		[2-8] 
			참조형 변수(reference type)와 같은 크기의 기본형(primitive type)은? (a, d)
				
				a. int
				b. long
				c. short
				d. float
				e. double									

				=> 참조형 변수는 4byte
				
		[2-9] 
			다음 중 형변환을 생략할 수 있는 것은? (d, e)
			
				byte b = 10; 
				char ch = 'A';
				int i = 100;
				long l = 1000L;
				
				a. b = (byte)i; -> b는 byte인데 i는 int란 말이야, 근데 int인 i를 byte에 넣을려면 캐스팅해줘야돼 
				b. ch = (char)b; -> ch는 char인데 b는 byte잖아, 근데 char랑 byte가 범위가 포함이 안되는것이 있어서 b를 char 캐스팅해줘야돼
				c. short s = (short)ch; -> s는 short인데 char인 ch야, 근데 캐릭터인 ch를 short인 s에 넣어줘야하는데 char랑 short범위가 포함이 안되는게 있어서 캐스팅 short해줘야돼
				d. float f = (float)l; -> f는 float인데 l은 long이란 말이지 long이 float보다 작아서 형변환 안해줘도 돼
				e. i = (int)ch; -> i는 int이고 ch는 char임 근데 int안에 char포함되기 때문에 형변환 안해줘도 돼	
				
		[2-10] 
			char타입의 변수에 저장될 수 있는 정수 값의 범위는? (10진수로 적으시오)
			
				0~65535
				
		[2-11] 
			다음중 변수를 잘못 초기화 한 것은? (a, b, c, e )
			
				a. byte b = 256;
				b. char c = '';
				c. char answer = 'no';
				d. float f = 3.14
				e. double d = 1.4e3f;
				
		[2-13] 
			다음 중 타입과 기본값이 잘못 연결된 것은? (b, c, e)
				
				a. boolean - false
				b. char - '\u0000'
				c. float - 0.0 -> 0.0F
				d. int - 0
				e. long - 0 ->0L, 기본형이 int(4byte)이기 때문에 int범위를 넘어서기 때문에 
    	   					        그러니 맨뒤에 long타입이라는걸 알려줘야함. 방법은 L을 꼭 붙이기
				f. String - ""

     
		 
		 */
	

	}

}
