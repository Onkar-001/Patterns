/*

Hollow full pyramid
     *
    * *
   *   *
  *     *
 *       *
* * * * * *

*/
class Pattern8 {
	public static void main(String[] args) {
		for (int i = 0 ; i<=5 ; i++ )
		{
			for (int s = 0; s < 5 - i ; s++ )
			{
				System.out.print(" ");
			}
			for (int j = 0; j <= i ; j++ )
			{
				if(j == 0 || j == i || i == 6 - 1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}