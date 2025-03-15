01.
Date:-2022.03.12

Pactical No:-01 

Problem Specification:-My First Java Program

Implementation:-

class MyFirstJavaProgram
{
   public static void main(String args[])
   {
      System.out.println("Hy First Program in Java");
	  System.out.println("Hello Java Developers !!!");
   }	  
}

Output:-

Hy First Program in Java

Hello Java Developers !!!

Conclusion:-I have learned the syntax of main method and printstatement

02.
Date:-2022.03.12
Pactical No:-02
Problem Specification:-How to use Print Statement
Implementation:-
class Ex02
{
   public static void main(String args[])
   {
	  String fac="FAS";
      int n=3;
      double p=10.5;
	  int m=5;
      char w1='&';
      boolean isTH= true;
	  
      System.out.println(fac);
	  System.out.println(n);
	  System.out.println(m);
	  System.out.println(w1);
	  System.out.println(isTH);
	  
	  System.out.println("my faculty is "+fac);
	  System.out.println("The Result1 is "+(n+m));
	  System.out.println("The Result2 is "+(p+m));
   }	  
}
Output:-
FAS
3
5
&
true
my faculty is FAS
The Result1 is 8
The Result2 is 15.5

Conclusion:-I have learned how to merge using + operator 

03.
Date:-2022.03.12
Pactical No:-03
Problem Specification:-Printing Different datatype values
Implementation:-
class Ex3{
	public static void main(String[] args){
		boolean isbool =true;
		System.out.println("Boolean :"+isbool);
		
    byte ByteVal=120;
		System.out.println("Byte:"+ByteVal);

    int IntVal=1;
    System.out.println("Integer :"+IntVal);

    short ShortVal=14569;
		System.out.println("Short :"+ShortVal);
		
    long LongVal=10000;	
    System.out.println("Long :"+LongVal);

    float FloatVal=19.56f;
		System.out.println("Float :"+FloatVal);

  	double DoubleVal=169.456;
		System.out.println("Double :"+DoubleVal);
		
	  char CharVal='a';
		System.out.println("Char :"+CharVal);
		
	  char CharVal1='\u0064';
		System.out.println("Char :"+CharVal1);
	}
}
Output:-
Boolean :true
Byte:120
Integer :1
Short :14569
Long :10000
Float :19.56
Double :169.456
Char :a
Char :d

Conclusion:-I have learned premetive datatype

04.
Date:-2022.03.12
Pactical No:-04
Problem Specification:-printing string value
Implementation:-
class StuDetails {
	public static void main(String [] args){
		System.out.println("Name: Suthagaran Dianacrishna");
		System.out.println("Registration Number:2022/ASP/50");
		System.out.println("Degree Program: Bsc.ComputerScience");
		System.out.println();
		
	  String Name="Suthagaran Dianacrishna";
		String RegNo="2022/ASP/50";
		String Degree="Bsc.ComputerScience";
		
	  System.out.println("Full Name: "+Name);
		System.out.println("Registration Number: "+RegNo);
		System.out.println("Degree Program: "+Degree);
	}
}
Output:-
Name: Suthagaran Dianacrishna
Registration Number:2022/ASP/50
Degree Program: Bsc.ComputerScience

Full Name: Suthagaran Dianacrishna
Registration Number: 2022/ASP/50
Degree Program: Bsc.ComputerScience

Conclusion:-I have learned about String class

05.
Date:-2022.03.12
Pactical No:-05
Problem Specification:-How to use "\n" escape sequence
Implementation:-
class StudentDetails{
	public static void main (String[] args){
		System.out.println("First Name: Suthagaran \nLast Name: Dianacrshna \nAddress : Amarasingam Road Arayampathy:-03");
	}
}
Output:-
First Name: Suthagaran
Last Name: Dianacrshna
Address : Amarasingam Road Arayampathy:-03

Conclusion:-I have learned how to use nextline escape sequence

06.
Date:-2022.03.12
Pactical No:-06
Problem Specification:-How to use type casting
Implementation:-
class Exercise{
	public static void main (String [] args){
		char c1='g';
		System.out.println("The Character is: "+c1);

    int int1=(int)c1;
    System.out.println("The Character is: "+int1);

    double d1=10.09;
		System.out.println("The Value is: "+d1);
		
    int int2=(int)d1;	
    System.out.println("The Value is: "+int2);

    double d2=int1;
		System.out.println("The Value is: "+d2);
	}
}
Output:-
The Character is: g
The Character is: 103
The Value is: 10.09
The Value is: 10
The Value is: 103.0

Conclusion:-I have learned the syntax of type casting

07.
Date:-2022.03.12
Pactical No:-07
Problem Specification:-ArrathmeticOperators
Implementation:-
class ArrathmeticOperators
{
	public static void main(String args[])
	{
	int a=5;
	double b=-6.3;
	
	System.out.println(a+b);
	System.out.println(a-b);
	System.out.println(a*b);
	System.out.println(a/b);
	System.out.println(a%b);
	}
}	
Output:-
-1.2999999999999998
11.3
-31.5
-0.7936507936507937
5.0

Conclusion:-I have learned how actualy arrathetic operators work
