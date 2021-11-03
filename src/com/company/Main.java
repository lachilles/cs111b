/* Lianne Achilles
   CS 111B Assignment 3
   Count Words and display longest word
*/
package com.company;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        String phrase;
        int numWords;

        phrase = inputPhrase();

        numWords = analyzePhrase(phrase);

        System.out.println("Your phrase has " + numWords + " words in it.");
        System.out.println();
    }  // end of main function

    /**
     * inputPhrase method
     * Ask the user to input a phrase, and make sure it is at least 5 characters long.
     * (Uses recursion to make the user input a new phrase if it is too short.)
     *
     * @return the phrase
     */

    private static String inputPhrase() {
        Scanner keyIn = new Scanner(System.in);
        System.out.print("Please enter a phrase all on one line, \n" +
                "with just one space separating each word, \n" +
                "and no spaces at the beginning or end of the phrase. \n");
        String phrase = keyIn.nextLine();
        if (phrase.length() < 5) {
            System.out.print("Your phrase must contain at least 5 characters. \n");
            phrase = inputPhrase();
        }
        return phrase;
    }  // end of inputPhrase

    /**
     * analyzePhrase method
     * Count the number of words in a given string, and determine its longest word.
     * Assume the string is well formed and doesn't have leading
     * or trailing spaces, or multiple spaces in a row.
     * Return the number of words.
     * Output the longest word on the screen (console).
     *
     * @param phrase to analyze
     * @return number of words in str
     */

    private static int analyzePhrase(String phrase) {
        int i, len, temp_c = 0, temp_d = 0, numWords = 1;
        int maxWordLength = 0;
        String longestWord = null;
        if (phrase.indexOf(' ') == -1) {  // handle the case of one
            // word phrase like "Hello"
            longestWord = phrase;
        } else {
            for (i = 0; i < phrase.length(); i++) {
                char letter = phrase.charAt(i);
                if (letter == ' ' || letter == '.') {
                    temp_d = i;  // get ending index of word
                    String curWord = phrase.substring(temp_c, temp_d);
                    len = temp_d - temp_c;  // subtract beginning index from ending to get length of
                    // word
                    if (len > maxWordLength) {
                        longestWord = curWord; // if length of current word
                        // is longer than the maxWordLength previously seen, then replace the longestWord
                        maxWordLength = longestWord.length(); // set len to be the new
                    }
                    temp_c = temp_d + 1;  // set starting index of new word to ending index of last word
                    numWords += 1;  // increment wordcounter
                }
            }
        }
        System.out.printf("\nThe longest word in your phrase is %s with %d characters. ",
                longestWord, longestWord.length());
        return numWords;
    }  // end of analyzePhrase  function
} // end of main class

/* Sample Output:

Please enter a phrase all on one line,
with just one space separating each word,
and no spaces at the beginning or end of the phrase.
Barking Up The Wrong Tree

The longest word in your phrase is Barking with 7 characters. Your phrase has 5 words in it.

Please enter a phrase all on one line,
with just one space separating each word,
and no spaces at the beginning or end of the phrase.
You Can't Judge a Book By Its Cover

The longest word in your phrase is Can't with 5 characters. Your phrase has 8 words in it.
*/
