
import java.util.Scanner;

public class PE5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter total no of values : ");
		int n=sc.nextInt();
		int sum=0,tmp=0,x;
		for(int i=0;i<n;i++)
		{
			x=sc.nextInt();
			char c= (char)(x+'0');
			System.out.println(c);
			if(Character.isDigit(c))
			{
				sum+=x;
			}
			else
			{
				System.out.println("Error");
				tmp=1;
				break;
			}
			
		}
		if(tmp==0)
			System.out.println(sum);

	}

}
