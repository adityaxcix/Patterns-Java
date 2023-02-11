public class numberPattern 
{

	public static void main(String[] args) 
	{
		/*
		1
		1 2
		1 2 3
		1 2 3 4
		1 2 3 4 5
		 */
		
		
		int i, j;
		for(i =0;i<=5;i++)
		{
			for(j=0;j<=i;j++)
			{
				System.out.print(j+1 + " ");
			}
			System.out.println();
		}
		
		
	}

}
