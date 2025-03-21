import java.util.Scanner;

class UserinputEx{
	public static void main(String args[])
	{ 
	   String fname;
	   Scanner s=new Scanner(System.in);
	   
	   System.out.println("Enter your Name : ");
	   String n=s.nextLine();
	   
	   System.out.println("Enter your Age : ");
	   int a=s.nextInt();
	   
	   System.out.println("Enter your RegNo : ");
	   String r=s.next();
	   
	   System.out.println("Enter your Sex : ");
	   char se =s.next().charAt(0);
	   
	   System.out.println("Enter your MobileNumber : ");
	   Long m=s.nextLong();
	   
	   System.out.println("Enter your GPA: ");
	   double g=s.nextDouble();

       System.out.println("Name : "+n+"\nAge : "+a+"\nRegNo : "+r+"\nSex : "+se+"\nMobileNumber : "+m+"\nGPA : "+g);
	}
}	