# Homework 10 - Addition Game with Arrays, Methods, and Loops
## Introduction
This was the second part of our homework 10 assignment. We had to add an array to the addition game.

## Code
```java
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
		int numberOfRounds = 4;
		for(int roundNumber = 1; 
		roundNumber <= numberOfRounds;  
		roundNumber = roundNumber + 1){
			System.out.println("Round " + roundNumber);
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
		int[] array;
		array = new int[2];
		array[0] = (int)(Math.random()*hardness);
		array[1] = (int)(Math.random()*hardness);
		System.out.println("Add " + array[0] + " + " + array[1]);
		System.out.println("Please enter integars only.");
	
		Scanner get = new Scanner(System.in);
		int studentAnswer = get.nextInt();
		if(studentAnswer == (array[0] + array[1])){
			System.out.println("Good work! Your answer was correct.");
			return true;
		}else{
			System.out.println("Nice try. The correct answer was " + (array[0] + array[1]));
			return false;
		}
	}
}
```
## Console
```java
Round 1
Add 0 + 0
Please enter integars only.
0
Good work! Your answer was correct.
Your score was 0 and is now 5.
Your hardness was 5 and is now 10.
Round 2
Add 9 + 6
Please enter integars only.
15
Good work! Your answer was correct.
Your score was 5 and is now 15.
Your hardness was 10 and is now 20.
Round 3
Add 17 + 7
Please enter integars only.
24
Good work! Your answer was correct.
Your score was 15 and is now 35.
Your hardness was 20 and is now 40.
Round 4
Add 5 + 23
Please enter integars only.
28
Good work! Your answer was correct.
Your score was 35 and is now 75.
The game is complete.
Your final score was 75
```

## Summary
This is my previous work; the only thing I did to the code was add an array.