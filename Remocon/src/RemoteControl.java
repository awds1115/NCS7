
public interface RemoteControl {
	//�ʵ尡 ����.(������ ����). ������𰡴�(��ǻ� ����)
	//�����ڰ� ����. -> new�����ڰ� ����
	// �޼ҵ� ����( �߻�޼ҵ�(abstract)/����Ʈ�޼ҵ�/�����޼ҵ� )
//	public static final double pi=3.14159; 
	// final �� �޾Ƽ� ���� ���� �ٲ��� ���ϴ� ����� �ƴ�.
	 int MAX_VOLUME=10;
	 int MIN_VOLUME=0;
	 // �̰͵� ������� (��ǻ� ����)
	 void turnOn(); // �߻�޼ҵ� (abstruct �ᵵ�ǰ�, �Ƚᵵ�ǰ� �⺻�� �߻�޼ҵ�)
	 void turnOff();
	 void setVolume(int volume);
	 //����Ʈ �޼ҵ� - �Ϲ� Ŭ������ �Ϲ� �޼ҵ�
	 default void setMute(boolean mute) { // �Ϲ�Ŭ������ �Ϲݸ޼ҵ�� ����
		 if(mute) {
			 System.out.println("����ó���մϴ�.");
		 }else {
			 System.out.println("���������մϴ�.");
		 }
	 }
	 static void changeBettery() {
		 System.out.println("�������� ��ü�մϴ�.");
	 }
}
