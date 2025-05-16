package inheritance;

public class Singleinheritancechild extends Singleinheritanceparent{
	public void display()
	{
		System.out.println("The value of a is "+a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleinheritancechild obj=new Singleinheritancechild();
		obj.display();
	}

}
