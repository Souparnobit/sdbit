class Armstrong
{
	public static void main(String args[])
	{
		int n=0;
		int r=0;
		int s=0;
		int p=0;
		int x=0;
		
		if(args.length==1)
		{
			n=Integer.parseInt(args[0]);
			x=n;
			while(n>0)
			{
				r=n%10;
				p=(int)Math.pow(r,3);
				s+=p;
				n=n/10;
			}
			if(x==s)
			{
				System.out.println("Armstrong number!");
			}
			else
			{
				System.out.println("Not an Armstrong number!");
			}
		}
		else
		{
			System.out.println("Wrong number!");
		}
	}
}