
public interface RemoteControl {
	//필드가 없다.(변수가 없다). 상수선언가능(사실상 변수)
	//생성자가 없다. -> new연산자가 없다
	// 메소드 종류( 추상메소드(abstract)/디폴트메소드/정적메소드 )
//	public static final double pi=3.14159; 
	// final 을 달아서 이제 절대 바꾸지 못하는 상수가 됐다.
	 int MAX_VOLUME=10;
	 int MIN_VOLUME=0;
	 // 이것도 상수선언 (사실상 변수)
	 void turnOn(); // 추상메소드 (abstruct 써도되고, 안써도되고 기본이 추상메소드)
	 void turnOff();
	 void setVolume(int volume);
	 //디폴트 메소드 - 일반 클래스의 일반 메소드
	 default void setMute(boolean mute) { // 일반클래스의 일반메소드와 동일
		 if(mute) {
			 System.out.println("무음처리합니다.");
		 }else {
			 System.out.println("무음해제합니다.");
		 }
	 }
	 static void changeBettery() {
		 System.out.println("건전지를 교체합니다.");
	 }
}
