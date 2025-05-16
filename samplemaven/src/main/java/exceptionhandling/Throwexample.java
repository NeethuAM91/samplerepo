package exceptionhandling;

public class Throwexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int age=16;
        if(age>18)
        {
        	System.out.println("Eligible for votting");
        }
        else
        {
        	throw new ArithmeticException("Not Eligible for votting");
        }
	}

}
