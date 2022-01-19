class Thiss
{
	int num1;
	int num2;
	int result;
	
	// Local variables always shadows instance variable
	
	public Thiss(int num1 , int num2)
	{
		// num1=num1;  // In this case, it will treat both variables as local variable. It is assigning to itself. Both have brown colour
		// num2=num2;  // It wont be assigned and output be 0,0.
		
		// To solve this, we will use this keyword
		
		this.num1 = num1; // current object
		this.num2 = num2;
		// It will say it is instance variable, not a local variable
	}
}

public class ThisKeyword 
{
	public static void main(String[] args)
	{
		Thiss objnew = new Thiss(4,5);
		
		System.out.println(objnew.num1);
		System.out.println(objnew.num2);
	}
}
