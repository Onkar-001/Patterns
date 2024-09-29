/*
- Palindrome Pyramid Pattern
1
1 2 1
1 2 3 2 1
1 2 3 4 3 2 1
1 2 3 4 5 4 3 2 1
*/
class Pattern15 {
	public static void main(String[] args) {
		int j;
		for (int i = 1; i<=5 ; i++ )
		{
			for (j = 1; j<=i; j++)
			{
				System.out.print(j+" ");
			}
			for (j = i - 1; j>=1; j-- )
			{
				System.out.print(j+" ");
			}
			System.out.printf("\n");
		}
	}
}