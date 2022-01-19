
public class VariableDemo 
{
	
	public static void main(String args[])
	{
		//int,float,double
		
		long l = 50000000000l;  // 8 bytes   l should be included
		int i = 5;  // 4 bytes -> 32 bits
		short s = 5;  // 2 bytes -> 16 bits
		byte b = 5;  // 1 byte -> 8 bits -> -128 to 127
		float f = 5.5f;  // f should be included
		double d = 5.5;
		
		char c ='A'; //ASCII 
		c = 66;
		
		System.out.println(c);
		
		double d1 = 5; // implicit conversion
		int k = (int)5.6;// typecasting or explicit conversion 
		
		System.out.println(k);
		
	}
	
}

// NAMING CONVENTIONS

//INTERFACE: Adjective
//eg:- Runable,Readable,Remote.

//CLASS: Noun
//eg:- Student, Person, Computer, HashMap

//METHOD: Verb  (First letter small)
//eg:- actionPerformed, run, print, write.

//CONSTANT: all capitals
//eg:- PI,DENSITY,MAX_PRICE

// Java follows Camel Casing Rule
