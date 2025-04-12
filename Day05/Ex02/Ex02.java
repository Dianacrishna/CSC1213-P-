import java.util.Scanner;

public class Ex02{
	public static void main(String args[]){
		
	   Scanner s=new Scanner(System.in);
	   //------------------------------------------------------------------------------
	   int number[]=new int[10];
       System.out.println("Enter the 10 numbers : ");
       for(int i=0;i<number.length;i++)
	   {
         System.out.println("Enter the number "+(i+1)+" : ");
         number[i]=s.nextInt();
	   }
       //------------------------------------------------------------------------------
        for(int i=0;i<number.length;i++)
		{
          System.out.println("number "+(i+1)+" is : "+number[i]);
        }
       //------------------------------------------------------------------------------
	    String days[]={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
		for(int i=0;i<7;i++)
		{
          System.out.println("Day "+(i+1)+" of the week is : "+days[i]);
        }	
	 
	}
}