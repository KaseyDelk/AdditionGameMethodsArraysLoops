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
new int[2];
## Console
```java
Begin Round 1
Add 0 + 3
Please enter integars only.
3
Good work! Your answer was correct.
Your score was 0 and is now 5.
Your hardness was 5 and is now 10.
Begin Round 2
Add 5 + 7
Please enter integars only.
12
Good work! Your answer was correct.
Your score was 5 and is now 15.
Your hardness was 10 and is now 20.
Begin Round 3
Add 14 + 12
Please enter integars only.
26
Good work! Your answer was correct.
Your score was 15 and is now 35.
The game is complete.
Your final score was 35
```

## Summary
This is my previous work; the only thing I did to the code was add an array.
