
public class GenericSample {

	public static void main(String[] args) {
		EmployeeInfo ei = new EmployeeInfo(1); 
		Person<EmployeeInfo, Integer> p1 = 
				new Person<EmployeeInfo, Integer>(ei,1);
		
		StudentInfo si = new StudentInfo(2);
		Person<StudentInfo, Integer>p2 = 
				new Person<StudentInfo, Integer>(si,2);
//		StudentInfo si = new StudentInfo(2); // 2학년
//		StudentPerson sp = new StudentPerson(si);
//		System.out.println(sp.info.grade);
//		
//		EmployeeInfo ei = new EmployeeInfo(1);
//		EmployeePerson ep = new EmployeePerson(ei);
//		System.out.println(ep.info.rank);
	}

}
class Person<T,S>{
	public T info;
	public S id;
	
	Person(T info, S id){       // 실행시간에 결정
		this.info = info;
		this.id = id;
	}
}

//class Person {
//	public EmployeeInfo info;  // Person의 T
//	public int id;   // Person의 S      위의 클래스와 같은 말 
//}


class StudentInfo{  // 메인에 클래스 만드는법
	public int grade;

	public StudentInfo(int grade) {    // 컴파일시 결정 
		this.grade = grade;
	}
	
}

class EmployeeInfo{
	public int rank;

	public EmployeeInfo(int rank) {
		this.rank = rank;
	}
	
}



//class StudentPerson{
//	public StudentInfo info;
//
//	public StudentPerson(StudentInfo info) {
//		this.info = info;
//	}
//	
//}
//
//
//
//class EmployeePerson{
//	public EmployeeInfo info;
//
//	public EmployeePerson(EmployeeInfo info) {
//		this.info = info;
//	}
//	
//}
