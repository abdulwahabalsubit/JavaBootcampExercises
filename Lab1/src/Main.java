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


}
