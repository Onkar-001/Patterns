/*
- Palindrome Pyramid Pattern

A
A B A
A B C B A
A B C D C B A
A B C D E D C B A

*/

class Pattern16 {
	public static void main(String[] args) {
		for (int i = 1; i<=5; i++ )
		{
		char ch = 65;
			for (int j = 1; j<=i ; j++)
			{
				System.out.print(ch+" ");
				ch++;
			}
			ch =64;
			for (int j = i - 1; j>=1; j-- )
			{	
				System.out.printf("%c ",j+ch);
			
			}

			System.out.println();
		}
	}
}