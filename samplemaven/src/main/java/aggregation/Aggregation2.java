package aggregation;

public class Aggregation2 {
	String state;
	int num;
	Aggregation1 ref;

	public Aggregation2(String state,int num,Aggregation1 ref)
	{
		this.state=state;
		this.num=num;
		this.ref=ref;
	}
	public void display()
	{
		System.out.println(state + " " +num);
		System.out.println(ref.name +" " +ref.age+" " +ref.roll_no);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aggregation1 obj=new Aggregation1("Neethu",33,13);
		Aggregation2 obj1= new Aggregation2("Kerala", 25644,obj);
		obj1.display();
	}

}
