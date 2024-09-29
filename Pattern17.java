/*
-Palindrome pyramid pattern
        1
      1 2 1
    1 2 3 2 1
  1 2 3 4 3 2 1
1 2 3 4 5 4 3 2 1

*/
class Pattern17 {
	public static void main(String[] args) {
		for (int i = 1; i <=5 ; i++ )
		{
			for (int s = 1; s <= 5 - i ; s++ )
			{
				System.out.print("  ");
			}
			for (int j = 1; j<=i; j++ )
			{
				System.out.print(j+" ");
			}
			for (int j = i - 1; j>=1 ; j--)
			{
				System.out.print(j+ " ");
			}
			System.out.println();
		}
	}
}