package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        // Example input
        String word_1 = "USA";
        String word_2 = "leetcode";
        String word_3 = "Usa";
        String word_4 = "FlaG";

        // Expected answer : true, true, true, false
        logger.info("{}'s usage of capitals is {} ", word_1, Solution.detectCapitalUse(word_1) ? "correct" : "incorrect");
        logger.info("{}'s usage of capitals is {} ", word_2, Solution.detectCapitalUse(word_2) ? "correct" : "incorrect");
        logger.info("{}'s usage of capitals is {} ", word_3, Solution.detectCapitalUse(word_3) ? "correct" : "incorrect");
        logger.info("{}'s usage of capitals is {} ", word_4, Solution.detectCapitalUse(word_4) ? "correct" : "incorrect");
    }
}