void main() {
    Scanner input = new Scanner(System.in);

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
