package org.example;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void combination() {
        assertEquals(45, Solution.combination(10, 2)); // n > k
        assertEquals(1, Solution.combination(8, 8)); // n == k
        assertEquals(0, Solution.combination(6, 8)); // n < k
    }

    @org.junit.jupiter.api.Test
    void diverseReputation() {
        assertEquals(0, Solution.diverseReputation(0, 3)); // case where we have no men
        assertEquals(0, Solution.diverseReputation(3, 0)); // case where we have no women
        assertEquals(0, Solution.diverseReputation(1, 1)); // case where we have not enough people to make groups of 3
        assertEquals(9, Solution.diverseReputation(3, 2)); // case where we have more men
        assertEquals(3, Solution.diverseReputation(1, 3)); // case where we have more women
        assertNotEquals(0, Solution.diverseReputation(1, 2)); // case where we have enough people for 1 group

    }

}