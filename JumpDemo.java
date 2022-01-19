public class JumpDemo 
{
	//break,continue
	
	public static void main(String[] args)
	{
		for(int i=1;i<=10;i++)
		{
			if(i==7)
				continue; // will skip the iteration
			System.out.println("value is "+i);
		}
	}
	// continue will skip the current iteration
	// break will exit the whole nearest loop
}
