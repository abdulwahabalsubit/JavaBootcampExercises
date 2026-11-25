void main() {
    Scanner input = new Scanner(System.in);

    /*
8.Write a program thats check if the word is a palindrome or not.
hint: A string is said to be a palindrome if it is the same if we start reading it from
left to right or right to left.
     */

    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the number you want to get factorial: ");
    int number = input.nextInt();
    int factorialNumber = 1;
    for (int i = number; i >= 1; i--) {

        factorialNumber *= i;

    }
    System.out.println("The factorial of " + number + " is: " + factorialNumber);

}

