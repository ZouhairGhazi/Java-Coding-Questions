package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    // Standard test case, trips = number of bags
    @Test
    void compute_number_of_bags_3_when_all_elements_cannot_be_grouped() {
        assertEquals(3, Solution.efficientJanitor(Arrays.asList(1.99F, 2.5F, 1.5F)));
    }

    // Advanced test case, 1 trip of one b bag and 2 trips of 2 bags
    @Test
    void compute_number_of_bags_3_when_some_elements_can_be_grouped() {
        assertEquals(3, Solution.efficientJanitor(Arrays.asList(1.01F, 1.99F, 2.5F, 1.5F, 1.01F)));
    }

    // Exception test case, one of the bags weighs less than 1.01
    @Test
    void throw_illegal_argument_exception_when_element_is_lower_than_1() {
        assertThrows(IllegalArgumentException.class, () -> {
            Solution.efficientJanitor(Arrays.asList(1.00F, 2.0F));
        });
    }

    // Exception test case, one of the bags weighs less than 1.01
    @Test
    void throw_illegal_argument_exception_when_element_is_higher_than_3() {
        assertThrows(IllegalArgumentException.class, () -> {
            Solution.efficientJanitor(Arrays.asList(1.01F, 1.99F, 2.5F, 2.5F, 3.01F));
        });
    }
}