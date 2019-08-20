package c_sentence;

public class Sentence_01 {
	public static void main(String[] args) {
		/*
		1. 조건문( if, swich )
		  - 조건식과 문장을 포함하는 블럭{}으로 구성되어 있다.
		  - 조건식의 연산결과에 따라서 프로그램의 실행흐름을 변결할 수 있다.
		
		2. if
		  - 구조
		    1) 기본	
		     	if(조건식){
		     	   조건식이 트루이면 실행
		     	}
		    2) 1단 변형	
		     	if(조건식){
		     	   조건식이 트루일때 수행될 문장
		     	} else {
		     	   조건식이 펄스일때 수행될 문장 
		     	}
		    3) 2단 변형	
		     	if(조건식1){
		     	   조건식1이 트루일때 수행될 문장
		     	} else if(조건식2){               //소괄호는 if뒤에 붙이는 것 
		     	   조건식1이 false이고 조건식2가 true일때 수행될 문장
		     	} else {
		     	   조건식1과 조건식2가 모두 false일때 수행될 문장
		     	}	
		     	
		 
		 
		 
		 */
		
		//1. 변수 a에 20의 값을 저장해주세요
		int a = -20;
		//2. a의 값이 0보다 크면 "양수"를 그렇지 않으면 "양수아님"을 출력해주세요 
//		if(a가 0보다 크냐?){
//			"양수"로 출력
		if(a > 0){
			System.out.println("양수");			
		} else{
			System.out.println("양수아님");
		}
	
	
	    //3. a의 값이 0보다 크면 "양수"를 0보다 작으면"음수", 둘다아니면 "0"을 출력해주세요
		if(a>0) {
			System.out.println("양수");
		} else if(a<0){
			System.out.println("음수");
		} else {
			System.out.println("0");
		}
			
		
	
		//4. 0~100 사이의 랜덤한 점수를 변수 score에 저장해주세요
		int score = (int)(Math.random()*101); //*포함수부터 미포함수전까지의 정수갯수+시작수
		System.out.println(score);				
		//5. score의 점수가 90점 이상이면 "A"를 출력
	    //   score의 점수가 80점 이상이면 "B"를 출력
		//   score의 점수가 70점 이상이면 "C"를 출력
		//   score의 점수가 60점 이상이면 "D"를 출력
		//   score의 점수가 60점 미만이면 "나가"를 출력
		if (score>=90) {
			System.out.print("A");
			//95점 이상이면 +, 95미만이면 -
			if (score >=95){
				System.out.println("+");
			} else {
				System.out.println("-");
			}
		} else if(score>=80) {
			System.out.println("B");
		} else if(score>=70) {
			System.out.println("C");
		} else if(score>=60) {
			System.out.println("D");
		} else {
			System.out.println("나가");
		}
			
	
	
		/*
		2. switch문
		  - 조건의 경우의 수가 많을때는 if문보다는 switch문을 사용하는 것이 더 간결하다.
		  - 조건의 결과값으로 int형 범위의 정수값을 허용한다.
		  - 구조
		   	switch(조건식){
		    case 값1 :
		     	조건식 == 값1일때 수행될 문장
		     	break; 
		   	case 값2 :
		     	조건식 == 값12일때 수행될 문장
		     	break;
		   	case 값3 :
		     	조건식 == 값3일때 수행될 문장
		     	break;
		    default : 
		     	조건식의 값과 일치하는 case가 없을 때 수행될 문장. 굳이 브레이크 없어도 돼
		   	
		   	}
		 */
		//1. 1~5사이의 램덤한 정수값을 변수 aa에 저장해주세요
		
		int aa = (int)(Math.random()*5+1);
		System.out.println(aa);
		//2. aa의 값이 1이면 "강남에 32평 아파트 당첨"
		//	 aa의 값이 2이면 "람보르기니 당첨"
		//	 aa의 값이 3이면 "LG시그니쳐세트 당첨"
		//	 aa의 값이 4이면 "자전거 당첨"
		//	 aa의 값이 5이면 "영만빌딩 내놔"
		//   switch문으로 만들어주세요.
		switch (aa) { //aa는 조건식이라고는 하지만 변수나 값이 들어감
		case 1 : 
			System.out.println("강남에 32평 아파트 당첨");
			break;
		case 2 : 
			System.out.println("람보르기니 당첨");
			break;
		case 3 : 
			System.out.println("LG시그니쳐세트 당첨");
			break;
		case 4 : 
			System.out.println("자전거 당첨");
			break;
		default :
			System.out.println("영만빌딩내놔");
		}
		/*
		if (score>=90) {
			System.out.print("A");
		} else if(score>=80) {
			System.out.print("B");
		} else if(score>=70) {
			System.out.print("C");
		} else if(score>=60) {
			System.out.print("D");
		} else {
			System.out.print("나가");
		}
		*/		
		//3. 위 구문을 switch문으로 바꿔주세요.
		int score1 = (int)(Math.random()*101); 
		System.out.println(score1);		
		
		switch (score1/10){
		
		case 10 : case 9 : //같은 구문일때만 함께 쓸 수 있음 
			System.out.println("A");
			break;
		case 8 : 
			System.out.println("B");
			break;
		case 7 : 
			System.out.println("C");
			break;
		case 6 : 
			System.out.println("D");
			break;
		default  : 
			System.out.println("나가");
		
		}
	
		/*
		3.   
		 */
	
	}
}
