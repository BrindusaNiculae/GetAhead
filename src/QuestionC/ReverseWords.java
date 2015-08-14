package QuestionC;

import java.util.StringTokenizer;

/**
 *
 * @author Brindusa
 */
public class ReverseWords {

    public static String reverse(String sentence, StringTokenizer token, String reversedSentence) {

        if (token.hasMoreElements()) {
            reversedSentence = token.nextElement().toString() + " " + reversedSentence;
            return reverse(null, token, reversedSentence);
        }
        return reversedSentence;
    }

    public static void runExample(String sentence) {
        System.out.println("Original sentence: " + sentence
                + "\nReversed sentence: " + reverse(sentence, new StringTokenizer(sentence), new String()));

    }

    public static void main(String[] args) {

        runExample("I wish you a merry Christmas");
        runExample("Compromise, don't fight!");
        runExample("");

    }

}
