import java.util.Scanner;

public class MaximumOne {

	public static int findLargest(int a,int b,int c)
	{
	   	
		
		return a>b?(a>c)?a:c:(b>c)?b:c;
		
	}
    public static int findAverage(int a,int b,int c){
          return (a+b+c)/3;

    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int sum = num1 + num2 + num3;
		System.out.println("sum"+sum);
        System.out.println("largest number"+findLargest(num1,num2,num3));
        System.out.println("average"+findAverage(num1,num2,num3));
	}

}
