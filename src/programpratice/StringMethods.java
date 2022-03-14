package programpratice;

public class StringMethods {

	public static void main(String[] args) {
		/*String s="Welcome";
        System.out.println(s);
        System.out.println(s.length());
        System.out.println(1+2);
        String s2=("gullapalli"+"mohammad"+"gouse ");
        System.out.println(s2);
        
        String s1=" To Selenium";
       System.out.println(s.concat(s1));
       System.out.println(s1.length());
       System.out.println(s1.trim().length());
       System.out.println(s2.length());
       System.out.println(s2.trim().length());
      //chat At()
       System.out.println(s2.charAt(6));
       System.out.println(s2.charAt(15));
       System.out.println(s2.contains("gouse"));
       System.out.println(s2.contains(s1));
       */
		String s1="Gullapalli";
		String s2="GULLAPALLI";
		String s3="Gullapalli";
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.replace('l','m'));
		System.out.println(s1.substring(0,5));
		System.out.println(s1.substring (5,6));
		
		
       
       
        
	
	}

}
