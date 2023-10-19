class Demo
{
	int sum=0;
	void area(int i)
	{
	      for(i=i;i<=10;i=i+2)
		{
			sum=sum+i;
			System.out.println(sum);
		}	
	}
}

class Oddn 
{
	public static void main(String[] args) 
	{
		Demo x=new Demo();
		x.area(1);	
	}
}
