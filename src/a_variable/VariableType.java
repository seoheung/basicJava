package a_variable;

public class VariableType {
	public static void main(String[] args) {
	/*
	 변수의 타입
	 
	 1. 기본형(primitive type) 한개의 값을 저장할 때 
	 	- boolean, char, byte, short, int, long, float, double
	 
	 2. 참조형(reference type) 주소 
	 	- 8개의 기본형을 제외한 나머지 타입
	 	- 객체의 주소를 저장한다
	 	
	 3. 종류
	 	- 논리형 : 참 거짓 true, false 중 하나의 값을 갖으며, 조건식과 논리적 계산에 사용된다.
	 			ex) boolean
	 	- 문자형 : 문자 단 한개를 저장하는데 사용 
	 			ex) char 문자 다룰때 ''꼭 붙여서 써주기 
	 	- 정수형 : 소숫점 없는 숫자. 정수값을 저장하는데 사용된다. 
	 			ex) byte, short, int, long 자바는 기본 4바이트 운영체제라서 int가 기본형
	 	- 실수형 : 소숫점 까지 있는 숫자. 실수형값을 저장하는데 사용된다. 
	 	 		ex) float, double
	 	 		
	 4. 기본형 변수의 크기 (1byte = 8bit)
	  	- 1byte : boolean, byte 
	  	- 2byte : char, short
	  	- 4byte : int, float
	  	- 8byte : long, double 	
	  	
	 5.	논리형 - bloolean(기본값 false)
	 	- boolean형 변수에는 true, false를 저장할 수 있다.
	 	- boolean형 변수는 대답 (yes, no), 스위치(ON/OFF)
	 	- 데이터를 저장하는 최소단위가 1byte임으로 1byte의 크기를 가진다.
	 	
	 6. 문자형 - char
	    - 문자하나를 저장하기 위해 사용한다. (문자하나가 필수) 'A' ''꼭 사용하기
	    - 값을 정수형으로도 표현이 가능하다. 
	    - java는 Unicode문자체계를 이용한다. ->16진수
	    
	 7. 정수형 - byte, short, int, long  
	  	- 대표 자료형은 int이다.
	  	- byte나 short의 경우 크기가 작아서 범위를 넘어서 잘못된 결과를 
	  	   얻기 쉽다. => int형을 사용하는 것이 좋다. 연산할때 어차피 int형으로 바꾸기 때문에 그냥 처음부터 인트써
	  	- JVM의 피연산자 스택이 피연산자를 4byte단위로 저장하기 때문에 4byte형보다 작은 녀석들의 연산시에 4byte형태로 변환하여 연산한다.   
	  	
	 8. 실수형 - float, double
	 	- 대표 자료형은 double
	 	- 정수형이 아니라 실수형 값을 저장하는데 사용된다.
	 	- float : 1+8+23
	 	  double : 1+11+52
	  	- 실수형에서는 자료형을 선택할 때 값의 범위뿐만 아니라 정밀도 중요한 요소가 된다.
	  	
	  		
	 */
		
//		Q. 변수 ab를 true의 값으로 초기화 해주세요
//		[변수타입] [변수명] = 값;
		boolean ab = true;
		
//		Q. 변수 ac를 'p'의 값으로 초기화 해주세요 (에이비는 이미 앞에서 선언했기에 변수명을 다르게 해야함)
		char ac = 'p'; 
		
//		Q. byte형 변수 ad에 5000의 값을 저장해주세요 (바이트는 저장할 수 있는게 얼마 없음) 
		short ad = 5000;

//		Q. 변수 power를 false의 값으로 초기화 해주세요.
		boolean power = false; 
		
//		Q.power의 값을 true로 변경해주세요
		power = true; 
		
		char aa = 'A';
		char ba = 65;
		char ca = '\u0041'; //역슬러시는 특수문자로 인식, 역슬러시 뒤에 n가 오면 줄바꿈, u가오면 유니코드 의미, t는 탭키 4번누른 의미
		
		System.out.println(ca);
		
    	String str = "====\t----";  //길이 상관없음, ""붙여줘야함
    	System.out.println(str);
    	
    	
//		<Q> 
//    	1. byte형 변수에 51을 저장해주세요 //정숫값
    	   byte a = 51;
    	
//    	2. short형 변수에 500000 //작은 범위는 자기가 저장할 수 있는 범위까지 저장함
    	   short g = 5000;
    	
//    	3. int형 변수에 20억 
    	   int q = 2000000000;
    	   
//    	4. long형 변수에 50억 //50억저장할 수 있어야 하는데 왜 안될가? 
//    	   기본형이 int(4byte)이기 때문에 int범위를 넘어서기 때문에 
//    	   그냥 50억 입력안돼 그러니 맨뒤에 long타입이라는걸 알려줘야함. 방법은 L을 꼭 붙이기 
    	   long s = 5000000000L;
    	   
//    	 <Q>
//    	 1. float타입의 변수에 3.14456781356943을 저장 //소숫점 뒤에 F를 꼭 붙이기
    	   float gd = 3.14456781356943F;
    	   System.out.println(gd);
    	   
//    	 2. double타입의 변수에3.14456781356943을 저장 //소숫점이 있어서 기본형이라서 잘써짐, 바이트 수가 크니깐 정밀하게 쓰고 싶다면 더블
    	   double h = 3.14456781356943;
    	   System.out.println(h);
    	   
    	   
    	   byte b2 = 126;
    	   System.out.println(b2);
    	   b2++; //한단계 올려주라는 뜻 
    	   System.out.println(b2);
    	   b2++;
    	   System.out.println(b2); 
//			최대가 127까지라서 저장이 안돼 그래서 끝까지 가다가 최대표현하고 그다음 숫자가 
//    		맨 처음으로 돌아감 바이트의 가장작은 값은 -128임 overflow
    	   
    	/*
      9. 형변환(casting)
         - 기본형 변수간에는 형변환이 가능하다.
    	  
    	  byte -> short > int > long > float > double
    	                   ^
    	                        ㅣ  
    	            char ->
    	*/
    	   
    	   
//		  1. short타입의 변수에 600의 값을 저장
    	   	short y = 600;
    	   
//    	  2. int타입의 변수에 50000
    	   	int asd = 50000;
    	       	   	
//        3. char타입의 변수에 'T' 저장  
    	   	char asss = 'T';
    	   	
//    	  4. y의 값을 byte타입의 변수에 저장 //값을 하나 설정하고 위에 값을 써주고 캐스팅할 타입을 괄호안에 마지막에 써준다.
    	   	byte y2 = (byte)y;
    	   	    	   	
//    	  5. asd의 값을 char타입에 저장
    	   	char asd2 =(char)asd;
    	       	   	  	   	
//    	  6. asss의 값을 int타입에 저장 //용량이 작은거에 넣을때는 캐스팅을 쓰지만 용량이 큰걸로 가는데(호환)는 캐스팅 연산자를 생략해도 된다.
    	   	int asss2 = asss;
    	   	System.out.println(asss2);
    	   	
    	   	float ff2 = 3.14F;
    	   	double dd2 = 3.14;
    	   	
    	   	int rr = (int)ff2; //float이 더크니깐 int 캐스팅 해야함. float이랑 double은 실수형이니깐 정수형으로 바꿔줄 수 있는걸로 
    	   	System.out.println(rr);
    	   	
    	   	System.out.println(3/2); //수학은 소숫점까지 쓰지만 자바에서는 소숫점까지 허용하지 않음. 일반적으로 볼때는 int 
//    	   	타입이 같은거끼리 연산하면 답도 같은 타입으로 나옴.
//    	   	타입이 다른거끼리 안돼 다른거 끼리 하면 용량이 큰쪽 타입으로 연산 돼. 
//    	   	byte a = 2; 
//    	   	byte x = 4;
//    	   	4바이트보다 작은 애들은 jvm은 무조건 4바이트로 하니깐 바이트가 작아도 4바이트로int로 바꿈.
//    	   	
    	   	
    	   	byte kk = 50;
    	   	byte kk2 = 60;
    	   	char cc = 'A';
    	   	char cc2 = 'C';
    	   	
//    	   	값을 먼저 정해놓고
//    	   	kk3 = kk + kk2;
    	    int kk3 = kk + kk2;// byte + byte => int + int
    	   	
    	   	
//    	   	kk4 = kk + cc;//
    	   	int kk4 = kk + cc; // byte(1바이트) + char(2바이트) 4바이트 이하이니깐 int로, cc는 65임 유니코드 어쩌고 그거
    	   	
//    	   	cc와 cc2의 합을 변수 cc3저장
//    	   	cc3 = cc+cc2;
    	   	
    	   	int cc3 = cc + cc2;		
    	   	System.out.println(cc3);
    	   	System.out.println(3/2F); //float형태로 변했으니 소숫점까지 나옴
    	   	
    	   	
    	   	
    	   	
    	   			
    	   	
    	   	
    	   	
    	   	
    	   	
    	   	
    	   
		
		
		
		
		
		
		
		
		
	}

}
