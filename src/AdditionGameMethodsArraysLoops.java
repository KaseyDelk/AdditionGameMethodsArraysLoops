import java.util.Scanner;

public class AdditionGameMethodsArraysLoops {
	public static void main(String[] args) {
		
		// call addition game method
		AdditonGameMethod();
	}
	public static void AdditonGameMethod() {
		
		int hardness = 5;
		int hardnessStep = 2;
		int score = 0;
		
		// create for loop for running rounds
		int numberOfRounds = 3;
		for(int roundNumber = 1; 
		roundNumber <= numberOfRounds;  
		roundNumber = roundNumber + 1){
			System.out.println("Begin Round " + roundNumber);
			boolean isAnswerCorrect = getAndCheckStudentAnswer(hardness);
			if(isAnswerCorrect){
				System.out.print("Your score was " + score + " and is now ");
				score = score + hardness;
				System.out.println(score + ".");
				
				if(roundNumber<numberOfRounds){
					System.out.print("Your hardness was " + hardness + " and is now ");
					hardness = hardness * hardnessStep;
					System.out.println(hardness + ".");
				}
			}else{
				if(roundNumber<numberOfRounds){
					System.out.print("Your hardness was " + hardness + " and is now ");
					if(hardness>5){
						hardness = hardness / hardnessStep;
					}
					System.out.println(hardness + ".");
				}
			}
		}
		System.out.println("The game is complete.");
		System.out.println("Your final score was " + score );
	}
	
	public static boolean getAndCheckStudentAnswer(int hardness) {
		int[] numbers = new int[2];
		numbers[0] = (int)(Math.random()*hardness);
		numbers[1] = (int)(Math.random()*hardness);
		System.out.println("Add " + numbers[0] + " + " + numbers[1]);
		System.out.println("Please enter integars only.");
	
		Scanner get = new Scanner(System.in);
		int studentAnswer = get.nextInt();
		if(studentAnswer == (numbers[0] + numbers[1])){
			System.out.println("Good work! Your answer was correct.");
			return true;
		}else{
			System.out.println("Nice try. The correct answer was " + (numbers[0] + numbers[1]));
			return false;
		}
	}
}