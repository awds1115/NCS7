
public class Tire {
	int maxRotation;  // �ִ�ȸ��Ƚ��
	int pastRotation;  // ����ȸ��Ƚ��
	String location;   // Ÿ�̾���ġ
	
	public Tire() {}

	public Tire(int maxRotation, String location) {	
		this.maxRotation = maxRotation;
		this.location = location;
	}
	
	public boolean roll() { // boolean �� Ÿ�� ( if ���� return true, false �� ������ boolean �� ���� �ؾ��� )
		++pastRotation;
		if(pastRotation>maxRotation) {
			System.out.println(location+"Tire ���� ����: "+(maxRotation-pastRotation)+"ȸ");
			return true;   // �ִ�ȸ�������� ���� ����
		}else {
			System.out.println(this.location+" Ÿ�̾� ��ũ");
			return false; // �ִ�ȸ���� �ʰ� 
		}
	}
}
