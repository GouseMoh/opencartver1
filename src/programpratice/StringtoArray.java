package programpratice;

public class StringtoArray {

	public static void main(String[] args) {
		/*char ch[]= {'a','b','c'};
		String s1=String.valueOf(ch);
		System.out.println("s1 value:"+s1);
		char ch[]= {'g','o','u','s','e'};
		String S2=new String(ch);
		System.out.println("s1 NAME:"+S2);
		
		char ch[]= {'g','u','l','l','a','p','a','l','l','i'};
		String s1=String.valueOf(ch);
		System.out.println("Value of s1:"+s1);
		
		Object a[]= {10,10.5,"gullapalli",'s',true};
		System.out.println("Different Data Type InArray:"+a);
		
		int b[]= {10,20,30};
		System.out.println(b.length);
		System.out.println(b[2]);
		
		int c[]= {100,200,300,400,500};
		 for (int i=0;i<a.length;i++)
		 {
			 System.out.println(c[i]);
		 }
		 
	*/
		int a[][]=new int[3][2];
		a[0][0]=100;
		a[0][1]=200;
		
		a[1][0]=300;
		a[1][1]=400;
		
		a[2][0]=500;
		a[2][1]=600;
		 
		//System.out.println("Number of rows:"+a.length);
		//System.out.println("Number of coloums:"+a[0].length);
		//System.out.println(a[2][0]);
		/*for(int r=0;r<a.length;r++)
		{
			for (int c=0;c<a[r].length;c++)
			{
				System.out.println(a[r][c]+" ");
			}
			System.out.println();
      		}*/
		for (int x[]:a)
		{
			for(int v:x)
			{
				System.out.println(v+" ");
			}
			System.out.println();
		}
			
			
			
			
			
	}
		
		}
		
		
		
		
		
		
		