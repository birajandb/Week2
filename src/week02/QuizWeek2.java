package week02;

public class QuizWeek2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("--------Question# 2--print 0 to 9 using--'for loop'--");
		
		for(int index = 0; index <= 2; index++) {
			System.out.println(index);
		}
	System.out.println("----Question =# 3----------");
		double moneyInWallet = 4.50;
		double costOfMilk = 1.99;
	if (moneyInWallet>=costOfMilk * 2) {
		System.out.println("Let's buy two gallons.");
	}else if (moneyInWallet >= costOfMilk) {
		System.out.println("Let's buy one gallon.");
	}else {
		System.out.println("Way too expensive!");
	}
		System.out.println("---Question# 6 ----It will print Infinite loop-----");
		/*
	for(int j = 0; j < 10; j--) {
		System.out.println(j); // It will print Infinite loop.
	}*/
	System.out.println("-----Question# 7 -------");
	String name = "Tommy";
	int age = 52;
			if(name == "Tommy") {
				System.out.println("Hi,Tommy");
			}else if(age == 52) {
				System.out.println("52 years old");
			}
			System.out.println("Out of Conditional");
	System.out.println("--Question# 8 --print Every Odd Numbers form 0 to 99");
		for(int ind = 0; ind <= 99; ind++) {
			if(!(ind % 2 == 0)) {
				System.out.println(ind);
			}}
	System.out.println("---Question# 9 ---------");
	
		int numiricGrade = 59;
		char letterGrade = ' ';
		
		if(numiricGrade >= 90) {
			letterGrade = 'A';
		}else if (numiricGrade >= 80) {
			letterGrade = 'B';
		}else if (numiricGrade >= 70) {
			letterGrade = 'C';
		}else if (numiricGrade >= 60) {
			letterGrade = 'D';
		}else {
			letterGrade = 'F';
		}
		System.out.println("The letter Grade for a "+ numiricGrade + " is a " + letterGrade + ".");
		
	System.out.println("---------Question# 10 ---------");
	
	int day = 6;
	int month = 4;
	
	boolean isSummer = month >= 6 && month <= 8;
	boolean isWeekday = day < 6;
	if(isSummer || !isWeekday) {
		System.out.println("Def going to sleep in");
	}else {
		System.out.println("Prob wake up in decent time");
	}
	
	
	
	
	
	
	
	}
	
	
	}
	


