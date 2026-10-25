package star;

import java.util.Scanner;

public class simplepattern {
	public static void recursfibonaci(int n,int a,int b)
	
	{
		if(n==0)
		{
			return;
		}
		int c=a+b;
		System.out.println(c);
		recursfibonaci(n-1,b, c);
		
		
	}
	
	public void starpattern()
	{
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void butteryfly_pattern()
	{}
	public void reverse_star()
	 {
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	 }
	public void reverseString()
	{
		System.out.println("enter string");
		Scanner sc= new Scanner(System.in);
		String s=sc.nextLine();
		String rev="";
		char c[]=s.toCharArray();

		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+c[i];
		}
		System.out.println(rev);	
	}
	public void sort()
	{
		int temp;
		int[] a= {1,6,35,8,30,57,34,76,23,56,};
		for(int i=0;i<a.length;i++)
		{
			for(int j =i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
	}
	
 public static void main ( String arg[])
 {
	 Scanner a= new Scanner(System.in);
		
		simplepattern s = new simplepattern();
	//	s.sort();
		//s.reverseString();
		//s.butteryfly_pattern();
		
		recursfibonaci(10,0,1);
	}
	
	
}

