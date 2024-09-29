/*

- Full Pyramid
		1
      2 3 2
    3 4 5 4 3 
  4 5 6 7 6 5 4
5 6 7 8 9 8 7 6 5
*/
class Pattern12 {
	public static void main(String[] args) {
		int a,j,k;int count = -1;
		for (int i = 1; i<=5 ; i++ )
		{
			for (int s = 1; s <= 5 - i ;s++ )
			{
				System.out.print("  ");
			}
			for (j = 1; j <=i; j++)
			{
				System.out.print(i+j-1+" ");
				
			}
			++count;
			for (a = j - 2 + count, k= 1; k<i ; k++)
			{
				System.out.printf("%d ", a--);
				
			}
			System.out.println();
		}
	}
}