/*
- Hollow Inverted Half Pyramid
1 2 3 4 5
2     5
3   5
4 5
5

*/
class Pattern14
{
	public static void main(String[] args) {
		for (int i=0; i<5; i++)
		{
			int count = 1;
			for (int j = 5; j>i; j--)
			{
				if( (i == 1 && (j == 3 || j == 4)) || (i == 2 && (j == 4)))
					System.out.print("  ");
				else
					System.out.print(i+count+" ");
				count++;
			}
			System.out.println();
		}
	}
}