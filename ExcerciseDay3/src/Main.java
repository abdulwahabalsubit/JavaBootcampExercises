void main() {

    /*
1.Write a program that checks the role of the user
If the role is admin print "welcome admin"
If the role is superuser print "welcome superuser"
If the role is user print "welcome user" (tip:use if else)
     */

    Scanner input = new Scanner(System.in);
    System.out.print("enter your role: ");
    String role = input.nextLine();


    if (role.equals("admin")) {
        System.out.println("welcome admin");
    } else if (role.equals("superuser")) {
        System.out.println("welcome superuser");
    } else if (role.equals("user")) {
        System.out.println("welcome user");
    } else
        System.out.println("ops!");

    System.out.println("");
    System.out.println("==============================");
    System.out.println("");
/*
2.Take three numbers from the user and print the greatest number.
Test Data
Input the 1st number: 25
Input the 1st number: 78
Input the 3rd number: 87
Expected Output : The greatest: 87
*/

    System.out.println("enter three numbers to find the greatest number");
    System.out.print("enter 1st numbers: ");
    int fNumber = input.nextInt();
    System.out.print("enter 2st numbers: ");
    int sNumber = input.nextInt();
    System.out.print("enter 3st numbers: ");
    int tNumber = input.nextInt();

    if ((fNumber > sNumber) && (fNumber > tNumber)) {
        System.out.println("The greatest: " + fNumber);
    } else if ((sNumber > fNumber) && (sNumber > tNumber)) {
        System.out.println("The greatest: " + sNumber);
    } else if ((tNumber > fNumber) && (tNumber > fNumber)) {
        System.out.println("The greatest: " + tNumber);
    }

    System.out.println("");
    System.out.println("==============================");
    System.out.println("");

    /*
    3.Write a Java program that generates an integer between 1 and 7 and displays the name of the weekday.
Test Data
number: 4
Expected Output:
Wednesday
     */

    System.out.println("type your number of weekdays: ");
    System.out.print("number: ");
    int day = input.nextInt();

    switch (day) {
        case 1:
            System.out.println("Sunday");
            break;
        case 2:
            System.out.println("Monday");
            break;
        case 3:
            System.out.println("Tuesday");
            break;
        case 4:
            System.out.println("Wednesday");
            break;
        case 5:
            System.out.println("Thursday");
            break;
        case 6:
            System.out.println("Friday");
            break;
        case 7:
            System.out.println("Saturday");
            break;
        default:
            System.out.println("uncorrected number: " + day);
    }

    System.out.println("");
    System.out.println("==============================");
    System.out.println("");

/*
    4. Write a program that takes a numeric score as input and prints
       the corresponding letter grade using the following grading scale:
A: 90-100
B: 80-89
C: 70-79
D: 60-69
F: 0-59
Enter your numeric score: 85
Numeric Score: 85
Letter Grade: B
     */

    System.out.println("enter numeric score to grading scale: ");
    System.out.print("Enter your numeric score: ");
    int score = input.nextInt();
    if (score >= 90 && score <= 100) {
        System.out.println("Numeric Score: " + score);
        System.out.println("Letter Grade: A");
    } else if (score >= 80 && score <= 89) {
        System.out.println("Numeric Score: " + score);
        System.out.println("Letter Grade: B");
    } else if (score >= 70 && score <= 79) {
        System.out.println("Numeric Score: " + score);
        System.out.println("Letter Grade: C");
    } else if (score >= 60 && score <= 69) {
        System.out.println("Numeric Score: " + score);
        System.out.println("Letter Grade: D");
    } else if (score >= 0 && score <= 59) {
        System.out.println("Numeric Score: " + score);
        System.out.println("Letter Grade: F");
    }

    System.out.println("");
    System.out.println("==============================");
    System.out.println("");

    /*
    5. Write a Java program that takes a person's age as input and categorizes them into one of
       three age categories: "Child," "Teenager," or "Adult" using an if statement.
use an if statement to categorize the age based on the following criteria:
• If the age is less than 13, categorize them as a "Child."
• If the age is between 13 and 19 (inclusive), categorize them as a "Teenager."
• If the age is 20 or older, categorize them as an "Adult."
Sample Output:
Enter your age: 25
You are an Adult.
     */

    System.out.println("Enter person's age to get categorizes: ");
    System.out.print("Enter your age: ");
    int age = input.nextInt();
    if (age < 13)
        System.out.println("You are an Child.");
    else if (age >= 13 && age <= 19)
        System.out.println("You are an Teenager.");
    else if (age >= 20)
        System.out.println("You are an Adult.");

    System.out.println("");
    System.out.println("==============================");
    System.out.println("");

}
