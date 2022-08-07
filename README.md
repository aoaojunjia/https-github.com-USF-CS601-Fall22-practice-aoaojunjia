# CS601 Practice exercises

I encourage students enrolled in cs601 to complete these simple practice problems before the beginning of the semester. 
In this set of practice problems, you will practice using the following:

- Java Basics: Classes&Objects, Methods, Conditionals, Iteration, Strings, Arrays, ArrayLists 
- Tools: IntelliJ, Maven, Github, JUnit

:warning: **It is expected that you solve these problems *without* looking up solutions or partial solutions on the Internet.**

## Getting Started
- Install Java 11 (you need JDK) and IntelliJ IDE (Community edition), and create an account on Github if you don't have one. Please use your USF email for the Github account.
- Click on the following link to create your private repository for this exercise: https://classroom.github.com/a/JjF2Y0y3
The repository will be seeded with the starter code for this exercise and test cases. 
- Go to this repository using the browser and click on the green button that says "Code"; you will see the URL of the repository -copy it, since you will need it for the next step.
- Clone a copy of the repository to your local machine. You can do it from IntelliJ by selecting VCS -> Checkout from Version Control -> Git, and following the instructions. Once IntelliJ successfully clones the repository to your local machine and opens the project, click on `Project` in the vertical bar on the left hand side, and then on the arrow next to the name of the project to see the starter code for the practice exercise. 
- Work on the problems by editing code in IntelliJ. Run the tests provided by the instructor.
- Commit and Push your code frequently as you work on the problems, and verify that your final solution is what you see on Github.  To commit and push your code, right click on the name of the project and select Git -> Commit Directory, select the files and add a comment, and finally, in the bottom right corner select Commit and Push.

## Problems
The starter code for the practice exercises is in the following two folders: 
- src/main/java/practiceArrraysStrings 
- src/main/java/practiceOOP

### practiceArraysStrings
This folder contains classes `ArrayHelper` and `StringHelper` where you need to fill in code in several simple array and string manupulation methods.
The comment above each method explains what the method is supposed to do.
You can test these classes by running JUnit tests provided in classes `ArrayHelperTest` and `StringHelperTest` located in the following folder: `src/test/java/practiceArrraysStrings` 

### practiceOOP
This folder contains classes `Student`, `University` and `Driver`. Fill in code in methods of classes `Student` and `University`.  The comment above each method explains what the method is supposed to do.
This folder also contains a csv file that contains information about several students. You can use it to test your code.
The instructor provided basic JUnit tests in `StudentTest` and `UniversityTest` classes in `src/test/java/practiceOOP` to test classes `Student` and `University`. Driver expects a command line argument: the path to the file with student info. You can specify it in Run->Edit Configurations ->Program arguments.

