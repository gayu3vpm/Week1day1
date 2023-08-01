package week1.day1;
//Home assignment
public class IsPrime {
	//prime -2 factor

	public static void main(String[] args) {
		int n=20, count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
				count++;//no of count factory
		}
		if(count==2)//prime number need to use 2 only
		{
			System.out.println("The given number"+" "+n+" "+"is prime"+count);}//+count-no of the count value
		else {
			System.out.println("The given number"+" "+n+" "+"is not prime"+count);
	}

}
}