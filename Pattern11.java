/*
- Hollow Half Pyramid
1
1 2
1   3
1     4
1 2 3 4 5

*/
class Pattern11 {
	public static void main(String[] args) {
		for (int i = 1; i<=5; i++ )
		{		
		  for (int j = 1; j<=i; j++ )
			{
			   if((i == 3 && j ==2) || (i == 4 && (j == 2 || j == 3))) {
				  System.out.print("  ");
			   } else {
				   System.out.print(j+" ");
			   }
			}
			System.out.println();
		}
	}
}