import java.util.Scanner;

public class Ex01{
  public static void main(String args[]){
	  Scanner s=new Scanner(System.in);
	  System.out.println("Enter a number");
	  int a=s.nextInt();
	  
	  if(a<0)
		  System.out.print("The number is negative");
	  else if(a>0)
		  System.out.print("The number is Positive");
	  else
		  System.out.print("The number is Zero");
  }
}