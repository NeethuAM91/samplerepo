package inheritance;

public class Multilevelchild extends Multilevelparent2 {
	public void display1()
	{
		System.out.println("from child class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multilevelchild obj=new Multilevelchild();
		//Multilevelparent2 obj1=new Multilevelparent2();
		//MultilevelParent1 obj3=new MultilevelParent1();
		obj.display1();
		obj.show();
		obj.display();
		//obj1.display();
		//obj3.show();
	}

}
