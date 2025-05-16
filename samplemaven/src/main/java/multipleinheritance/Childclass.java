package multipleinheritance;

public class Childclass implements Parent1,Parent2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Childclass obj=new Childclass();
		obj.print();
		obj.display();
		obj.show();
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Haiiiii");
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("its me");
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Neethu");
	}

}
