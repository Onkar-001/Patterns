/*
- Solid Half Diamond
3
44
555
6666
555
44
3

*/
class Pattern22 {
	public static void main(String[] args) {
		int count = 3;
		for (int i = 0 ; i<=3 ; i++ )
		{ 
			for (int j = 0 ; j<=i ; j++ )
			{
				System.out.print(count);
			}
			count++;
			System.out.println();
		}
			--count;
		for (int j = 0; j<=2; j++ )
		{
			--count;
			for (int k = 2; k>=j; k-- )
			{
				System.out.print(count);
			}
			System.out.println();
		}
	}
}