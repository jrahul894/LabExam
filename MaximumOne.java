import java.util.Scanner;

public class MaximumOne {

	public static int findLargest(int a,int b,int c)
	{
	   	
		
		return a>b?(a>c)?a:c:(b>c)?b:c;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int sum = num1 + num2 + num3;
		System.out.println(sum);
        System.out.println(findLargest(num1,num2,num3));
	}

}
