/*
 * Class defines the structure of an object.
 * Object is for example a phone
 
 * Knows something: Variables
 * Does something: Methods
 */

//Class is the blueprint. Object is the real instance.
class Calc
{
	int num1,num2,result; // instance variables
	
	/*
	 * CONSTRUCTOR
	 * 
	 * Constructor is a member method
	 * Same name as class name
	 * Will never return anything(dont even use void)
	 * it is used to allocate memory
	 */
	
	public Calc() // Default Constructor
	{
		num1=5;
		num2=5;
	}
	// We can create two constructor in the same class provided they have different signature.
	
	public Calc(int n)
	{
		num1 = n;
		num2 = n;
	}
	
	public Calc(double d,int n)// Parameterized Constructor
	{
		num1 = (int)d;
		num2 = n;
	}
	
}


public class ObjectDEmo 
{
	public static void main(String[] args) // Execution of your code starts with the main function
	{
		Calc obj = new Calc(8.9,9); // Constructor
		
		System.out.println(obj.num1+" "+obj.num2);
		
	}
	
}


/*
 * public static void main(String args[])
 * 
 * why use static? Since main() is the first line of code execution, static means that to call main(), you dont require an object.
 * why String? It specifies the type of parameter main function is taking. We use string because it accepts everything.
 * args[]? We dont know how many values user is going to send, so we are taking an array.
 */

/*
 * A obj = new A();
 * 
 * obj: referenece
 * new: keyword used to allocate memory. How much memory? This thing is answered by constructor A().
 */








