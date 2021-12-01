// 거푸집 (원판/원형/틀)
public class Car {
	// 클래스의 멤버(필드)
	String company;  // 제조업체
	String model;   // 모델명
	String color;   // 색상
	int maxSpeed;   // 최고속도
	int speed;      // 현재속도
			// - 생성자(Constructor:건축자/구성자)
			// 필드값을 초기화할 때 또는 초기화작업을 수행할 때.
	Car(){  // 클래스명과 같은 명으로 메소드 선언 반환값 타입이 없는 메소드. 자동실행 = 대놓고(명시적으로) 호출하지 않음.
		// 기본생성자(default constructor)
	} 
	   // 일반생성자가 있으면, 반드시 기본생성자도 존재해야 한다.
       // 일반생성자 없이 기본생성자만 존재할 수 있다.
	   
	   // 객체 지향 프로그램에선 같은 이름의 함수명 선언이 가능 대신 파라미터가 달라야함.
	   // 생성자 오버로딩(Constructor Overloading) <- 다형성의 일종
	Car(String sCompany, String sModel, String sColor, int nMaxSpeed, int nSpeed){
		this.company=sCompany;
		this.model=sModel;
		this.color=sColor;
		this.maxSpeed=nMaxSpeed;
		this.speed=nSpeed;
	}
	Car(String model,String color){
		// String model, String color : 매개변수(parameter)
//		this.company="KIA";
//		this.model=model;
//		this.color=color;
//		this.maxSpeed=240;
//		this.speed=0;
		this("KIA",model,color,240,0);   //   <- 이렇게 한번에 쓰면 코드가 더 짧아진다. ( 위에있는 생성자의 코드를 빌려와서 사용 )
	}
	void drive(int speed) {
		this.speed=speed;
	}	
} 
