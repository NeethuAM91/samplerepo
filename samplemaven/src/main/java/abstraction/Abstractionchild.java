package abstraction;

public class Abstractionchild extends Abstractionparent{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Abstractionchild obj=new Abstractionchild();//object creation
		obj.display();
		obj.show();
		obj.print();*/
		Abstractionparent obj1=new Abstractionchild();//reference creation
		obj1.display();
		obj1.show();
	
	}
     public void print()
     {
    	 System.out.println("hellloooo");
     }
	@Override
	public void display() {
		// TODO Auto-generated method stub
		int a=5,b=7,c;
		c=a+b;
		System.out.println("Sum is"+c);
	}

}
