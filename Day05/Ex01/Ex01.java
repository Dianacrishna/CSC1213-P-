import java.util.Scanner;

public class Ex01{
public static void main(String args[]){
     
     Scanner s=new Scanner(System.in);
	 int arr[]=new int[5];
	 int i=0;
	 System.out.println("Enter 5 numbers : ");
	 do{
		 arr[i]=s.nextInt();
		 i++;
	   }while(i<5);
	 i=0;
	 int sum=0;
	 do{
         sum+=arr[i];
		 i++;
	   }while(i<5);
	 System.out.print("The sum is : "+sum);	 
	 }
}	 