class Arrayone1
	{
		public static void main(String args[])
	{
		int a[][],i,j;
		a=new int[3][3];
		a[0][0]=10;
		a[0][1]=20;
		a[0][2]=30;
		a[1][0]=100;
		a[1][1]=200;
		a[1][2]=300;
		for(i=0;i<a.length;i++)
	{
		for(j=0;j<a.length;j++)
	{
		System.out.print(a[i][j]+" ");
	}
		System.out.println();	
	}	
	}
	}