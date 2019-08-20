package b_Operatioin;

public class Operation_02 {
	public static void main(String [] args){
		/*
			1. 증감연산자(++,--)
				- 증가연산자(++) : 피연산자의 값을 1증가시킨다.
		 		- 감소연산자(--) : 피연산자의 값을 1감소시킨다.
		 
		 */
//			Q
//				1.int형변수 i에 3의 값을 저장해주세요.
				int i = 3;
				i++; 
				System.out.println(i);
				++i;
				System.out.println(i);
				
				int j = ++i +3;
				System.out.println(j); //i=?, j=? 
				System.out.println(i); //++ 단항연산 해지고 이항연산되는거 앞에 뿔뿔있으면 i를 먼저 키움, 
//			 	                               뒤에뿔뿔붙으면 먼저i의 값을 넣어주고 그다음 식(값)에서 i를 증가
				int k = 50;
				int t = 20;
				
				int result = k++ + ++t + 10 + ++k; //50 + 21 + 10+ 52 순서대로 50 + 1+20 + 10 + 1+51
						System.out.println(result);		
				
	
		/*
			2. 부호연산자(+,-)
		  		- 부호연산자는 피연산자의 부호를 변경하는데 사용된다.
		  		- char, boolean자료형에는 사용할 수 없다.
		  	 				
		 */
				int i2 = -10;
				i2 = -i2; //음숫값 양숫값 할때 쓰는거
				
		/* 
			3. 비트전환 연산자(~)
		 		- 정수형과 char에만 사용 가능하다. 컴퓨터가 알아듣는 2진수
		 	 
			   	 10  : 00001010 => 10
			 	~10  : 11110101 => -11 (1의보수)
			 	~10+1: 11110110 => -10 (2의보수)
			 	
		 */
				byte b3 = 10;
				int b4 = ~b3;// 1의 보수 -11
				System.out.println(b4);
				
				// ~ 연산의 경우 이항연산과 똑같이 연산 byte, short, char의 경우 int로 변한 후 연산된다.
				
		/*
			4. 논리부정연산자 ( ! )
			  	 - boolean형에만 사용 가능
			  	 - true => false, false => true
		  	  			
		 */
				boolean power = false;
				//powerd의 값을 부정하여 power변수에 저장
				power = !power; // 스위치 조작할때 처음 펄스인상태에 버튼! 누르면 트루로 되자너
				
		/*
			5. 산술연산자 
		     	- 사칙연산자 (+,-,*,/), 나머지 연산자 (%), 쉬프트연산자 (<<,>>,>>>)
		         두개의 피연산자를 취하는 이항 연산자 이다.  
		   
			6. 사칙연산자
		     	- int형 보다 작은 자료형간의 연산은 int형으로 형변환 후 연산을 수행한다.
		       	  : byte + short = int + int => int
		     	- 두개의 피연산자 중 자료형의 하나이상 4byte형 보다 큰 경우는 큰 쪽의 자료형의 맞춰서 형변환 후 연산을 수행한다.
		       	  : char + float = float + float => float
		     	- 정수형간의 나눗셈에서 0으로 나누는 것은 금지되어 있다.
		            		
		 */
				byte aa = 1;
				short bb = 129;
				
				//aa와 bb의 합을 변수 cc에 저장
				
				int cc = aa + bb;
				
				//aa와 bb의 합을 byte형 dd에 저장
														
				byte dd = (byte)(aa + bb); 	//캐스팅은 단항 +는 이항연산 캐스팅을 맨 마지막에 해줘여ㅑ 하니깐 괄호로 묶은 다음에 캐스팅 할 것
				System.out.println(dd);
				
		/*
			7. 나머지 연산자(%)
		     	- 왼쪽의 피연산자를 오른쪽의 피연산자로 나눈고 난 나머지 값을 돌려주는 연산자
		     	- boolean형을 제외한 모든 기본자료형에 사용가능하다.
		     
		 */
				int firstNum = 10; //먼저 받은 숫자 의미
				int secondNum = 3;
				// firstNum을 sencondNum으로 나눈 결과를 share라는 변수에 저장해
				
				int share = firstNum/secondNum;//몫
				//fisrtNum을 secondNum으로 나눈 나머지를 remain이라는 변수에 저장
				int remain = firstNum%secondNum;//나머지
				
				//10을 3으로 나눈 몫은 3이고 나머지는 1이다.
			     
				//int + 문자열 스트링 문자열은 띄어쓰기도 포함 +			
				System.out.println(firstNum + "을 " + secondNum + "으로 나눈 몫은 " + share + "이고 " + "나머지는 " + remain + "이다."); 
			
		/*
			8. 쉬프트 연산자 (<<곱하기,>>나누기,>>>) 
		   	 	- 정수형에만 사용 가능하다.
		   	 	- 피연산자의 각자리(2진수)를 오른쪽 또는 왼쪽으로 이동한다.
		   	 	- 연산속도가 매우 뛰어남으로 사용한다.
		   	 	- << : x<<n x*2^n의 결과와 같다.
		   	   	  >> : x>>n x*2^n의 결과를 가진다
		 */
				byte bbb = 10;
				int result2 = bbb << 32; //다사ㅣ 돌아와서 원래 값으로
				System.out.println(result2);
		
		/*
			9. 비교연산자 
		    	- 두개의 변수 또는 리터럴을 비교하는데 사용된다. 이항연산 = 양쪽의 타입을 맞춰야 함.
		    	- 주로 조건문과 반복문의 조건식에 사용되며 연산결과는 true, false이다. 
		  
		  
			10. 대소비교연산자( <.>,<=,>=)
		    	- boolean형을 제외한 기본형 변수에 사용가능하다. 참조형에는 안쓴다는 소리
		    
		    
			11. 등가비교연산자 ( == , != )  
		 		- 모든자료형에 사용가능하다.
		 	
			 	수식      |       연산결과	
			 	x>y     |  x가 y보다 클때만 true, 그외에는 false
			 	x<y     |  x가 y보다 작을때만 true, 그외에는 false
			 	X>=y    |  x가 y보다 크거나 같을때만 true, 그외에는 false 
			 	x<=y    |  x가 y보다 작거나 같을때만 true, 그외에는 false	
			 	x==y    |  x가 y보다 같을때만 true, 그외에는 false
			 	x!=y    |  x가 y보다 다를때만 true, 그외에는 false
			 	

		 		
		 		
		 */
				System.out.println(5<10);
				
				int a = 50;
				int b = 35;
				
				System.out.println(a>b);
				System.out.println('0'==0);
				
				float ff = 0.1F; //그냥 숫자 표현한것
				double dd2 = 0.1;//왜냐면 더블값은 2^-1으로 표현이 가능함. 0.1에 근사치 0.999999
				
				System.out.println(ff == dd2); // 다름  
				
				
			/*	
			12. 비트연산자 (비트는 2진수 &, |, ^ 몇승이아니라)
			 	- 이진비트연산을 수행한다.
			 	- 실수형인  float과 double을 제외한 모든 기본형에 사용 가능하다.
			 	
			 	& (AND연산) - 피연산자 중 양쪽의 값이 1이면 1의 결과를 얻는다. 한개라도 0이면 안돼
			 	| (OR연산) - 피연산자중 한쪽의 값이 1이면 1의 결과를 얻는다. 한개라도 1이면 1값
			 	^ (XOR연산) - 피연산자의 값이 서로 다르면 1의 결과를 얻는다.	
			 
				3   -> 00000011
				7   -> 00000111
				3^7 -> 00000100 => 4
				3|7 -> 00000111 => 7
				3&7 -> 00000011 => 3
					
			 */
					
				System.out.println(3&7);
				System.out.println(3|7);
				System.out.println(3^7);
				
				System.out.println(true|true); //둘다 1로 인식
				System.out.println(true&true);
				
			/*
			13. 논리연산자 (&&, ||)
				- 피연산자로 boolean형 값 또는 boolean형에 결과를 하는 조건식만 허용
				- 조건식과 반복문에서 조건식 값의 결합에 활용된다.
				- && 연산자가  ||보다 연산우선순위가 높다. //&&가곱하기 ||더하기라고 생각 생각만 해 진짜 아니고
				
				|| (OR결합)  : 피연산자중 어느 한쪽만 true이면 true의 결과를 얻는다. 합집합
				&& (AND결합) : 피연산자중 양쪽 모두 true일때 true의 결과를 얻는다. 교집합
				
				10<=x<=20 이렇게 쓸수 없고 10<=x, x<=20 10<=x&&x<=20
			 	
			 */
//			
			//1. 변수 x의 j값을 저장해주세요.					 
			char x = 'J';	
			//2.  x의 값이 영어 대문자이면 true의 결과를 출력하는 조건식을 만들어주세요.
//				대문자일려면 x의 범위가 어떻게 되어야 하는가? 
//				'A'<=x<='Z' 이대로는 못쓰니깐 분할 'A'<=x, x<='Z'  교집합 할껀지 합집합할껀지 생각	
			System.out.println('A'<=x && x<='Z');
			System.out.println('a'<=x && x<='z');
				
			//3. 영문자인지 조건식
//				영문자= 대문자 또는 소문자 
			System.out.println('A'<=x && x<='Z'||'a'<=x && x<='z'); //우선순위 괄호 안해도 되는게 &&가 먼저니깐
			
			//5.숫자형
			System.out.println('0'<=x && x<='9');
			
			//6.영문자 또는 숫자형
			System.out.println('A'<=x && x<='Z'||'a'<=x && x<='z'||'0'<=x && x<='9');
				
			/*
			14. 삼항연산자 
			  - 세 개의 피연산자를 필요로 하기 때문에 삼항연산자로 이름지어 졌다.
			  - 삼항연산자의 조건식의 결과에 따라 true또는 false인 식이 사용된다.
			  - 기본구조
			  		(조건식) ? 식1 : 식2; 트루면 식1 펄스면 식2 가지수가 둘중 하나 일때 
			  		
			 */
			int x2 = -10;
//			x2 > 0 ? x2 : -x2 //x2가 영보다 크냐?
			int result3 = x2 > 0  ? x2 : -x2;		
			System.out.println(result3);	//절댓값 구해주는 코딩
						
			//1. x3에 100의 값을 저장해주세요
			int x3 = 100;
			
			//2. x3의 값이 양수이면 "양수", 음수이면 "음수", 0이면 "0"의 결과값을 
		    //   result4에 저장해주세요
			//   (x3> 0) = "양수" (x3 < 0) = "음수" (x3 = 0) = "0"
			//   음수또는0 x==0
			 
			String result4 = x3>0 ? "양수" : x3==0 ? "0" : "음수";
						
			//3. result4의 값을 출력해
			System.out.println(result4);
			
			/*
			15. 대입연산자(=,op=)
              - 변수에 값 또는 수식의 연산결과를 저장하는데 사용된다.
              - 연산우선순위가 가장 낮다.
              
			  
			 */
			//1. int형 변수 i5에 5의 값을 저장
			int i5 = 5;
			//2. i5에 10을 더하여 i5에 저장
//			i5 = i5 + 10;
			i5 += 10; //자신의 타입을 유지해 연산을 해 자신에게 넣을때 캐스팅 필요없음
//			i5 <<= 10; i5 = i5<<10
			
			
			//random
			//주사위 1~6
			int random1 = (int)(Math.random()*6+1);//괄호는 캐스팅 연산해야하니깐 캐스팅이 우선순위 연산 
			System.out.println(random1);
			
			int random2 = (int)(Math.random()*45+1);
			System.out.println(random2);
			
			//47미포함에서 ~ 537포함 => 우선 앞과 뒤를 포함과 미포함으로 만들어주기
			int random3 = (int)(Math.random()*490+48); //*포함되는 수와 미포함하는 수사이의 정수의 갯수+시작숫자
			System.out.println(random3);
			
			//반올림
			//1. float타입의 변수 f4에 3.141592를 저장
			float f4 = 3.141592F;
//			(int)(+0.5); 
			
			float aaaa = 3.5F;
			int result7 = (int)(aaaa+0.5);
			System.out.println(result7);
			
			float a5 = 3.141592F;
//			*1000 하면 3141.592
//			+0.5
//			int 3142
//			/1000F
			float result8= (int)(f4*1000+0.5)/1000F;
			System.out.println(result8);
			
			//2. 158.5987 
//			*100 하면 15859.87
//			+0.5
//			int 
//			/100F
			
			float a6 = 158.5987F;
			float result9 = (int)(a6*100+0.5)/100F;
			System.out.println(result9);
			
			
			
			
			
			
			
			
			
					
	}
}
