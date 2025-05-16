package polymorphism;

public class Polychild extends Polyparent {
	public void display(int a,int b)
	{
		int c;
		c=a-b;
		System.out.println("The difference is "+c);
		super.display(5, 7);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polychild obj=new Polychild();
		obj.display(8,9);
		
	}

}
