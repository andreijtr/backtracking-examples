/**
 * Generate words of 4 letters  using characters from A={a,b,c,d,e}(for our example), and a vowel must be between two consonants
 * exercise b. how many words start with a 'b' and finish with an 'e'?
 */

package com.jagithub.BacktrackingExamples.algorithms.letters;

public class VowelConsonantPair {

    private char[] characters;
    private int wordsLength;
    private int solutionB = 0;

    void generateWords() {

        char[] workArray = new char[wordsLength];
        for (int i = 0; i < wordsLength; i++) {
            workArray[i] = ' ';
        }

        int c = -1;
        int i = 0;

        while(i >= 0) {
            c += 1;
            if(c < characters.length) {
                workArray[i] = characters[c];
                if(isOkA(workArray, i)) {
                    if(i == wordsLength - 1) {
                        display(workArray);
                        if(isOkB(workArray)) {
                            solutionB++;
                        }
                    } else {
                        i++;
                        c = -1;
                    }
                }
            } else {
                i--;
                if (i >= 0) {
                    c = findActualValueForC(characters, workArray[i]);
                }
            }
        }

        System.out.println("Solution for exercise B: " + solutionB + " words starts with \'b\' and finish with \'e\'.");
    }

    private boolean isOkA( char[] array, int index) {
        if(index == 0) {
            return true;
        }
        if((array[index - 1] == 'a' || array[index - 1] == 'e') && (array[index] == 'a' || array[index] == 'e')) {
            return false;
        }
        return true;
    }

    private boolean isOkB (char[] array) {
        return (array[0] == 'b' && array[array.length - 1] == 'e');
    }

    private int findActualValueForC(char[] array, char value) {
        for (int i = 0; i < array.length; i++) {
            if(array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    private void display(char[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public void setCharacters(char[] characters) {
        this.characters = characters;
    }

    public void setWordsLength(int wordsLength) {
        this.wordsLength = wordsLength;
    }
}
