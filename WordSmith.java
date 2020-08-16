/* accept an input n from the user, and then n more sentences (sequences of words).
 * output
 * 1. The word in the sentence with the greatest length (number of characters)
 * 2. The word in the sentence with the most vowels
 * 3. The word in the sentence that is alphabetically "greatest" (meaning, the last element after sorting the words)
 */
import java.util.Scanner;
import java.util.Arrays;
public class WordSmith {
    public static void main(String[] args) {
        final String SPACE = " ";
        final String NEWLINE = "\n";
        final int LENGTH = 100;
        final String VOWELS = "aeiou";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int row = scanner.nextInt();
        scanner.nextLine();

        String[] sentence = new String[row];

        System.out.println("Enter n lines: ");
        for(int iRow = 0; iRow < row; iRow++) {
            sentence[iRow] = scanner.nextLine();
        }

        String[][] sentence2D = new String[row][];
        String[] takeSentence = new String[LENGTH];
        for(int iRow = 0; iRow < row; iRow++) {
            int j = 0;
            while(true){
                int index = sentence[iRow].indexOf(SPACE);
                if(index == -1) {
                    takeSentence[j] = sentence[iRow];
                    j++;
                    break;
                } else {
                    String word = sentence[iRow].substring(0, index);
                    sentence[iRow] = sentence[iRow].substring(index + 1);
                    takeSentence[j] = word;
                    j++;
                }


            }
            sentence2D[iRow] = new String[j];
            sentence2D[iRow] = Arrays.copyOf(takeSentence, j);

            // find greatest length, the most vowels, and alphabetically "greatest"
            int maxLength = 0;
            int maxLengthID = 0;
            int maxCountVowel = 0;
            int maxCountVowelID = 0;
            int biggestAlpha = 0;
            int biggestAlphaID = 0;
            for (int iWord = 0; iWord < sentence2D[iRow].length; iWord++) {
                // find greatest length
                if (sentence2D[iRow][iWord].length() > maxLength) {
                    maxLength = sentence2D[iRow][iWord].length();
                    maxLengthID = iWord;
                }
                // find the most vowels
                int countVowel = 0;
                for (int iWordChar = 0; iWordChar < sentence2D[iRow][iWord].length(); iWordChar++) {
                    String charOfWord = sentence2D[iRow][iWord].substring(iWordChar,iWordChar + 1);
                    if (VOWELS.contains(charOfWord)) {
                        countVowel += 1;
                        if (countVowel > maxCountVowel) {
                            maxCountVowel = countVowel;
                            maxCountVowelID = iWord;
                        }
                    }
                }
                // find alphabetically "greatest"
                if ((int) sentence2D[iRow][iWord].charAt(0) > biggestAlpha) {
                    biggestAlpha = (int) sentence2D[iRow][iWord].charAt(0);
                    biggestAlphaID = iWord;
                }

            }

            System.out.format(sentence2D[iRow][maxLengthID] + "," + sentence2D[iRow][maxCountVowelID] + "," +
                    sentence2D[iRow][biggestAlphaID] + "\n");
        }
    }
}
