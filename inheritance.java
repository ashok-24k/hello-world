package star;
class animal{
	
	public void animethod()
	{
		System.out.println("i am animal");
	}
}
class legs4 extends animal{
	public void legmethod()
	{
System.out.println("i have 4 legs");
	}
	
}
class milkproducer extends legs4{
	public void milkmethod()
	{
		System.out.println("i give milk");
	}
}
public class inheritance {

	public static void main(String[] args) {
		
	animal ani=new milkproducer();
	legs4 l4=new legs4();
	milkproducer mp=new milkproducer();
	
	

		
	}

}
