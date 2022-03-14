package programpratice;

public class SwappingThenumber {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		//b=a+b-(a=b); 
		// a=a+b;
		 //b=a-b;
		 //a=a-b;
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("After swaping the number:"+a+" "+b);
		

	}

}
