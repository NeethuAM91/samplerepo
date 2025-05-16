package exceptionhandling;

public class Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a=12,b=0;
       int c;
       try {
    	   c=a/b;  
       }
      /* catch(ArithmeticException e)
       {
    	   b=2;
    	   int d=a/b;
    	   System.out.println(d);
    	   System.out.println(e);
       }*/
      finally
      {
    	  System.out.println("arithmetic exception");
      }
       
       
       
	}

}
