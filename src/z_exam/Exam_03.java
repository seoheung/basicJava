package z_exam;

public class Exam_03 {
	public static void main(String[] arge) {
		
		/*
		 [3-1] 	다음 연산의 결과를 적으시오.
		 
								
				  	int x = 2;
				  	int y = 5;
				  	char c = 'A'; // 'A'의 문자코드는 65
				  	
				  System.out.println(1 + x << 33); 6 
				  => 3의 10진수 00000011을 왼쪽으로 33칸 밀으라는 뜻 32바퀴 돌면 결국 오버플로우때문에 제자리 3*2의1승
				  System.out.println(y >= 5 || x < 0 && x > 2); true
				  => y는 5보다 크거나 같다 ||  x는 0보다 작고 2보다 크다. || or결합은 한쪽만 true여도 true값을 낸다
				  System.out.println(y += 10 - x++); 13
				  => y += 10은 y+10값을 y가 갖는다. 15 - 2
				  System.out.println(x+=2); 5
				  => 위에서 x++해줬어서 x는 3이란 값을 갖고 있고 x += 2는 x+2값을 x가 갖는다. 그래서 3+2 
				  System.out.println( !('A' <= c && c <='Z') ); false
				  => (c는 'A'보다 같거나 큼 &&(교집합) c는 'Z'보다 작거나 같음)는 것이 !아니라고 부정. 맞는소린데 아니라고 하니깐 false
				  System.out.println('C'-c); 2
				  => 'A'의 문자코드는 65이니깐 'C'의 문자코드는 67. 67-65 = 2
				  System.out.println('5'-'0'); 5
				  => 유니코드 char 5 는 53 - char 0 은 48
				  System.out.println(c+1); 66
				  => 캐릭터가 인트로 변해서 계산. 'A'의 문자코드 65니깐 
				  System.out.println(++c); B
				  => 앞에 ++ 붙으면 바로 표현해줌 
				  System.out.println(c++); B
				  => 뒤에 ++붙으면 표현은 원래 값 써주지만 인식은 하나 증가한거로 저장돼
				  System.out.println(c); C
				  => 앞에 두문제에서 c++해줬기 때문에 C
				
			
				 
		[3-2] 	아래의 코드는 사과를 담는데 필요한 바구니(버켓)의 수를 구하는 코드이다. 만일
				사과의 수가 123개이고 하나의 바구니에는 10개의 사과를 담을 수 있다면, 13개의 바구니
				가 필요할 것이다. (1)에 알맞은 코드를 넣으시오.
				
							
					int numOfApples = 123; // 사과의 개수
					int sizeOfBucket = 10; // 바구니의 크기(바구니에 담을 수 있는 사과의 개수)
					int numOfBucket = ( (1) ); // 모든 사과를 담는데 필요한 바구니의 수
					System.out.println("필요한 바구니의 수:"+numOfBucket);
					
					123/10 = 12.3 정수부분만 남겨야 하니깐 
					 
				   => numOfApples%sizeOfBucket > 0 ? numOfApples/sizeOfBucket +1 : numOfApples/sizeOfBucket;
				    numOfApples%sizeOfBucket == 0 ? 0 : 1; , numOfApples%sizeOfBucket > 0 ? 1 : 0;
					   나머지가 0보다 크니? 물어보는거야 왜냐면 나머지 사과들도 바구니에 넣어야하니깐
					  3개가 남아버리잖아 이 나머지 사과를 넣을려면 바구니 하나가 필요해
					   몫값에다가 +1를 해줘야돼 
					   
					   올림 : (numOfApples/sizeOfBucket+0.9*10)/10;
					 
					
					   
		[3-3]	아래는 변수 num의 값에 따라 ‘양수’, ‘음수’, ‘0’을 출력하는 코드이다. 삼항 연산자를 이용해서 (1)에 알맞은 코드를 넣으시오.
				[Hint] 삼항 연산자를 두 번 사용하라.	
								 								
					int num = 10;
					System.out.println( num>0 ? "양수" : num==0 ? "0" : "음수"; );

					=> num>0 ? "양수" : num==0 ? "0" : "음수";
					
					
					
		[3-4]	 아래는 변수 num의 값 중에서 백의 자리 이하를 버리는 코드이다. 만일 변수 num
				 의 값이 ‘456’이라면 ‘400’이 되고, ‘111’이라면 ‘100’이 된다. (1)에 알맞은 코드를 넣으
				 시오.	
				 				  				 		
				 	int num = 456;
					System.out.println(num/100*100);	
					
					=> int/int는 정수값만 나옴. num/100하면 소수점 생략하고 정수값4만 나옴. 거기에 다시 100을 곱해줌.
					num-num%100
					
					  
					  
		[3-5]    아래는 변수 num의 값 중에서 일의 자리를 1로 바꾸는 코드이다. 만일 변수 num의
			      값이 333이라면 331이 되고, 777이라면 771이 된다. (1)에 알맞은 코드를 넣으시오.	
			      
			      	int num = 333;
					System.out.println(num/10*10+1);
					
					=> int/int는 정수값만 나옴. num/10하면 소수점 생략하고 정수값만 나옴. 거기에 다시 10을 곱해주고 +1를 해줌.
					
					
					
		[3-6]	아래는 변수 num의 값보다 크면서도 가장 가까운 10의 배수에서 변수 num의 값을
				뺀 나머지를 구하는 코드이다. 예를 들어, 24의 크면서도 가장 가까운 10의 배수는 30이
				다. 19의 경우 20이고, 81의 경우 90이 된다. 30에서 24를 뺀 나머지는 6이기 때문에 변
				수 num의 값이 24라면 6을 결과로 얻어야 한다. (1)에 알맞은 코드를 넣으시오.
				
				[Hint] 나머지 연산자를 사용하라.
				
					int num = 24;
					System.out.println(10-num%10);
					
					=> 3-4의 업그레이드 10의자리만 보면 된다. num/10*10+10 가까운 10의 배수 찾음 -> (num/10+1)*10-num
					num에 10으로 나눈 후 나머지를 다시 10에 빼줌. 나머지 값들은 결국 1~9이기때문에 
					x+y=10, y=10-x
					
					
						
		[3-7]	아래는 화씨(Fahrenheit)를 섭씨(Celcius)로 변환하는 코드이다. 
				변환공식이 'C = 5/9F ×(F - 32)'라고 할 때, (1)에 알맞은 코드를 넣으시오. 단, 변환 결과값은 소수점
				셋째자리에서 반올림해야한다.(Math.round()를 사용하지 않고 처리할 것)	
					
					int fahrenheit = 100;
					float celcius = (int)(5/9F*(fahrenheit-32)*100+0.5)/100F;
					System.out.println("Fahrenheit:"+fahrenheit);
					System.out.println("Celcius:"+celcius);
					
					*100+0.5)/100F
					=> int로 쓰면 앞에 5/9에서 소수점이 안나오게 되니깐 5/9에 F를 넣어준다. 소수점 셋째자리에서 반올림 해야한다고 
					했으니 뒤로 2칸 가줘야 하니 100곱하고 반올림 값 0.5해준 후 다시 100F으로 나눠줄것
					
					
					
		[3-8] 	아래 코드의 문제점을 수정해서 실행결과와 같은 결과를 얻도록 하시오.
		
					byte a = 10;
					byte b = 20;
					byte c = a + b; => byte c = (byte)(a+b);
					=> JVM의 피연산자 스택이 피연산자를 4byte단위로 저장하기 때문에 4byte형보다 작은 녀석들의 연산시에 4byte형태로 변환하여 연산한다.
					자동으로 int로 형변환해서 연산하기 때문에 byte로 형변환 해줘야 함.
					char ch = 'A';
					ch = ch + 2; => ch = (char)(ch + 2);
					=> 자동으로 int로 형변환해서 연산하기 때문에 cahr로 형변환 해줘야 함.
					float f = 3 / 2; => float f = 3/2F; float3/2
					=>소수점 표현을 위해서 F넣어주기. 캐스팅해주는게 더 좋음.
					long l = 3000 * 3000 * 3000; => long l = 3000L * 3000 * 3000;
					=> 기본형이 int(4byte)이기 때문에 int범위를 넘어서기 때문에 
    	   			그냥 입력안돼 그러니 맨뒤에 long타입이라는걸 알려줘야함. L를 마지막에 넣어주면 안돼 연산순서때문에 
					float f2 = 0.1f;
					double d = 0.1;
					boolean result = (float)d==f2;
					System.out.println("c="+c);
					System.out.println("ch="+ch);
					
					System.out.println("f="+f);
					System.out.println("l="+l);
					System.out.println("result="+result);
					=>float f2 = 0.1f; 그냥 숫자 표현한것이고
					 double d = 0.1;는 2^-1으로 표현이 가능함. 즉, 0.1에 근사치 0.999999
					
					 
					 
		[3-9] 	다음은 문자형 변수 ch가 영문자(대문자 또는 소문자)이거나 숫자일 때만 변수 b
				의 값이 true가 되도록 하는 코드이다. (1)에 알맞은 코드를 넣으시오.	
				
					char ch = 'z';
					boolean b = ( 'a'<=ch&&ch<='z' || 'A'<=ch&&ch<='Z' || '0'<=ch&&ch<='9' );
					System.out.println(b);
				
					=> 'a'<=ch<='z' 이런식으로 한번에 쓸수가 없음. 교집합할껀지 합집합할껀지 생각
					양쪽모두 true일대 ture값이 나오기 때문에 교집합 
					'a'<=ch&&ch<='z'
					대문자 또는 소문자라고 했으니 ||
					영문자 이거나 숫자일때 ||
					연산 순서는 &&가 먼저이기 때문에 괄호 필없음
					
					
					
		[3-10]	 다음은 대문자를 소문자로 변경하는 코드인데, 문자 ch에 저장된 문자가 대문자
				 인 경우에만 소문자로 변경한다. 문자코드는 소문자가 대문자보다 32만큼 더 크다. 예를
				 들어 'A'의 코드는 65이고 'a'의 코드는 97이다. (1)~(2)에 알맞은 코드를 넣으시오.	
				
					char ch = 'A';
					char lowerCase = ( 'A'<=ch&&ch<='Z' ? (char)(ch+32) : ch);
					System.out.println("ch:"+ch);
					System.out.println("ch to lowerCase:"+lowerCase);	
					
					=> 대문자인 경우에만 바꾸니깐 대문자인지 물어보는 조건식을 만들어.
					대문자라는게 트루일경우 32보다 크게 만들어서 소문자로 만들어야 하니깐 그런데 문자로 끄내야하기때문에 
					char로 형변환 시켜주고 펄스일때는 저장된 문자가 그대로 와야하기때문에 변수를 써줌 
			
			
			
					
		*/
		
	}
}		
		

