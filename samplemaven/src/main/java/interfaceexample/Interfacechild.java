package interfaceexample;

public class Interfacechild implements Interface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Interfacechild obj=new Interfacechild();//object creation
		obj.display();*/
		Interface1 obj=new Interfacechild();//reference creation
		obj.display();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		int a=8,b=9,c;
		c=b-a;
		System.out.println("The difference is "+c);
	}

}
