import java.util.ArrayList;

public class Array1 {

	public static void main(String[] args) {
//		int[] ar= {2,3,4,5,7,100,12};
//		int[][] ar1= new int[2][3];   // 2차원 배열 
//		ar1[0][0]=10;
//		ar1[0][1]=12;
//		ar1[0][2]=14;
//		ar1[1][0]=11;
//		ar1[1][1]=13;
//		ar1[1][2]=15;
//		System.out.println(ar1[1][1]);
		
//		int total=0;
//		for(int i=0; i<args.length; i++) {
//			System.out.println("현재값:"+args[i]);
//			total+=Integer.parseInt(args[i]);
//		}
//		System.out.println("합계:"+ total);
		
		
		
		//ArrayList
		ArrayList<String> alMenu=new ArrayList<String>();
		ArrayList<Integer> alPrice=new ArrayList<Integer>();
		
		alMenu.add("Americano");    alPrice.add(2000);
		alMenu.add("Latte");		alPrice.add(3000);
		alMenu.add("Mocca");		alPrice.add(3500);
		alMenu.add("Expresso");		alPrice.add(2500);
		alMenu.add("Cappuccino");	alPrice.add(4000);
		
		for(int i=0; i< alMenu.size(); i++) {
			System.out.println(alMenu.get(i)+", "+alPrice.get(i));
		}
	}

}













