import java.util.Scanner;

public class Ex03{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int arr[]=new int[5];
		
		System.out.println("Enter 5 numbers to find the maximum and minimum :");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s.nextInt();
		}
		
        int max=arr[0],min=arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
				max=arr[i];
			if(arr[i]<min)
				min=arr[i];
		}
		System.out.println("Max : "+max+" Min : "+min);
		
		
	}
}	
	
		