
public class DoMain {

	public static void main(String[] args) {
		Car car=new Car();    // car=변수이면서 동시에 객체임.(인스턴스 - instance:실체/실존)
		
		Car seltos=new Car("KIA","Seltos","white",220,0);
		
		System.out.println("제조업체:"+seltos.company);
		System.out.println("모델명:"+seltos.model);
		System.out.println("색상:"+seltos.color);
		System.out.println("최고속도:"+seltos.maxSpeed);
		System.out.println("현재속도:"+seltos.speed);
		System.out.println("-----------------------------");
		//1
		car.drive(60);
		System.out.println("수정된 현재속도:"+car.speed);
		System.out.println("-----------------------------");
		
		Car aaaaa=new Car("aaaaa","bbbbb");
		
		System.out.println("제조업체:"+aaaaa.company);
		System.out.println("모델명:"+aaaaa.model);
		System.out.println("색상:"+aaaaa.color);
		System.out.println("최고속도:"+aaaaa.maxSpeed);
		System.out.println("현재속도:"+aaaaa.speed);
	}

}
