package week02;

public class Conditionals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
									//Boolean Expression 
		System.out.println(2 == 2); //Equal to
		System.out.println(5 > 2);  //Greater than
		System.out.println(5 < 2);  //Less than
		System.out.println(5 <= 7); //Less than & equal to
		System.out.println(7 >= 5); //Greater than & equeal to
		System.out.println(false && true); // both side has to be true
		System.out.println(2 == 2 && 5 > 7); 
		System.out.println(2 ==3|| 8 > 7); // at least one side has to be true
		
		

		int ageRequiredToDrive = 16;
		int currentAge = 3;
		int diff = (ageRequiredToDrive - currentAge);
		//if (currentAge >= ageRequiredToDrive) {System.out.println("This person can drive.");
		boolean canPersonDrive = currentAge >= ageRequiredToDrive;
		if (canPersonDrive) {
			System.out.println("This person can drive, good luck!!");
			
		} else  {
			System.out.println("This person can't drive!!" + " " + "Need to wait " + diff + " Years!!");
	} 
		///////////////////////////////////////////////////////////////
		
		String name = "Biraj";
		if(name == "Biraj") {
			System.out.println("Yes, this is a Guy !");}
			else {
			System.out.println("Wrong Person!");
		}
		
		int age = 14;
		if(age >= 16) {
			System.out.println("You are eligible for DL");
		}
		else {System.out.println("Not Eligible!! Wait " + (16 - age) + " Year(s).");}
		
		//////////////////////////////////////////////////
		double costOfMilk = 1;
		if(costOfMilk <= 2) {
			System.out.println("Buying 3.");
		} else if(costOfMilk <= 3) {
			System.out.println("Buying 2.");
		} else {
			System.out.println("Not buying any milk.");
		}
		
		
		//Switch Statement//////////////////////////////////
		char rank = 'A';
		switch (rank) {
		case 'A': 
			System.out.println("You are in range of 90-100!");
			break;
		case 'B':
			System.out.println("You are in range of 80-89!");
			break;
		case 'C':
			System.out.println("You are in range of 70-79!");
			break;
		case 'D':
			System.out.println("You are in range of 60-69!");
			break;
		default:
			System.out.println("0-59");
		}
		
		///Same other Example ///
		
		char grade ='A';
		
		switch (grade){
		case 'A':
		System.out.println("90%");
		break;
		case 'B':
			System.out.println("80%");
			break;
		case 'C':
		System.out.println("70%'");
		break;
		default:
		System.out.println("0%");
		}
		////////////////////////////////////////
		if (5 ==5) {
			if (4 == 5) {
				System.out.println("5 is 5 & 4 is 4");
			} else {
				System.out.println("5 is 5");
			}
		}
		
		if (5 == 5 && 4 == 4) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
		
		
		
		
		
		
		// if    else if     else
		
		double costOfEggs = 2.12;
		int numberOfDozensOfEggsToPurchase = 0;
			if (costOfEggs > 3) {
				numberOfDozensOfEggsToPurchase = 1;
			} else if (costOfEggs > 2) {
				numberOfDozensOfEggsToPurchase = 2;
			} else if (costOfEggs > 1) {
				numberOfDozensOfEggsToPurchase = 3;
			} else {
				numberOfDozensOfEggsToPurchase = 4;
			}
		System.out.println("I will buy " + numberOfDozensOfEggsToPurchase + " dozan eggs.");
		
		
	}

}
