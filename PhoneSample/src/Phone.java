public abstract class Phone {   // Phone �߻�ȭ 
   public String owner;
   
   public Phone(String owner) {
      this.owner=owner;
   }
   
//   public void turnOn() {
//      System.out.println("�ڵ��� ������ �մϴ�.");
//   }
//   
//   public void turnOff() {
//      System.out.println("�ڵ��� ������ �����մϴ�.");
//   }
   
   public abstract void turnOn(); // ������ �������̵� ���� ������ �ʴ� �ڵ尡 �ȴ�.
   public abstract void turnOff();// abstract(�߻�ȭ)�� �ɾ �ʱ�ȭ�� ��Ų��.
}