
public class OtherArrayDemo {

	public static void main(String[] args) 
	{
		int d[][] = {
				
					{1,2,3,4},
					{2,4,8},              // Jagged Array(no. of columns are not fixed)
					{5,6,7,8}
				   
		            };
		
		for(int i=0;i<d.length;i++)
		{
			for(int j=0;j<d[i].length;j++)
			{
				System.out.print(d[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
