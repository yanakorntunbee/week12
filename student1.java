package week12;

public class student1{
	int rollno;
	String name;
	static String collage="IT";
	
	student1(int r,String n){
		rollno = r;
		name = n;
	}
	void display() {
		System.out.println(rollno+""+name+""+collage);
	}
}