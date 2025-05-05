package superkeyword;

public class Childmethod extends Supermethod{
	public void display()
	{
		System.out.println("This is child class");
		super.display();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Childmethod obj =new Childmethod();
		obj.display();
	}

}
