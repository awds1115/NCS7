
public class DoMain {

	public static void main(String[] args) {
		Car car=new Car();    // car=�����̸鼭 ���ÿ� ��ü��.(�ν��Ͻ� - instance:��ü/����)
		
		Car seltos=new Car("KIA","Seltos","white",220,0);
		
		System.out.println("������ü:"+seltos.company);
		System.out.println("�𵨸�:"+seltos.model);
		System.out.println("����:"+seltos.color);
		System.out.println("�ְ�ӵ�:"+seltos.maxSpeed);
		System.out.println("����ӵ�:"+seltos.speed);
		System.out.println("-----------------------------");
		//1
		car.drive(60);
		System.out.println("������ ����ӵ�:"+car.speed);
		System.out.println("-----------------------------");
		
		Car aaaaa=new Car("aaaaa","bbbbb");
		
		System.out.println("������ü:"+aaaaa.company);
		System.out.println("�𵨸�:"+aaaaa.model);
		System.out.println("����:"+aaaaa.color);
		System.out.println("�ְ�ӵ�:"+aaaaa.maxSpeed);
		System.out.println("����ӵ�:"+aaaaa.speed);
	}

}
