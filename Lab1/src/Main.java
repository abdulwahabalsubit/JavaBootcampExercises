//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner input = new Scanner(System.in);
    /*
1. Write a Java program to print
the sum (addition), multiply, subtract, divide and remainder of
two numbers , takes two numbers as input
Test Data:
Input first number: 125
Input second number: 24
Expected Output :
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5
Expected Output : 125 + 24 = 149
     */
    System.out.println("Select Opration from menu:\n1- sum (addition)\n2- multiply\n3- subtract\n4- divide\n5- remainder ");
    int selection = input.nextInt();
    switch (selection) {

        case 1:
            System.out.println();
            System.out.println("enter 1st number: ");
            int numS1 = input.nextInt();
            System.out.println("enter 2ed number: ");
            int numS2 = input.nextInt();
            System.out.println(numS1 + " + " + numS2 + " = " + (numS1 + numS2));
            break;
        case 2:
            System.out.println();
            System.out.println("enter 1st number: ");
            int numM1 = input.nextInt();
            System.out.println("enter 2ed number: ");
            int numM2 = input.nextInt();
            System.out.println(numM1 + " x " + numM2 + " = " + (numM1 * numM2));
            break;
        case 3:
            System.out.println();
            System.out.println("enter 1st number: ");
            int numT1 = input.nextInt();
            System.out.println("enter 2ed number: ");
            int numT2 = input.nextInt();
            System.out.println(numT1 + " - " + numT2 + " = " + (numT1 - numT2));
            break;
        case 4:
            System.out.println();
            System.out.println("enter 1st number: ");
            int numD1 = input.nextInt();
            System.out.println("enter 2ed number: ");
            int numD2 = input.nextInt();
            System.out.println(numD1 + " / " + numD2 + " = " + (numD1 / numD2));
            break;
        case 5:
            System.out.println();
            System.out.println("enter 1st number: ");
            int numR1 = input.nextInt();
            System.out.println("enter 2ed number: ");
            int numR2 = input.nextInt();
            System.out.println(numR1 + " % " + numR2 + " = " + (numR1 % numR2));
            break;
        default:
            System.out.println("your selection out of our oprtions");
    }
    System.out.println();
    System.out.println("======================================");
    System.out.println();
    /*
    2. Write a Java program that takes a number as input and prints its multiplication table up to 10
    Input a number: 8
    Expected Output : 8 x 1 = 8
     */

    System.out.println("enter number for multiplication table: ");
    int number = input.nextInt();

    for (int i = 1; i <= 10; i++) {
        System.out.println(number + " * " + i + " = " + (number * i));
    }
    System.out.println();
    System.out.println("======================================");
    System.out.println();
    /*
3. Write a Java program to print the area and perimeter of a circle.
     */
    System.out.println("enter number to find area of a circle: ");
    double pi = 3.14159;
    System.out.println("Radius number: ");
    double radius = input.nextDouble();
    System.out.println("Perimeter is  = " + (2 * pi * radius));
    System.out.println("Area is  = " + pi * radius * radius);

    System.out.println();
    System.out.println("======================================");
    System.out.println();

    /*
4. Java program to find out the average of a set of integers
     */
    System.out.println("Enter set of integers to find average and 0 to exit!!: ");
    int count = 0;
    double ruselt = 0.0;
    double averageSum = 0;
    while (true) {
        System.out.println("Enter an integer or 0 to exit: ");
        int averageNum = input.nextInt();
        if (averageNum == 0)
            break;
        count++;
        averageSum += averageNum;
    }
    ruselt = averageSum / count;
    System.out.println("The average is: " + ruselt);
    System.out.println("The total of integer is: " + averageSum + " and the count is: " + count);

    System.out.println();
    System.out.println("======================================");
    System.out.println();

    /*
5. Write a Java program that accepts three integers as input, adds the first two integers
together, and then determines whether the sum is equal to the third integer.
     */

    System.out.print("Input the first number: ");
    int fnum = input.nextInt();
    System.out.print("Input the second number: ");
    int snum = input.nextInt();
    System.out.print("Input the third number : ");
    int tnum = input.nextInt();

    System.out.println("The result is: " + ((fnum + snum) == tnum));

    System.out.println();
    System.out.println("======================================");
    System.out.println();

    /*
6. Write a Java program to reverse a word.
     */
    System.out.print("Enter your text you want to reverse: ");
    input.nextLine();
    String reverseText = input.nextLine();
    int textLingth = reverseText.length();
    String textResult = "";

    for (int i = textLingth - 1; i >= 0; i--) {
        textResult += reverseText.charAt(i);
    }
    System.out.print("Reverse word: " + textResult);

    System.out.println();
    System.out.println("======================================");
    System.out.println();

    /*
7 - Java program to check whether the given number is even or odd
     */
    System.out.println("Input the number to check whether the given number is even or odd: ");
    int checkNumber = input.nextInt();
    if (checkNumber % 2 == 0)
        System.out.println("TThe number is Even : ");
    else
        System.out.println("The number is Odd : ");

    System.out.println();
    System.out.println("======================================");
    System.out.println();

    /*
8 - Java program to convert the temperature in Centigrade to Fahrenheit
     */
    System.out.println("enter the number you want to convert in Centigrade to Fahrenheit: ");
    double centigrade = input.nextDouble();
    double fahrenheit = (centigrade * 9.0 / 5.0) + 32;

    System.out.println("Temperature in Fahrenheit is: " + fahrenheit);

    System.out.println();
    System.out.println("======================================");
    System.out.println();

    /*
9.Write a Java program that takes a string and a number from the user,then prints the
character in the given index.
     */
    System.out.println("enter your Text: ");
    String indexOfText = input.nextLine();
    System.out.println("enter the index of character: ");
    int index = input.nextInt();
    int lengthOfText = indexOfText.length();
    if (index > lengthOfText)
        System.out.println("your enter must by lessThan " + (lengthOfText));
    System.out.println("the character in index: " + index + " is: " + indexOfText.charAt(index));

    System.out.println();
    System.out.println("======================================");
    System.out.println();

    /*
10. Write a Java program to print the area and perimeter of a rectangle.
     */
    System.out.println("enter number to find area and perimeter of a rectangle: ");

    System.out.println("input the width of rectangle: ");
    double width = input.nextDouble();
    System.out.println("input the height of rectangle: ");
    double height = input.nextDouble();
    System.out.println("Area is  = " + (width * height));
    System.out.println("Perimeter is  = " + (2 * (width + height)));

    System.out.println();
    System.out.println("======================================");
    System.out.println();

    /*
11. Write a Java program to compare two numbers.
Input Data:
Input first integer: 25
Input second integer: 39
Expected Output
25 != 39
25 < 39
25 <= 39
     */

    System.out.println("Input two number to compare between them: ");
    System.out.print("Input first integer: ");
    int firstNumber = input.nextInt();
    System.out.print("Input second integer: ");
    int secondNumber = input.nextInt();
    if (firstNumber != secondNumber)
        System.out.println(firstNumber + " != " + secondNumber);
    if (firstNumber < secondNumber)
        System.out.println(firstNumber + " < " + secondNumber);
    if (firstNumber <= secondNumber)
        System.out.println(firstNumber + " <= " + secondNumber);

    System.out.println();
    System.out.println("======================================");
    System.out.println();

    /*
12. Write a Java program to convert seconds to hours, minutes and seconds.
Sample Output:
Input seconds: 86399
23:59:59
     */
    System.out.print("Input number to convert seconds to hours, minutes and seconds: ");
    int secondsNum = input.nextInt();
    int hours = secondsNum / 3600;
    int remainingSeconds = secondsNum % 3600;
    int minutes = remainingSeconds / 60;
    int seconds = remainingSeconds % 60;
    System.out.print("time --> " + hours + ":" + minutes + ":" + seconds);

    System.out.println();
    System.out.println("======================================");
    System.out.println();

    /*
13. Write a Java program that accepts four integers from the user and prints equal if all four are equal, and not equal otherwise.
Sample Output:
Input first number: 25
Input second number: 37
Input third number: 45
Input fourth number: 23
Numbers are not equal!
     */
    System.out.print("Input the first number: ");
    int firstNum = input.nextInt();
    System.out.print("Input the second number: ");
    int secondNum = input.nextInt();
    System.out.print("Input the third number : ");
    int thirdNum = input.nextInt();
    System.out.print("Input the fourth number : ");
    int fourthNum = input.nextInt();
    if (firstNum == secondNum && firstNum == thirdNum && firstNum == fourthNum) {
        System.out.println("Numbers are equal!");
    } else
        System.out.println("Numbers are not equal!");

    System.out.println();
    System.out.println("======================================");
    System.out.println();

    /*
14. Write a Java program that reads an integer and check whether it is negative, zero, or positive.
Test Data
Input a number: 7
Expected Output :Number is positive
     */
    System.out.print("Input integer to check whether it is negative, zero, or positive ");
    int negativeOrPositive = input.nextInt();

    if (negativeOrPositive > 0) {
        System.out.println("Numbers is positive");
    } else if (negativeOrPositive < 0)
        System.out.println("Numbers is negative");
    else if (negativeOrPositive == 0)
        System.out.println("Numbers is zero");

    System.out.println();
    System.out.println("======================================");
    System.out.println();

    /*
15.Write a program to enter the numbers till the user wants and at the end it
should display the count of positive, negative and zeros entered (End loop use -1 ,Don’t count -1).
Test data
1
3
0
-2
-4
-1
2 positives
1 zero
2 negatives
     */

    int sumPositives = 0;
    int sumnNgatives = 0;
    int sumZeros = 0;
    while (true) {
        System.out.println("etner number if you want to stop enter number -1: ");
        int countNumbers = input.nextInt();
        if (countNumbers == -1)
            break;
        if (countNumbers == 0)
            sumZeros++;
        else if (countNumbers > 0)
            sumPositives++;
        else if (countNumbers < 0 && countNumbers != -1)
            sumnNgatives++;
    }
    System.out.println(sumPositives + " Positive\n" + sumZeros + " Zero\n" + sumnNgatives + " Ngative");

    System.out.println();
    System.out.println("======================================");
    System.out.println();

    /*
16 - Write a program that prompts the user to input an integer and then outputs the
number with the digits reversed.
For example, if the input is 12345, the output should be 54321
     */
    System.out.println("input an integer you want to reverse: ");
    int reverseNumber = input.nextInt();
    int numberReversed = 0;

    while (reverseNumber != 0) {
        int lastDigit = reverseNumber % 10;
        numberReversed = numberReversed * 10 + lastDigit;
        reverseNumber = reverseNumber / 10;
    }

    System.out.println("number after reversed: " + numberReversed);

    System.out.println();
    System.out.println("======================================");
    System.out.println();

    /*
17 - Write a program to enter the numbers till the user wants and at the end the
program should display the largest and smallest numbers entered.
enter the number : 4
enter the number : 5
enter the number : -1
enter the number : 9
the large number : 9
the small number : -1
     */
    int largeNumber = 0;
    int smalNumber = 0;
    System.out.println("input an integer you want to display the largest and smallest numbers entered: ");

    while (true) {
        System.out.println("etner number if you want to stop enter number 0: ");
        int currentNumber = input.nextInt();
        if (currentNumber == 0)
            break;
        if (currentNumber > largeNumber)
            largeNumber = currentNumber;
        if (currentNumber < largeNumber)
            smalNumber = currentNumber;

    }
    System.out.println("the large number :" + largeNumber + "\nthe small number :" + smalNumber);

    System.out.println();
    System.out.println("======================================");
    System.out.println();

    /*
18 - Determine and print the number of times the character ‘a’ appears in the input entered by the user.
Enter String: Java bootcamp
Output: Number of a's: 3
     */
    int storLetterA = 0;
    System.out.println("Enter String: ");
    String text = input.nextLine();
    int lengthTest = text.length();
    for (int i = 0; i < lengthTest; i++) {
        if (text.charAt(i) == 'a')
            storLetterA++;

    }
    System.out.println("Number of a's: " + storLetterA);

}
