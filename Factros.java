class Factors
{
public static void main(String args[])
{
	int n = Integer.parseInt(args[0]);
	int Answer[] = generate(n);
	for(int i=1;i<Answer[0];i++)
		System.out.print(Answer[i]+"\t");
}

private static int[] generate(int n)
{
	int a[] = new int[n];
	int index=1;
	if(prime(n))
		return a;
	for(int i=2;n!=1;i++)
	{
		if(prime(i))
		{
			for(;n%i==0;n/=i)
				a[index++] = i;
		}
	}
	a[0] = index;
	return a;
}

private static boolean prime(int i)
{
	if(i<=3)
	return true;

	for(int j=2;j<=(int)i/j;j++)
	{
		if(i%j==0)
			return false;
	}
	return true;
}

}
