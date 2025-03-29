import java.util.Scanner;

public class Ex03{
   public static void main(String args[]){
   Scanner s=new Scanner(System.in);
   System.out.println("Input a number: ");
   int a=s.nextInt();
   
   switch(a){
	      case 1:
	      System.out.println("It is Monday");
		  break;
          case 2:
	      System.out.println("It is Tuesday");
		  break;
		  case 3:
		  System.out.println("It is Wednesday");
		  break;
		  case 4:
		  System.out.println("It is Thursday");
		  break;
		  case 5:
		  System.out.println("It is Friday");
		  break;
		  case 6:
		  System.out.println("It is Saturday");
		  break;
		  case 7:
		  System.out.println("It is Sunday");
		  break;
		  default:
		  System.out.println("Invalide day Range");
    }
   }
  }
   