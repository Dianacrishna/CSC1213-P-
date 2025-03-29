import java.util.Scanner;

public class Ex04{
   public static void main(String args[]){
   Scanner s=new Scanner(System.in);
   System.out.println("Input a letter: ");
   char a=s.next().charAt(0);
   
   switch(a){
	   case 'a':
	   case 'e':
       case 'i':
	   case 'o':
	   case 'u':
	   case 'A':
	   case 'E':
	   case 'I':
	   case 'O':
	   case 'U':
	      System.out.println(a+" is a Voval");
		  break;
       default:
	      System.out.println(a+" is Consanent");
   }
   }
}
   