# Homework 10 - Addition Game with Arrays, Methods, and Loops
## Introduction
This was the second part of our homework 10 assignment. We had to add an array to the addition game.

## Command Prompt
```
D:\KLD_CS1_WorkSpace\AdditionGameMethodsArraysLoops>git status
fatal: Not a git repository (or any of the parent directories): .git

D:\KLD_CS1_WorkSpace\AdditionGameMethodsArraysLoops>git init
Initialized empty Git repository in D:/KLD_CS1_WorkSpace/AdditionGameMethodsArraysLoops/.git/

D:\KLD_CS1_WorkSpace\AdditionGameMethodsArraysLoops>git add .

D:\KLD_CS1_WorkSpace\AdditionGameMethodsArraysLoops>git commit -m "first commit"
[master (root-commit) a0452b3] first commit
 4 files changed, 29 insertions(+)
 create mode 100644 .classpath
 create mode 100644 .project
 create mode 100644 bin/AdditionGameMethodsArraysLoops.class
 create mode 100644 src/AdditionGameMethodsArraysLoops.java

D:\KLD_CS1_WorkSpace\AdditionGameMethodsArraysLoops>git remote add origin https://github.com/KaseyDelk/AdditionGameMethodsArraysLoops.git

D:\KLD_CS1_WorkSpace\AdditionGameMethodsArraysLoops>git push
warning: push.default is unset; its implicit value has changed in
Git 2.0 from 'matching' to 'simple'. To squelch this message
and maintain the traditional behavior, use:

  git config --global push.default matching

To squelch this message and adopt the new behavior now, use:

  git config --global push.default simple

When push.default is set to 'matching', git will push local branches
to the remote branches that already exist with the same name.

Since Git 2.0, Git defaults to the more conservative 'simple'
behavior, which only pushes the current branch to the corresponding
remote branch that 'git pull' uses to update the current branch.

See 'git help config' and search for 'push.default' for further information.
(the 'simple' mode was introduced in Git 1.7.11. Use the similar mode
'current' instead of 'simple' if you sometimes use older versions of Git)

fatal: The current branch master has no upstream branch.
To push the current branch and set the remote as upstream, use

    git push --set-upstream origin master


D:\KLD_CS1_WorkSpace\AdditionGameMethodsArraysLoops>git push --set-upstream origin master
Username for 'https://github.com': KaseyDelk
Password for 'https://KaseyDelk@github.com':
Counting objects: 8, done.
Delta compression using up to 4 threads.
Compressing objects: 100% (8/8), done.
Writing objects: 100% (8/8), 1.16 KiB | 0 bytes/s, done.
Total 8 (delta 0), reused 0 (delta 0)
To https://github.com/KaseyDelk/AdditionGameMethodsArraysLoops.git
 * [new branch]      master -> master
Branch master set up to track remote branch master from origin.

D:\KLD_CS1_WorkSpace\AdditionGameMethodsArraysLoops>git add .

D:\KLD_CS1_WorkSpace\AdditionGameMethodsArraysLoops>git commit -m "added working code"
[master ff8acbb] added working code
 2 files changed, 60 insertions(+), 2 deletions(-)
 rewrite bin/AdditionGameMethodsArraysLoops.class (72%)

D:\KLD_CS1_WorkSpace\AdditionGameMethodsArraysLoops>git push
warning: push.default is unset; its implicit value has changed in
Git 2.0 from 'matching' to 'simple'. To squelch this message
and maintain the traditional behavior, use:

  git config --global push.default matching

To squelch this message and adopt the new behavior now, use:

  git config --global push.default simple

When push.default is set to 'matching', git will push local branches
to the remote branches that already exist with the same name.

Since Git 2.0, Git defaults to the more conservative 'simple'
behavior, which only pushes the current branch to the corresponding
remote branch that 'git pull' uses to update the current branch.

See 'git help config' and search for 'push.default' for further information.
(the 'simple' mode was introduced in Git 1.7.11. Use the similar mode
'current' instead of 'simple' if you sometimes use older versions of Git)

Username for 'https://github.com': KaseyDelk
Password for 'https://KaseyDelk@github.com':
Counting objects: 6, done.
Delta compression using up to 4 threads.
Compressing objects: 100% (6/6), done.
Writing objects: 100% (6/6), 2.37 KiB | 0 bytes/s, done.
Total 6 (delta 0), reused 0 (delta 0)
To https://github.com/KaseyDelk/AdditionGameMethodsArraysLoops.git
   a0452b3..ff8acbb  master -> master

D:\KLD_CS1_WorkSpace\AdditionGameMethodsArraysLoops>git status
On branch master
Your branch is up-to-date with 'origin/master'.
Untracked files:
  (use "git add <file>..." to include in what will be committed)

        README.md

nothing added to commit but untracked files present (use "git add" to track)

D:\KLD_CS1_WorkSpace\AdditionGameMethodsArraysLoops>git add .

D:\KLD_CS1_WorkSpace\AdditionGameMethodsArraysLoops>git commit -m "added read me"
[master bff72e9] added read me
 1 file changed, 106 insertions(+)
 create mode 100644 README.md

D:\KLD_CS1_WorkSpace\AdditionGameMethodsArraysLoops>git push
warning: push.default is unset; its implicit value has changed in
Git 2.0 from 'matching' to 'simple'. To squelch this message
and maintain the traditional behavior, use:

  git config --global push.default matching

To squelch this message and adopt the new behavior now, use:

  git config --global push.default simple

When push.default is set to 'matching', git will push local branches
to the remote branches that already exist with the same name.

Since Git 2.0, Git defaults to the more conservative 'simple'
behavior, which only pushes the current branch to the corresponding
remote branch that 'git pull' uses to update the current branch.

See 'git help config' and search for 'push.default' for further information.
(the 'simple' mode was introduced in Git 1.7.11. Use the similar mode
'current' instead of 'simple' if you sometimes use older versions of Git)

Username for 'https://github.com': KaseyDelk
Password for 'https://KaseyDelk@github.com':
Counting objects: 3, done.
Delta compression using up to 4 threads.
Compressing objects: 100% (3/3), done.
Writing objects: 100% (3/3), 1.27 KiB | 0 bytes/s, done.
Total 3 (delta 0), reused 0 (delta 0)
To https://github.com/KaseyDelk/AdditionGameMethodsArraysLoops.git
   ff8acbb..bff72e9  master -> master

D:\KLD_CS1_WorkSpace\AdditionGameMethodsArraysLoops>
```

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
