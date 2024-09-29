/*
- Hollow Diamond

    *
   * * 
  *   *
 *     *
*       *
*       *
 *     *
  *   *
   * *
    *

*/
class Pattern20 {
	public static void main(String[] args) {
		for (int i = 1; i <=5; i++ )
		{
			for (int s = 1; s<= 5-i ;s++ )
			{
				System.out.print(" ");
			}
			for (int j = 1; j<=i ; j++ )
			{
				
				if((i == 5 && (j == 2 || j == 3 || j == 4)) || (i == 4 && (j==2 || j == 3)) || (i == 3 && (j == 2))) {
					System.out.print("  ");
				}
				else {
				System.out.print("* ");
				}
			}

			System.out.println();
		}

		for (int i = 1; i <=5; i++ )
		{
			for (int s = 1; s<= i - 1 ;s++ )
			{
				System.out.print(" ");
			}
			for (int j = 5; j>=i ; j-- )
			{
				
				if((i == 1 && (j == 2 || j == 3 || j == 4)) || (i == 2 && (j == 3 || j == 4)) || (i == 3 && (j == 4))) {
					System.out.print("  ");
				}
				else {
				System.out.print("* ");
				}
			}
			System.out.println();
		}

	}
}