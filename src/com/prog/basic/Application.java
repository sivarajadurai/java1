package com.prog.basic;



public class Application {
	
	void showDate(DateDisplay k){
		
		System.out.println("you time is :");
		k.display();
		
	}
	
	void showString(String s){
		int a = s.length();
		System.out.println(a);
	}

	public static void main(String[] args) {
		
		
		DateDisplay dd = new DateDisplay();
		dd.sec =45;
		dd.min =34;
		dd.hour=5;
		
		Application a = new Application();
		a.showDate(dd);
		String name ="siva";
		a.showString(name);
		
	}

}
