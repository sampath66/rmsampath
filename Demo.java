class Rectangle
{
	int area()
	{
		int b=6;
		int h=5;
		int res=b*h;
		System.out.println(res);
		return res;
	}
}

class Demo 
{
	public static void main(String[] args) 
	{
		Rectangle x =new Rectangle();
		int y=x.area();
		System.out.println(y);
	}
}
