import java.util.Scanner;

class Userinput{
	public static void main(String args[])
	{ 
	   String fname;
	   Scanner s=new Scanner(System.in);
	   
	   System.out.println("Enter your first name : ");
	   String f=s.nextLine();
	   
	   System.out.println("Enter your last name : ");
	   String l=s.next();
		
       s.nextLine();
	   
	   System.out.println("Enter your Marks : ");
	   int m=s.nextInt();

       System.out.println("Full name : "+f+" "+l+"\nMarks : "+m);
	}
}	