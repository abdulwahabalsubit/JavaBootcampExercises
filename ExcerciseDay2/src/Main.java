//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
/*
* 1. Develop a program that takes the weight (in kilograms) and height (in meters) as input and calculates the BMI, then prints it.
• Input: Weight (kg) = 70, Height (m) = 1.75
• Expected Output: BMI = 22.86
*/
    Scanner input = new Scanner(System.in);
    int weight ;
    double height;
    double bmi;

    System.out.println("Enter your Weight (in kilograms)");
    weight = input.nextInt();

    System.out.println("Enter your Height (in meters)");
    height = input.nextDouble();

    bmi = weight/ (height * height)   ;
    System.out.println("your BMI is: " + bmi);

    System.out.println();
    System.out.println("\n=============================");
    System.out.println();

/*
2. Write a program that takes the obtained marks and total marks as input and calculates the percentage, then prints it.
• Input: Obtained Marks = 85, Total Marks = 100
• Expected Output: Percentage = 85.0%
 */

    int obtained ;
    int total;
    double percentage;

    System.out.println("Enter your obtained");
    obtained = input.nextInt();

    System.out.println("Enter your total");
    total = input.nextInt();

    percentage = (obtained / total) * 100 ;
    System.out.println("your Percentage is: " + percentage + "%");

    System.out.println();
    System.out.println("\n=============================");
    System.out.println();

/*
3. Create a program that takes an amount in one currency and an exchange rate as input, then converts and prints the amount in another currency.
• Input: Amount in USD = 100, Exchange Rate (USD to EUR) = 0.85
• Expected Output: Amount in EUR = 85.0
 */
    double amount ;
    double exchangeRate;
    double convert;

    System.out.println("Enter your amount USD");
    amount = input.nextDouble();

    System.out.println("Enter Exchange Rate (USD to EUR)");
    exchangeRate = input.nextDouble();

    convert = (amount * exchangeRate)  ;
    System.out.println("Amount in EUR = " + convert );

    System.out.println();
    System.out.println("\n=============================");
    System.out.println();
/*
4. Create a program that takes a string as input, calculates its length,
    and then reverses the string using the StringBuilder class, finally printing both the length and reversed string.
• Input: "Hello, World!"
• Expected Output: Length of the string: 13 And Reversed string: "!dlroW ,olleH"
 */

    System.out.println("Enter your wort to reverses and get length of it");
    input.nextLine();
    String reverseText = input.nextLine();

    StringBuilder sb = new StringBuilder(reverseText);
    System.out.println("Length of the string: " + reverseText.length() + " And Reversed string: \"" + sb.reverse() + "\"");

    System.out.println();
    System.out.println("\n=============================");
    System.out.println();

    /*
    5. Develop a program that takes a sentence as input and extracts a substring from it, then prints the extracted substring.
• Input: Sentence = "The quick brown fox jumps over the lazy dog", Start Index = 10, End Index = 20
• Expected Output: "brown fox"
     */
    String sentence ;
    System.out.println("Enter your sentence to extracts a substring from it");
    sentence = input.nextLine();
    System.out.println("Enter your Start Index");
    int  startIndex = input.nextInt();
    System.out.println("Enter your End Index");
    int  endIndex = input.nextInt();
    String result = sentence.substring(startIndex,endIndex);
    System.out.println("Output: " + result);

    System.out.println();
    System.out.println("\n=============================");
    System.out.println();

/*
6. Write a program that takes a sentence and a keyword as input,
   then check if the keyword is present in the sentence and prints the result.
• Input: Sentence = "The quick brown fox jumps over the lazy dog", Keyword = "jumps"
• Expected Output: Keyword "jumps" is present in the sentence.
 */
    String sentenceOfKeyword;
    String keyword;
    boolean resultOfKeyword;

    System.out.println("Enter your sentence to check keyword");
    sentenceOfKeyword = input.nextLine();
    System.out.println("Enter your keyword");
    keyword = input.nextLine();
    resultOfKeyword = sentenceOfKeyword.contains(keyword) ;
    System.out.println(" Keyword \"" + resultOfKeyword + "\" is present in the sentence.");

    System.out.println();
    System.out.println("\n=============================");
    System.out.println();

    /*
    7. Develop a program that takes a sentence and a word to replace as input,
    then replace all occurrences of the word with another word and prints the modified sentence.
• Input: Sentence = "The quick brown fox jumps over the lazy dog",
Word to Replace = "fox", Replacement Word = "cat"
• Expected Output: "The quick brown cat jumps over the lazy dog"
     */
    String sentenceOfWord;
    String word;
    String wordRelacement;
    System.out.println("Enter your want to modified sentence");
    sentenceOfWord = input.nextLine();
    System.out.println("Enter your word to replace");
    word = input.nextLine();
    System.out.println("Enter your word to replace with");
    wordRelacement = input.nextLine();

    System.out.println("Output: " + sentenceOfWord.replace(word,wordRelacement));

    System.out.println();
    System.out.println("\n=============================");
    System.out.println();

    /*
    8. Write a program that takes two strings as input and check if they are equal,ignoring the case,
    then prints whether they are equal or not.
• Input:  String1 = "Hello", String 2 = "hello"
• Expected Output: Strings are equal (ignoring case).
     */

    String String1;
    String String2;
    boolean resultEqual;
    System.out.println("Enter your string to check is equal");
    System.out.println("Enter your String1");
    String1 = input.nextLine();
    System.out.println("Enter your String2");
    String2 = input.nextLine();

    resultEqual = String1.equalsIgnoreCase(String2);
    System.out.println(" Strings are equal (ignoring case): " + resultEqual);

    System.out.println();
    System.out.println("\n=============================");
    System.out.println();





}
