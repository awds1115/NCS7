// ��Ǫ�� (����/����/Ʋ)
public class Car {
	// Ŭ������ ���(�ʵ�)
	String company;  // ������ü
	String model;   // �𵨸�
	String color;   // ����
	int maxSpeed;   // �ְ�ӵ�
	int speed;      // ����ӵ�
			// - ������(Constructor:������/������)
			// �ʵ尪�� �ʱ�ȭ�� �� �Ǵ� �ʱ�ȭ�۾��� ������ ��.
	Car(){  // Ŭ������� ���� ������ �޼ҵ� ���� ��ȯ�� Ÿ���� ���� �޼ҵ�. �ڵ����� = �����(���������) ȣ������ ����.
		// �⺻������(default constructor)
	} 
	   // �Ϲݻ����ڰ� ������, �ݵ�� �⺻�����ڵ� �����ؾ� �Ѵ�.
       // �Ϲݻ����� ���� �⺻�����ڸ� ������ �� �ִ�.
	   
	   // ��ü ���� ���α׷����� ���� �̸��� �Լ��� ������ ���� ��� �Ķ���Ͱ� �޶����.
	   // ������ �����ε�(Constructor Overloading) <- �������� ����
	Car(String sCompany, String sModel, String sColor, int nMaxSpeed, int nSpeed){
		this.company=sCompany;
		this.model=sModel;
		this.color=sColor;
		this.maxSpeed=nMaxSpeed;
		this.speed=nSpeed;
	}
	Car(String model,String color){
		// String model, String color : �Ű�����(parameter)
//		this.company="KIA";
//		this.model=model;
//		this.color=color;
//		this.maxSpeed=240;
//		this.speed=0;
		this("KIA",model,color,240,0);   //   <- �̷��� �ѹ��� ���� �ڵ尡 �� ª������. ( �����ִ� �������� �ڵ带 �����ͼ� ��� )
	}
	void drive(int speed) {
		this.speed=speed;
	}	
} 
