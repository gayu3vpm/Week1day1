package week1.day1;
//Home assignment

public class Fibbinocci {

	public static void main(String[] args) {
	 int firstNum=0;
	 int secNum=1;
	 int sum=0;
	 System.out.print(firstNum);//0
	 for(int i=0;i<11;i++)
	 {
		 sum=firstNum+secNum;//1
		
		 firstNum=secNum;//1
		 secNum=sum; //1 iteration continue till condition satisfy
		 System.out.print(" "+sum+" ");
	 }
	}

	}

