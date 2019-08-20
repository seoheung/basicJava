package c_sentence;

public class Sentence_02 {
	public static void main(String[] args) {
		/*
		1. 반복문 ( for, while, do-while )
		 -  어떤 작업을 반복적으로 수행하도록 할 때 사용된다.
		 -  반복문은 주어진 조건을 만족하는 동안 주어진 문장을 반복적으로 수행한다.
		 -  for문은 주로 반복횟수를 알고 있을때 while문은 주로 반복횟수를 모를때 사용된다.
		
		2. for문
		 -  기본구조
		    for(초기화=시작;조건식=어디까지;증감식){
		    	수행될 문장.
		    }
		    
		     초기화 -> 조건식을 확인 -> 수행 -> 증감식 
		          -> 조건식 -> 수행 -> 증감식 초기화는 딱 한번 
		 */
		
//		System.out.println(0);
//		System.out.println(1);
//		System.out.println(2);
//		System.out.println(3);
//		System.out.println(4);
//		System.out.println(5);
//		System.out.println(6);
//		System.out.println(7);
//		System.out.println(8);
//		System.out.println(9);
		
			//자바는 끝은 뭐보다 작다로 인식함 복습할때 어느것이 조건문으로 만들었는지 확인하고자 syso지우지 말고 
		for(int i=0;i<10;i++){
			System.out.println(i);
		}
		int add = 0;
//		add += 1;
//		add += 2;
//		add += 3;
//		add += 4;
//		add += 5;
//		add += 6;
//		add += 7;
//		add += 8;
//		add += 9;
//		add += 10;
		
		//1. 시작 1, 끝 10, 증가량 1 짝수일때만
//		for (int i=1;i<11;i++){
//			add += i;
//		}
		
		for (int i=1;i<11;i++){
			if(i%2==0){ //짝수는 2로 나눴을때 나머지가 0
				add += i;
			}
		}
		
		System.out.println(add);
		
		// 7~30까지의 곱을 구해주세요
		// 곱일때는 시작이 1이어야 함.
		long ss = 1;
//		ss *= 7;
//		ss *= 8;
//		ss *= 9;
//		ss *= 10;
//			.
//			.
//		ss *= 97;
//		ss *= 98;
//		ss *= 99;
		// 시작 7; 끝 31; 증가량 1 곱해지는 값은 위의 ss이니깐 
		
		for(int i=7;i<31;i++){
			ss *= i;
		}
		
		//반복되는것이 무엇인지 먼저 알자 시작1;끝9;증가 +1
		//시작 7, 끝 999, 증가량 
		
		// 2 * 1 = 2*1		
//		System.out.println(2+ "*" +1+"="+2*1);
//		System.out.println(2+ "*" +2+"="+2*2);
//		System.out.println(2+ "*" +3+"="+2*3);
//		System.out.println(2+ "*" +4+"="+2*4);
//		System.out.println(2+ "*" +5+"="+2*5);
//		System.out.println(2+ "*" +6+"="+2*6);
//		System.out.println(2+ "*" +7+"="+2*7);
//		System.out.println(2+ "*" +8+"="+2*8);
//		System.out.println(2+ "*" +9+"="+2*9);
		
		//시작 2*1=2*1; 끝 2*9=2*9; 
		
		for (int a=1;a<10;a++){
			System.out.println(2+ "*" +a+"="+2*a);
		}
		

//		System.out.println(3+ "*" +1+"="+3*1);
//		System.out.println(3+ "*" +2+"="+3*2);
//		System.out.println(3+ "*" +3+"="+3*3);
//		System.out.println(3+ "*" +4+"="+3*4);
//		System.out.println(3+ "*" +5+"="+3*5);
//		System.out.println(3+ "*" +6+"="+3*6);
//		System.out.println(3+ "*" +7+"="+3*7);
//		System.out.println(3+ "*" +8+"="+3*8);
//		System.out.println(3+ "*" +9+"="+3*9);
		
		//시작 1;끝 9;증가 1
		for (int a3=1;a3<10;a3++){
			System.out.println(3+ "*" +a3+"="+3*a3);
		}
		
		
//		System.out.println(4+ "*" +1+"="+4*1);
//		System.out.println(4+ "*" +2+"="+4*2);
//		System.out.println(4+ "*" +3+"="+4*3);
//		System.out.println(4+ "*" +4+"="+4*4);
//		System.out.println(4+ "*" +5+"="+4*5);
//		System.out.println(4+ "*" +6+"="+4*6);
//		System.out.println(4+ "*" +7+"="+4*7);
//		System.out.println(4+ "*" +8+"="+4*8);
//		System.out.println(4+ "*" +9+"="+4*9);
		
				
		for(int a4 =1 ;a4<10;a4++){
			System.out.println(3+ "*" +a4+"="+3*a4);
		}
				
//		System.out.println(5+ "*" +1+"="+5*1);
//		System.out.println(5+ "*" +2+"="+5*2);
//		System.out.println(5+ "*" +3+"="+5*3);
//		System.out.println(5+ "*" +4+"="+5*4);
//		System.out.println(5+ "*" +5+"="+5*5);
//		System.out.println(5+ "*" +6+"="+5*6);
//		System.out.println(5+ "*" +7+"="+5*7);
//		System.out.println(5+ "*" +8+"="+5*8);
//		System.out.println(5+ "*" +9+"="+5*9);
		
		for(int a5 =1 ;a5<10;a5++){
			System.out.println(3+ "*" +a5+"="+3*a5);
		}
		
//		System.out.println(6+ "*" +1+"="+6*1);
//		System.out.println(6+ "*" +2+"="+6*2);
//		System.out.println(6+ "*" +3+"="+6*3);
//		System.out.println(6+ "*" +4+"="+6*4);
//		System.out.println(6+ "*" +5+"="+6*5);
//		System.out.println(6+ "*" +6+"="+6*6);
//		System.out.println(6+ "*" +7+"="+6*7);
//		System.out.println(6+ "*" +8+"="+6*8);
//		System.out.println(6+ "*" +9+"="+6*9);
//		
		for(int a6 =1 ;a6<10;a6++){
			System.out.println(3+ "*" +a6+"="+3*a6);
		}
		
//		System.out.println(7+ "*" +1+"="+7*1);
//		System.out.println(7+ "*" +2+"="+7*2);
//		System.out.println(7+ "*" +3+"="+7*3);
//		System.out.println(7+ "*" +4+"="+7*4);
//		System.out.println(7+ "*" +5+"="+7*5);
//		System.out.println(7+ "*" +6+"="+7*6);
//		System.out.println(7+ "*" +7+"="+7*7);
//		System.out.println(7+ "*" +8+"="+7*8);
//		System.out.println(7+ "*" +9+"="+7*9);
		
		for(int a7 =1 ;a7<10;a7++){
			System.out.println(3+ "*" +a7+"="+3*a7);
		}
		
//		System.out.println(8+ "*" +1+"="+8*1);
//		System.out.println(8+ "*" +2+"="+8*2);
//		System.out.println(8+ "*" +3+"="+8*3);
//		System.out.println(8+ "*" +4+"="+8*4);
//		System.out.println(8+ "*" +5+"="+8*5);
//		System.out.println(8+ "*" +6+"="+8*6);
//		System.out.println(8+ "*" +7+"="+8*7);
//		System.out.println(8+ "*" +8+"="+8*8);
//		System.out.println(8+ "*" +9+"="+8*9);
		
		for(int a8 =1 ;a8<10;a8++){
			System.out.println(3+ "*" +a8+"="+3*a8);
		}
		
//		System.out.println(9+ "*" +1+"="+9*1);
//		System.out.println(9+ "*" +2+"="+9*2);
//		System.out.println(9+ "*" +3+"="+9*3);
//		System.out.println(9+ "*" +4+"="+9*4);
//		System.out.println(9+ "*" +5+"="+9*5);
//		System.out.println(9+ "*" +6+"="+9*6);
//		System.out.println(9+ "*" +7+"="+9*7);
//		System.out.println(9+ "*" +8+"="+9*8);
//		System.out.println(9+ "*" +9+"="+9*9);
		
		for(int a9=1;a9<10;a9++){
			System.out.println(9+ "*" +a9+"="+9*a9);
		}
		//어차피 for문안에 있는 변수는 그안에서만 사용하는 것이라 같은거 써줘도 돼 
		
//		for (int a=1;a<10;a++){
//			System.out.println(2+ "*" +a+"="+2*a);
//		}
//		
//		for (int a=1;a<10;a++){
//			System.out.println(3+ "*" +a+"="+3*a);
//		}
//		
//		for (int a=1;a<10;a++){
//			System.out.println(4+ "*" +a+"="+4*a);
//		}
//		
//		for (int a=1;a<10;a++){
//			System.out.println(5+ "*" +a+"="+5*a);
//		}
//		
//		for (int a=1;a<10;a++){
//			System.out.println(6+ "*" +a+"="+6*a);
//		}
//		
//		for (int a=1;a<10;a++){
//			System.out.println(7+ "*" +a+"="+7*a);
//		}
//		
//		for (int a=1;a<10;a++){
//			System.out.println(8+ "*" +a+"="+8*a);
//		}
//		
//		for (int a=1;a<10;a++){
//			System.out.println(9+ "*" +a+"="+9*a);
//		}
		
		for(int i=2;i<10;i++){
			for (int a=1;a<10;a++){
				System.out.println(i+ "*" +a+"="+i*a);
			}
		}
		
		//1. 짝수단만 출력
		for(int i=2;i<10;i++){
			if(i%2==0){
				for (int a=1;a<10;a++){
					System.out.println(i+ "*" +a+"="+i*a);	
			 	 }
			 }
		 }
		
		//2. 홀수곱만 출력
		
		for(int i=2;i<10;i++){
			for (int a=1;a<10;a++){
				if(a%2==1){
					System.out.println(i+ "*" +a+"="+i*a);
				 }
			 }
		 }
		//3. 짝수단의 홀수곱만 출력
		for(int i=2;i<10;i++){
			for (int a=1;a<10;a++){
				if(i%2==0&&a%2==1){
					System.out.println(i+ "*" +a+"="+i*a);	
				 }
			 }
		}
		
		/*
		3. while문
		 -  조건식과 수행해야될 블럭{}만으로 구성되어 있다.반복횟수를 모를 때 사용한다. 
		 -  기본구조
		 	while(조건식){
		 		조건식이 true일때 수행될 문장.
		 	}	
		 */
		
		for (int i = 1; i < 10; i++ ) {
			System.out.println(i);
			
		}
		
		int num = 1;
		while(num<10){
			System.out.println(num);
			num++;	
		}
		
		
		//1.  1~10까지의 합을 구해주세요(while문)
		int q = 0; //합계는 0으로 시작
//		q += 1;
//		q += 2;
//		q += 3;
		
		int q1 = 1;//초기화
		
		while(q1<11){
			q += q1;
			q1++;
		}
		System.out.println(q);
		
		//2.  1~10까지의 홀수의 합을 구해주세요
		int sum = 0; //합계저장할애
		int sum1 = 1; //더해주는 값 , 초기화
		
		while(sum1<11){
			if(sum1%2==1){
				sum += sum1;
			}
			sum1++;
		}
		System.out.println(sum);
		
		//3. 구구단을 while문만을 이용해서 만들어주세요.
//		System.out.println(2+ "*" +1+"="+2*1);
//		System.out.println(2+ "*" +2+"="+2*2);
//		System.out.println(2+ "*" +3+"="+2*3);
//		System.out.println(2+ "*" +4+"="+2*4);
//		System.out.println(2+ "*" +5+"="+2*5);
//		System.out.println(2+ "*" +6+"="+2*6);
//		System.out.println(2+ "*" +7+"="+2*7);
//		System.out.println(2+ "*" +8+"="+2*8);
//		System.out.println(2+ "*" +9+"="+2*9);
		
	

		
//		
//		while (aa<10){
//			System.out.println(2+ "*" +aa+"="+2*aa);{
//			}aa++;
//		} 
//		for(int i=2;i<10;i++){
//			for (int a=1;a<10;a++){
//				System.out.println(i+ "*" +a+"="+i*a);
//			}
//		}
		int ii = 2;
		while (ii<10){
			int aa = 1;
			while (aa<10){	
				System.out.println(ii+ "*" +aa+"="+ii*aa);
				aa++;
				}
			ii++;
		}
		
		
		
		
		//4. 5~? 더하였을때 200이상이 되는가?
		
		int b = 0;
		int b1 = 5;
		
//		while (b1<?+1){
//			199<b+=b1
//			b1++		
//		}
		
		//5. String
		String str = "가나다";
		char c = str.charAt(1);
		System.out.println(c);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
