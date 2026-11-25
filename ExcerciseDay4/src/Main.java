//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner input = new Scanner(System.in);
/*
1.Write a program that prints the numbers from 1 to 100 such that:
If the number is a multiple of 3, you need to print "Fizz" instead of that number.
If the number is a multiple of 5, you need to print "Buzz" instead of that number.
If the number is a multiple of both 3 and 5, you need to print "FizzBuzz" instead of that number.
 */


    for (int i = 1; i <= 100; i++) {

        if (i % 15 == 0) {
            System.out.println("FizzBuzz");

        } else if (i % 3 == 0) {
            System.out.println("Fizz");

        } else if (i % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(i);
        }
    }

    System.out.println();
    System.out.println("=================================================");
    System.out.println();

    /*
2.Write a Java program to reverse a string.
Test Data: Input a string: The quick brown fox
Expected Output: Reverse string: xof nworb kciuq ehT
*/
    System.out.print("Enter the string you want to reverse: ");
    String reverseString = input.nextLine();
    String result = "";
    int reverseStringLingth = reverseString.length() - 1;

    for (int i = reverseStringLingth; i >= 0; i--) {
        result += reverseString.charAt(i);
    }

    System.out.println("Expected Output of string is :" + result);

    System.out.println();
    System.out.println("=================================================");
    System.out.println();

    /*
    3.Write a program to find the factorial value of any number entered through the keyboard.
     */
    System.out.print("Enter the number you want to get factorial: ");
    int number = input.nextInt();
    int factorialNumber = 1;
    for (int i = number; i >= 1; i--) {

        factorialNumber *= i;

    }
    System.out.println("The factorial of " + number + " is: " + factorialNumber);

    System.out.println();
    System.out.println("=================================================");
    System.out.println();

    /*
4.Two numbers are entered through the keyboard. Write a program to find
the value of one number raised to the power of another.
(Do not use Java built-in method)
  */

    int fnumbers = input.nextInt();
    int snumbers = input.nextInt();
    int powerOfNumbers = 1;
    for (int i = 0; i < snumbers; i++) {
        powerOfNumbers = powerOfNumbers * fnumbers;
    }
    System.out.println(powerOfNumbers);

    System.out.println();
    System.out.println("=================================================");
    System.out.println();

    /*
5.Write a program that reads a set of integers, and then prints the sum of the even and odd integers.
     */
    int numbers = 0;
    int oddSum = 0;
    int evenSum = 0;
    do {

        System.out.print("Enter list of number, If you want to stop enter 0: ");
        numbers = input.nextInt();
        if (numbers % 2 == 0)
            evenSum += numbers;
        else
            oddSum += numbers;

    }
    while (numbers != 0);
    System.out.println("thanks");
    System.out.println("total of Even numbers: " + evenSum);
    System.out.println("total of Odd numbers: " + oddSum);

    System.out.println();
    System.out.println("=================================================");
    System.out.println();

        /*
6.Write a program that prompts the user to input a positive integer.
It should then output a message indicating whether the number is a prime number.
     */
    System.out.print("Enter the positive integer");
    int postivieInteger = input.nextInt();

    if (postivieInteger <= 1) {
    } else {
        System.out.println("the number is a prime number.");
    }

    System.out.println();
    System.out.println("=================================================");
    System.out.println();

    /*
7.Use a for loop to print headings for four weeks (Weeks 1 - 4).
Then use another for loop to print the days (Days 1 -7) for each week.
Expected Output:
     */
    for (int i = 1; i <= 4; i++) {
        System.out.println("Week " + i);
        for (int j = 1; j <= 7; j++) {
            System.out.println("Day " + j);
        }
    }

    System.out.println();
    System.out.println("=================================================");
    System.out.println();

/*
8.Write a program thats check if the word is a palindrome or not.
hint: A string is said to be a palindrome if it is the same if we start reading it from
left to right or right to left.
     */
    String palindromeWord = input.nextLine();
    boolean isPalindrome;
    int palindromeLeft = 0;
    int palindromeRight = palindromeWord.length() - 1;

    // Compare characters from both ends moving toward the center
    while (palindromeLeft < palindromeRight) {
        if (palindromeWord.charAt(palindromeLeft) != palindromeWord.charAt(palindromeRight)) {
            isPalindrome = false;
            System.out.println(isPalindrome);
        }
        palindromeLeft++;
        palindromeRight--;
        isPalindrome = true;
        System.out.println(isPalindrome);
    }

}
