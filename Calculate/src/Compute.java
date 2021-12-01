
public class Compute {

	public static void main(String[] args) {
		
		Common cmn1 = new Common(60,24);
		
		cmn1.find2Number();
		cmn1.showGCF();   //  최대공약수
		
		cmn1.showLCM();   //  최소공배수
		
		Common cmn2 = new Common(96,72);
		cmn2.find2Number();
		cmn2.showGCF();
		
		cmn2.showLCM();
	}

}
