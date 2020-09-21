package week12;

public class constructor{
	int ant;
	double bt;
	static int c;
	
	constructor(){
		super();
		System.out.println("Hi");
	}
	constructor(int a ){
		ant = a;
		
	}
	constructor(int a, double b ){
		ant = a;
		bt = b;
	}
	constructor(constructor s){
		ant = s.ant;
		bt = s.bt;
		
	}
	void Display() {
		System.out.println(ant+" "+bt);
	}
	public static void main(String[]args) {
		constructor st1 = new constructor(11,55.5);
		constructor st2 = new constructor(st1);
		st1.Display();
		st2.Display();
	}
}