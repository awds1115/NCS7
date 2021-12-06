
public class Truck extends Car {//  Truck 은 Car를 연장한다(extends) 
	 //-> Truck이란 클래스는 Car라는 클래스의 자식이다 선언 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
// Car의 자식으로 선언된 Truck 을 메인에서 호출해서 코드를 써도 에러가 안남.
// Car의 자식으로 선언 됨으로써 Car안에 있는 모든 메소드와 코드를 상속받아 사용할 수 있음

//
//	public Truck() {
//		super();  // super를 쓰면 자식 생성자에 부모 클래스를 불러올 수 있다. 
////		this.color="red";  // Truck 의 color 가 기본으로 red가 들어간다
//		
//	}
//
//	public Truck(String company, String model, String color, int nMaxSpeed, int nSpeed) {
////		super(company, model, color, nMaxSpeed, nSpeed);  부모클래스에 파라미터가 5개인 생성자를 불러온다.
//		super();  // this(); 라고 써도 가능
//		this.company=company;
//		this.model=model;
//		this.nMaxSpeed=nMaxSpeed;
//		this.nSpeed=nSpeed;
//		
//	} 
//	@Override // 메소드 재정의 했다는 표시
//	void drive(int speed) { 
////		this.nSpeed=speed/2; // 자식에게 메소드를 정해놓으면 상속받은 부모의 메소드를 무시하고 먼저 적용된다.\
//		super.drive(speed); // super. 을 붙여서 부모 메소드의 drive 값을 불러 올 수도 있다. 
//	} 
}
