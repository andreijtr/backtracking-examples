package com.jagithub.BacktrackingExamples.algorithms.letters;

import com.jagithub.BacktrackingExamples.interfaces.Demo;

public class VowelConsonantPairDemo implements Demo {

    private VowelConsonantPair vowelConsonantPair;

    @Override
    public void start() {
        vowelConsonantPair = new VowelConsonantPair();
        char[] chars = {'a', 'b', 'c', 'd', 'e'};
        int wordsLength = 4;

        vowelConsonantPair.setCharacters(chars);
        vowelConsonantPair.setWordsLength(wordsLength);

        vowelConsonantPair.generateWords();
    }
}
