package com.jagithub.BacktrackingExamples.algorithms.permutations;

import com.jagithub.BacktrackingExamples.interfaces.Demo;

public class GeneratePermutationsDemo implements Demo {

    private GeneratePermutations generatePermutations;

    public GeneratePermutationsDemo() {
        generatePermutations = new GeneratePermutations();
    }

    @Override
    public void start() {
        generatePermutations.setNumber(3);
        generatePermutations.generate();
    }
}
