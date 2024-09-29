/*

- Solid Half Diamond
1
2*2*
3*3*3*
4*4*4*4*
4*4*4*4*
3*3*3*
2*2*
1

*/
class Pattern23 {
	public static void main(String[] args) {
		for (int i = 1 ; i<=4 ; i++ )
		{
			for (int j = 1 ; j<=i ; j++ )
			{
				if(i == 1) {
					System.out.print(i);
				} else {
					System.out.print(i+"*");
				}
			}
			System.out.println();
		}
		
		for (int i = 4 ; i>=1 ; i-- )
		{
			for (int j = 1 ; j<=i ; j++ )
			{
				if(i == 1) {
					System.out.print(i);
				} else {
					System.out.print(i+"*");
				}
			}
			System.out.println();
		}
	}
}