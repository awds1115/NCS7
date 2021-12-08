public abstract class Phone {   // Phone 추상화 
   public String owner;
   
   public Phone(String owner) {
      this.owner=owner;
   }
   
//   public void turnOn() {
//      System.out.println("핸드폰 전원을 켭니다.");
//   }
//   
//   public void turnOff() {
//      System.out.println("핸드폰 전원을 종료합니다.");
//   }
   
   public abstract void turnOn(); // 어차피 오버라이딩 당해 읽히지 않는 코드가 된다.
   public abstract void turnOff();// abstract(추상화)를 걸어서 초기화만 시킨다.
}