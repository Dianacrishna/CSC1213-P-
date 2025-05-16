class Student{
	int id;
	String name;
	
	public Student(int id,String name){
		this.id=id;
		this.name=name;
}
}

public class TestStudent2{
	public static void main(String args[]){
		Student s1=new Student(1,"Zefon");
		System.out.println("Student id is : "+s1.id+"\nStudent name is : "+s1.name);
	}
}