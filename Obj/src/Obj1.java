//Ŭ�� ������ ����(����)�� �����Ѵ�.
public class Obj1 {
	int nColor;     //  �Ӽ� -> ����
	int nSpeed;     // ����ӵ�
	int nMaxSpeed;  // �ְ�ӵ�
	int nFuel;     //  ���� �����ܷ�
	String nVendor;    // ������
	String nModelName;    // �𵨸�
	
	
	void drive(int iSpeed) {    // ���� -> �޼ҵ�(�Լ�)
	    nSpeed=iSpeed;

	}
	void stop() {
		nSpeed=0;
		}
	void refuel(int iFuel) {
		nFuel+=iFuel;
	}
	 // �Ӽ��� ������ �����ϰ�, ������ �޼ҵ�(�Լ�)�� ǥ���Ѵ�.
}
