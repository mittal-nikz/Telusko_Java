public class SelectionDemo 
{
	public static void main(String [] args)
	{
		/* if
		 * switch
		 * ternary
		 */
		
		int n = 2;
		
		if(n==0)
			System.out.println("nothing");
		else if(n%2==0)
			System.out.println("Even");
		else
			System.out.println("Odd");
		 
		
		
		//ternary operator
		// ?:  ->condition?expr1:expr2
		
		
		int i = 8,j=0;
		j = (i>6)?1:2;
		
		System.out.println(j);
		
		
		
		//SWITCH
		
		int num = 3;
		
		//Switch supports string only in version above 1.7
		//Switch doesn't supports double
		
		switch(num) // We can even use string in switch
		{
		case 1:
			System.out.println("One");
			break;
		case 2:	
			System.out.println("Two");
			break;
		case 3:	
			System.out.println("Three");
			break;
		case 4:
			System.out.println("Four");
			break;
		default:
			System.out.println("No Match");
		}
		
	}
}
