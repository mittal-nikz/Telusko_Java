
/*
 * Before creating an object, you have to load the class.
 * Because you create object inside heap memory
 * There is a special memory in your JVM where you load all your class files.(Loader Memory or Class Loader Memory)
 * 
 * If you don't want certain variables in class to be object specific, you can use the keyword static.
 * Like in below example, it doesnt matter who the employee is (or object), the ceo has to be common for all employees(objects)
 * 
 * Static variables are same for all the objects.
 * Non-static variables are different for all the objects 
 * Cannot use non-static variables in static block
 */

class Emp
{
	int eid;
	int salary;
	static String ceo; // Now the variable ceo is not in heap memory, it is in Class Loader Memory
	
	static  // when you load a class .   special block in java. It will execute only once no matter how many objects you create
	{
		ceo = "Larry";
	}
	
	public Emp()  // when you create a object
	{
		eid = 1;
		salary = 3000;
	}
	
	
	public void show()
	{
		System.out.println(eid+" : "+salary+" : "+ceo);
	}
}


public class StaticDemo {

	public static void main(String[] args) // We can even make a function static. It means we dont need object to access main function
	{
		Emp navin = new Emp();
		navin.eid = 8;
		navin.salary = 4000;
		navin.ceo = "Nikhil";
		
		Emp rahul = new Emp();
		rahul.eid = 9;
		rahul.salary = 5000;
		rahul.ceo = "Nikhil";
		
		rahul.ceo = "NIkita";
		
		Emp.ceo = "Nikhillll"; // We can directly use class name instead of object because its common to all objects 
		// It shows we dont need object
		navin.show();
		rahul.show();

	}

}
