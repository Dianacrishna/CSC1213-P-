import java.util.Scanner;

public class Ex05{
   public static void main(String args[]){
	 System.out.print("Enter the number :");
     Scanner s=new Scanner(System.in);
     int n= s.nextInt();	

    for(int i=1;i<=n;i++)
	{
     System.out.print(i+"\t");
    }
   }
}   