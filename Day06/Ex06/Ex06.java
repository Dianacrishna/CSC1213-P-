import java.util.*;

public class Ex06{
	public static void main(String args[]){
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the row size of the 2D array : ");
		int r=s.nextInt();
		
		System.out.println("Enter the colomn size of the 2D array : ");
		int c=s.nextInt();
		
		int arr[][]=new int[r][c];
		
		int sum=0,max=0;
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				arr[i][j]=s.nextInt();
				
				sum+=arr[i][j];
				
				if(i==0 && j==0)
				max=arr[0][0];
			
				if(max<arr[i][j])
					max=arr[i][j];
			}
		}
		System.out.println("Sum : "+sum+"\nMaximum : "+max);
	}
}