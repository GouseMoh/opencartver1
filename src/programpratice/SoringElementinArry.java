package programpratice;

import java.util.Arrays;

public class SoringElementinArry {

	public static void main(String[] args) {
	int a[]= {10,50,30,40,20};
	int b[]=a;
	System.out.println("Before sorting:"+Arrays.toString(a));
	//Arrays.parallelSort(a);
	Arrays.sort(a); 
	System.out.println("after Sorting:"+Arrays.toString(a));
	System.out.println("Oiginal:"+Arrays.toString(b));


	}

}
