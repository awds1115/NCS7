
public class InheritanceSample {

	public static void main(String[] args) {
	Car car = new Car();
	
	for(int i=0; i<20; i++) {
		int punk=car.run();
		switch(punk) {
		case 1:   // 앞 왼쪽
			System.out.println("앞 왼쪽 한국타이어로 교체");
			car.tires[punk-1]=new HankookTire(15,"앞 왼쪽");
			break;
		case 2:   // 앞 오른쪽
			System.out.println("앞 오른쪽 금호타이어로 교체");
			car.tires[punk-1]=new KeumhoTire(13,"앞 오른쪽");
			break;
		case 3:   // 뒤 왼쪽
			System.out.println("뒤 왼쪽 한국타이어로 교체");
			car.tires[punk-1]=new HankookTire(14,"뒤 왼쪽");
			break;
		case 4:   // 뒤 오른쪽
			System.out.println("뒤 오른쪽 금호타이어로 교체");
			car.tires[punk-1]=new KeumhoTire(17,"뒤 오른쪽");
			break;
		}
		System.out.println("-------------------");
	}
		
		
		
		
		
		
		
		
		
		
		
		
		//	Car a = new Limousine(); // 부모클래스에 자식클래스를 넣는건 가능
	//	Limousine b = new Car(); // 자식클래스에 부모클래스를 넣는건 불가능
	//	Limousine b = (Limousine)new Car(); // 강제형변환으로 강제로 클래스를 집어 넣을 수 있음
		// ** 서로 사이즈가 다르기 떄문에 (부모가 더 넓음) 부모 클래스에 있는 코드가 다 들어가지 않을 수 있음
		
//		Truck scania= new Truck();
//		
//		scania.company="Volvo";
//		scania.color="brown";
//		scania.model="xxxxxxx";
//		scania.nMaxSpeed=120;
//		
//		scania.drive(40);
//		System.out.println("Current speed: "+scania.nSpeed);
//		//Override
//		// 부모 클래스에는 nSpeed가 를 적용했지만 자식클래스에 /2 를 해서 부모클래스의 생성자를 무시하고 적용됐다.
//		scania.stop();
//		
//		Limousine alpha=new Limousine();
//		
//		alpha.company="Ford";
//		alpha.color="white";
//		alpha.model="Ford Alpha one";
//		alpha.nMaxSpeed=220;   // 부모에게 상속받은 자식클래스를 불러 상
//		alpha.nSpeed=0;       // 상속받은 코드를 불러오기 가능.
//		alpha.drive(60);
//		alpha.stop();
//		
//		Car avante=new Car();
//		avante.company="Hyundai";
//		avante.color="black";
//		avante.model="Avante N";
//		avante.nMaxSpeed=280;  // 부모클래스에서 값 받아오기 가능.
//		avante.nSpeed=0;
//		avante.drive(80);
//		avante.stop();
	}

}
