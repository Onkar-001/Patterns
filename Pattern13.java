/*
- Hollow Full Pyramid
    1
   1 2
  1   3
 1     4
1 2 3 4 5
*/
class Pattern13 {
	public static void main(String[] args) {
		for (int i = 1; i <=5 ; i++ )
		{
			for (int s = 1; s<=5-i ; s++ )
			{
					System.out.print(" ");
			}
			for (int j = 1; j<=i; j++ )
			{
				if((i==3) && (j == 2) || (i == 4 && (j == 2 || j == 3)))
					System.out.print("  ");
				else
					System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}