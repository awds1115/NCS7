
public class Car {
	Tire[] tires= {	new Tire(6,"�տ���"),
					new Tire(2,"�տ�����"),
					new Tire(3,"�ڿ���"),   
					new Tire(4,"�ڿ�����"),
					// �̷������� �迭�� ������ ���� ����
};
//	Tire frontLeft;
//	Tire frontRight;
//	Tire backLeft;
//	Tire backRight;
//	
	public Car() {
//		frontLeft = new Tire(6,"�տ���");
//		frontRight = new Tire(2,"�տ�����");
//		backLeft = new Tire(3,"�ڿ���");
//		backRight = new Tire(4,"�ڿ�����");
	}
	void stop() {
		System.out.println("�ڵ����� ����ϴ�.");
	}
	int run() {
		System.out.println("�ڵ����� �޸��ϴ�.");
		for(int i=0; i<tires.length; i++) {
			if(!tires[i].roll()) { stop(); return i+1;} // �迭�� �ݺ��Ǵ� �ݺ������ε� ���� �� �� ����.
		} return 0;
//		if(!tires[0].roll()==false) { stop(); return 1;}
//		if(!tires[1].roll()==false) {stop(); return 2;}
//		if(!tires[2].roll()) {stop(); return 3;}  // ������� �迭�� �����ϴ¹�
//		if(!tires[3].roll()) {stop(); return 4;}
//		return 0;
		
//		if(frontLeft.roll()==false) { stop(); return 1;}
//		if(frontRight.roll()==false) {stop(); return 2;}
//		if(!backLeft.roll()) {stop(); return 3;}
//		if(!backRight.roll()) {stop(); return 4;}
//		return 0;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	String company;   // �θ� Ŭ������ private �� �ɸ� �ڽĵ��� ����� ���� ���Ѵ�.       
//	String model;
//	String color;
//	int nMaxSpeed;
//	int nSpeed;
//	
//	public Car() {
//		this.color="green";
//	}
//	public Car(String company, String model, String color, int nMaxSpeed, int nSpeed) {
//		super();
//		this.company = company;
//		this.model = model;
//		this.color = color;
//		this.nMaxSpeed = nMaxSpeed;
//		this.nSpeed = nSpeed;
//	}
//
//	void drive(int speed) {
//		this.nSpeed=speed;
//	}
//	void stop() {
//		this.nSpeed=0;
//	}
}
