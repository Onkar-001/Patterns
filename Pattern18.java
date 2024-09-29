/*
- Palindrome Pyramid Pattern

********1********
*******2*2*******
******3*3*3******
*****4*4*4*4*****
****5*5*5*5*5****

*/
class Pattern18 {
	public static void main(String[] args) {
		for (int i = 1; i<=5; i++)
		{
			for (int s = 1;s<=9-i;s++ )
			{
				System.out.print("*");
			}
			for (int j = 1;j<=i ;j++ )
			{
				System.out.print(i+"*");
			}
			for (int s = 1;s<=8-i;s++ )
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}