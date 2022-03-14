package programpratice;

public class SearchTheElementinArry {

	public static void main(String[] args) {
		int a[]= {10,20,30,40};
		int num=100;
		boolean status=false;
		for(int i=0;i<a.length;i++)
		{
			if (a[i]==num)
			{
				System.out.println("Element is found");
				status=true;
				break;
			}
		}
		if(status==false)
		{
			System.out.println("Element is not found"); 
		}
	}

}
