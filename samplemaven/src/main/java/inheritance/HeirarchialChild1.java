package inheritance;

public class HeirarchialChild1 extends HeirarchialParent {

	public void display()
	{
		System.out.println("from child 1");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	HeirarchialChild1 obj= new HeirarchialChild1();
	obj.show();
	obj.display();
	}

}
