void main() {
    Scanner input = new Scanner(System.in);
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
