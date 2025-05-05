package superkeyword;

public class Childvariable extends Supervariable {
	String color="red";
public void display()
{
	System.out.println(color);
	System.out.println(super.color);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Childvariable obj=new Childvariable();
       obj.display();
 
	}

}
