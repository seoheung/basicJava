package z_exam;

public class Exam_04 {
	public static void main(String[] args) {
		
		/*
		[4-1] 다음의 문장들을 조건식으로 표현하라.
				1. int형 변수 x가 10보다 크고 20보다 작을 때 true인 조건식
				=> if(10<x&&x<20){
			           System.out.println("True");
		           } 
		           
				2. char형 변수 ch가 공백이나 탭이 아닐 때 true인 조건식
				=> 	char ch = 1;
					
					if(' '!=ch||'\t'!=ch){
						System.out.println("True");
					}else{
					  System.out.println(1);
					}
				
				3. char형 변수 ch가 ‘x' 또는 ’X'일 때 true인 조건식
				=> 	char ch = 'p';
				   	boolean  c = ('x'==ch||'X'==ch);
					System.out.println(c);
					
				4. char형 변수 ch가 숫자(‘0’~‘9’)일 때 true인 조건식
				=>  char ch = 1;
					boolean  c = ( 0<=ch && ch<=9 );
					System.out.println(c);
					
				5. char형 변수 ch가 영문자(대문자 또는 소문자)일 때 true인 조건식
				=>	char ch = 'A';
					boolean c = ('a'<=ch&&ch<='z'||'A'<=ch&&ch<='Z');
					System.out.println(c);
					
				6. int형 변수 year가 400으로 나눠떨어지거나 또는 4로 나눠떨어지고 100으로 나눠떨어지지
				않을 때 true인 조건식
				=>	int year = 400;
					boolean c = (year%400==0||year%4==0||year%100!=0);
					System.out.println(c);
					
				7. boolean형 변수 powerOn가 false일 때 true인 조건식
				=> boolean powerOn = false;
				
				8. 문자열 참조변수 str이 “yes”일 때 true인 조건식
				=> String str = "yes";
				
		[4-2] 1부터 20까지의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합을 구하시오.
				int a = 0;

				for (int i = 1; i<21; i++){
					if (i%2!=0||i%3!=0){
						a += i;
					} System.out.println(a);
		
		[4-3] 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)의 결과를 계산하시오.
		[4-4] 1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이
			  100이상이 되는지 구하시오.	
			  
		[4-5] 다음의 for문을 while문으로 변경하시오.
			  	for(int i=0; i<=10; i++) {
					for(int j=0; j<=i; j++)
						System.out.print("*");
					System.out.println();
				}
			=>	int i5 = 0;
				while(i5<=10){
					int j5 = 0;
					while(j5<=i5){
						System.out.print("*");
					j5++;
					}
				System.out.println();
				i5++;
			}
		[4-6] 두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프
			     로그램을 작성하시오.
				for(int i=1; i<7 ; i++){
					for(int j=1; j<7 ; j++){
						if(i + j == 6){
					System.out.println("주사위1:" + i + " 주사위2:" + j);
					}
				}
			}
		[4-7] Math.random()을 이용해서 1부터 6사이의 임의의 정수를 변수 value에 저장하는
			    코드를 완성하라. (1)에 알맞은 코드를 넣으시오.
			    
			   int value = (int)(Math.random()*6+1);
			   
			    	     		
			    	     		
			    	     		
		[4-8] 방정식 2x+4y=10의 모든 해를 구하시오. 단, x와 y는 정수이고 각각의 범위는
			  0<=x<=10, 0<=y<=10 이다.	 
			  
			  	 for(int i=0 ; i<11; i++){
					for(int j=0 ; j<11 ; j++)
						if(2*i+4*j == 10){
				System.out.println("x=" +  i + ", y=" + j);
			}
	}    s
	
		[4-12] 구구단의 일부분을 다음과 같이 출력하시오.
					
				for(int i = 2;i<10;i++){
					for(int j = 1;j<4;j++){
						System.out.println(i + "*" + j + "=" + j*i);
				}
					System.out.println("\r\n");	
		     		
		*/

	
	
	
	
	
	
	
	
	
	
	

	}
}		
		
		
		
		
		
		
	

