/*

-Rhombus Pattern
   ****
  *  *
 *  *
****

-Hollow Rhombus
*/
class Pattern34 {
	public static void main(String[] args) {
		for (int i = 1; i<=4 ; i++ )
		{
		    for (int s = 1; s <= 5-i ;s++ )
		    {
				System.out.print(" ");
		    }
			for (int j = 1; j<=4 ; j++)
			{
				if((i == 2 || i == 3) && (j == 2 || j == 3))
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}
	}
}