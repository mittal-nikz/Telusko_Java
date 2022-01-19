
class Student
{
	int rollno;
	String name;
}


public class ArrayDemo 
{
	public static void main(String[] args) 
	{
		
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		Student s4 = new Student();
		
		Student s[]= {s1,s2,s3,s4}; // array of objects
		
		int nums[] = new int[4];
		
		nums[0]=8;
		nums[1]=12;
		nums[2]=76;
		nums[3]=54;
		
		for(int i=0;i<4;i++)
		{
			System.out.println(nums[i]);
		}
	}

}
