package QuestionC;

import java.util.StringTokenizer;

/**
 *
 * @author Brindusa
 */
public class ReverseWords {

    public static String reverse(String sentence, StringTokenizer token) {

        if (!token.hasMoreElements()) {
            return "";
        } else {
            String aux = token.nextElement().toString();
            return reverse(null, token) + " " + aux;
        }
    }

    public static void runExample(String sentence) {
        System.out.println("Original sentence: " + sentence
                + "\nReversed sentence: " + reverse(sentence, new StringTokenizer(sentence)));

    }

    public static void main(String[] args) {

        runExample("I wish you a merry Christmas.");
        runExample("Compromise, don't fight!");
        runExample("");

    }

}
