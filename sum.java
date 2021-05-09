import java.util.*;

class sum{

public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	int a[]=new int[5];
	
	//Input
	System.out.println("enter 5 integer");
	for(int i=0;i<a.length;i++)//Row
	{
		a[i]=sc.nextInt();
		
	}
	int sum=0;
	for(int x:a)
	{
		sum=sum+x;
			
		
	}
	System.out.println("sum="+sum);
}
}