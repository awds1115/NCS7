
public class InheritanceSample {

	public static void main(String[] args) {
	Car car = new Car();
	
	for(int i=0; i<20; i++) {
		int punk=car.run();
		switch(punk) {
		case 1:   // �� ����
			System.out.println("�� ���� �ѱ�Ÿ�̾�� ��ü");
			car.tires[punk-1]=new HankookTire(15,"�� ����");
			break;
		case 2:   // �� ������
			System.out.println("�� ������ ��ȣŸ�̾�� ��ü");
			car.tires[punk-1]=new KeumhoTire(13,"�� ������");
			break;
		case 3:   // �� ����
			System.out.println("�� ���� �ѱ�Ÿ�̾�� ��ü");
			car.tires[punk-1]=new HankookTire(14,"�� ����");
			break;
		case 4:   // �� ������
			System.out.println("�� ������ ��ȣŸ�̾�� ��ü");
			car.tires[punk-1]=new KeumhoTire(17,"�� ������");
			break;
		}
		System.out.println("-------------------");
	}
		
		
		
		
		
		
		
		
		
		
		
		
		//	Car a = new Limousine(); // �θ�Ŭ������ �ڽ�Ŭ������ �ִ°� ����
	//	Limousine b = new Car(); // �ڽ�Ŭ������ �θ�Ŭ������ �ִ°� �Ұ���
	//	Limousine b = (Limousine)new Car(); // ��������ȯ���� ������ Ŭ������ ���� ���� �� ����
		// ** ���� ����� �ٸ��� ������ (�θ� �� ����) �θ� Ŭ������ �ִ� �ڵ尡 �� ���� ���� �� ����
		
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
//		// �θ� Ŭ�������� nSpeed�� �� ���������� �ڽ�Ŭ������ /2 �� �ؼ� �θ�Ŭ������ �����ڸ� �����ϰ� ����ƴ�.
//		scania.stop();
//		
//		Limousine alpha=new Limousine();
//		
//		alpha.company="Ford";
//		alpha.color="white";
//		alpha.model="Ford Alpha one";
//		alpha.nMaxSpeed=220;   // �θ𿡰� ��ӹ��� �ڽ�Ŭ������ �ҷ� ��
//		alpha.nSpeed=0;       // ��ӹ��� �ڵ带 �ҷ����� ����.
//		alpha.drive(60);
//		alpha.stop();
//		
//		Car avante=new Car();
//		avante.company="Hyundai";
//		avante.color="black";
//		avante.model="Avante N";
//		avante.nMaxSpeed=280;  // �θ�Ŭ�������� �� �޾ƿ��� ����.
//		avante.nSpeed=0;
//		avante.drive(80);
//		avante.stop();
	}

}
