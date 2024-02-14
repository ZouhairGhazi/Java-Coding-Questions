package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Nested
    class SumEvenNumbersTests {

        // Standard test case, some even elements in the list, expected sum is 18
        @Test
        void compute_sum_when_some_elements_are_even() {
            assertEquals(18, Solution.sumEvenNumbers(Arrays.asList(1, 3, 4, 9, 14, 21)));
        }

        // Standard test case, no even elements in the list, expected sum is 0
        @Test
        void compute_sum_when_all_elements_are_odd() {
            assertEquals(0, Solution.sumEvenNumbers(Arrays.asList(1, 3, 5, 9, 13)));
        }
    }

    @Nested
    class CountStringOccurencesTests {

        // Standard test case, some elements in the list have lengths greater than 5
        @Test
        void count_occurences_when_some_strings_are_viable() {
            List<String> answer = Arrays.asList("tatata", "tututu"); // Expected answer
            assertEquals(answer, Solution.countStringOccurences(Arrays.asList("totot", "tatata", "titi", "tututu")));
        }

        // Standard test case, no element has a length greater than 5
        @Test
        void count_occurences_when_no_string_is_viable() {
            List<String> answer = new ArrayList<>(); // Expected answer
            assertEquals(answer, Solution.countStringOccurences(Arrays.asList("totot", "titi", "tuutu")));
        }
    }

    @Nested
    class SquareNumbersTests {

        // Standard test case, a list of integers
        @Test
        void square_numbers_full_list() {
            List<Integer> answer = Arrays.asList(4, 9, 25); // Expected answer
            assertEquals(answer, Solution.squareNumbers(Arrays.asList(-2, 3, 5)));
        }

        // Standard test case, an empty list of integers
        @Test
        void square_numbers_empty_list() {
            List<Integer> answer = new ArrayList<>(); // Expected answer
            assertEquals(answer, Solution.squareNumbers(List.of()));
        }
    }

    @Nested
    class MaxElementTests {

        // Standard test case, one maximum in the list
        @Test
        void find_unique_maximum() {
            OptionalInt answer = OptionalInt.of(25); // Expected answer
            assertEquals(answer, Solution.maxElement(Arrays.asList(10, 2, 25, 4)));
        }

        // Standard test case, multiple maximums in the list
        @Test
        void find_one_maximum() {
            OptionalInt answer = OptionalInt.of(25); // Expected answer
            assertEquals(answer, Solution.maxElement(Arrays.asList(25, 2, 25, 4, 10)));
        }
    }

    @Nested
    class MinElementTests {

        // Standard test case, one minimum in the list
        @Test
        void find_unique_minimum() {
            OptionalInt answer = OptionalInt.of(4); // Expected answer
            assertEquals(answer, Solution.minElement(Arrays.asList(10, 20, 25, 4)));
        }

        // Standard test case, multiple minimums in the list
        @Test
        void find_one_minimum() {
            OptionalInt answer = OptionalInt.of(2); // Expected answer
            assertEquals(answer, Solution.minElement(Arrays.asList(25, 2, 25, 2, 10)));
        }
    }

    @Nested
    class ConcatenateStrings1Tests {

        // Standard test case, full list of Strings
        @Test
        void concatenate_full_list() {
            assertEquals("HelloWorldVersion1.0", Solution.concatenateStrings1(Arrays.asList("Hello", "World", "Version1.0")));
        }

        // Standard test case, empty list of Strings
        @Test
        void concatenate_empty_list() {
            assertEquals("", Solution.concatenateStrings1(List.of()));
        }
    }

    @Nested
    class ConcatenateStrings2Tests {

        // Standard test case, full list of Strings
        @Test
        void concatenate_full_list() {
            assertEquals("HelloWorldVersion1.0", Solution.concatenateStrings2(Arrays.asList("Hello", "World", "Version1.0")));
        }

        // Standard test case, empty list of Strings
        @Test
        void concatenate_empty_list() {
            assertEquals("", Solution.concatenateStrings2(List.of()));
        }
    }

    @Nested
    class ConvertThenSortStringsTests {

        // Standard test case, sorted, few whitespaces
        @Test
        void concatenate_standard_list() {
            List<String> answer = Arrays.asList("HELLO", "HOW ARE YOU ?", "WORLD"); // Expected answer
            assertEquals(answer, Solution.convertThenSortStrings(Arrays.asList(" Hello", "How are you ? ", "WORLD")));
        }

        // Advanced test case, not sorted, many whitespaces
        @Test
        void concatenate_advanced_list() {
            List<String> answer = Arrays.asList("HELLO", "HOW ARE YOU ?", "WORLD"); // Expected answer
            assertEquals(answer, Solution.convertThenSortStrings(Arrays.asList(" Hello", " World ", " How are you ? ")));
        }
    }

    @Nested
    class FindAverageTests {

        // Standard test case, computing average
        @Test
        void compute_average() {
            OptionalDouble answer = OptionalDouble.of(6.8); // Expected answer
            assertEquals(answer, Solution.findAverage(Arrays.asList(25.2, 2.5, 2.1, 3.2, 1.0)));
        }
    }

    @Nested
    class OnlyUniqueWordsTests {

        // Standard test case, already no duplicates
        @Test
        void remove_duplicates_when_none_exist() {
            List<String> answer = Arrays.asList("TATA", "TITI", "TUTU"); // Expected answer
            assertEquals(answer, Solution.onlyUniqueWords(Arrays.asList("TATA", "TITI", "TUTU")));
        }

        // Standard test case, some duplicates
        @Test
        void remove_duplicates_when_some_exist() {
            List<String> answer = Arrays.asList("TATA", "TITI"); // Expected answer
            assertEquals(answer, Solution.onlyUniqueWords(Arrays.asList("TATA", "TITI", "TATA")));
        }
    }

    @Nested
    class CheckElementsTests {

        // Standard test case, true expected
        @Test
        void check_elements_when_all_greater_than_2() {
            assertTrue(Solution.checkElements(Arrays.asList(25, 3, 25, 20, 10)));
        }

        // Standard test case, false expected
        @Test
        void check_elements_when_some_lesser_than_2() {
            assertFalse(Solution.checkElements(Arrays.asList(2, 1, 25, 20, 10)));
        }
    }

    @Nested
    class CheckForSpecificElementTests {

        // Standard test case, true expected
        @Test
        void check_for_element_when_x_lowercase() {
            assertTrue(Solution.checkForSpecificElement(Arrays.asList("xello", "world")));
        }

        // Standard test case, true expected
        @Test
        void check_for_element_when_x_uppercase() {
            assertTrue(Solution.checkForSpecificElement(Arrays.asList("Xello", "world")));
        }

        // Standard test case, false expected
        @Test
        void check_for_element_when_none_exist() {
            assertFalse(Solution.checkForSpecificElement(Arrays.asList("Hello", "world")));
        }
    }

    @Nested
    class RemoveNullValuesTests {

        // Standard test case, a full list of integers with no nulls
        @Test
        void remove_null_values_when_there_are_none() {
            List<Integer> answer = Arrays.asList(4, 9, 25); // Expected answer
            assertEquals(answer, Solution.removeNullValues(Arrays.asList(4, 9, 25)));
        }

        // Standard test case, a full list of integers with no nulls
        @Test
        void remove_null_values_when_there_are_some() {
            List<Integer> answer = Arrays.asList(4, 9, 25); // Expected answer
            assertEquals(answer, Solution.removeNullValues(Arrays.asList(4, null, 9, 25, null)));
        }
    }

    @Nested
    class FindMaximumSalaryPerDepartmentTests {

        // Standard test case, 2 employees 1 department
        @Test
        void find_maximum_salary_in_one_department() {
            List<Employee> employees = new ArrayList<>();
            Employee employee = new Employee("Person1", "IT", 4000);
            employees.add(employee);
            employee = new Employee("Person2", "IT", 3000);
            employees.add(employee);
            List<Integer> answer = List.of(4000); // Expected answer
            assertEquals(answer, Solution.findMaximumSalaryPerDepartment(employees));
        }

        // Advanced test case, many employees many departments
        @Test
        void find_maximum_salary_in_multiple_departments() {
            List<Employee> employees = new ArrayList<>();
            Employee employee = new Employee("Person1", "IT", 4000);
            employees.add(employee);
            employee = new Employee("Person2", "IT", 3000);
            employees.add(employee);
            employee = new Employee("Person3", "Marketing", 3000);
            employees.add(employee);
            employee = new Employee("Person2", "IT", 7000);
            employees.add(employee);
            List<Integer> answer = List.of(7000, 3000); // Expected answer
            assertEquals(answer, Solution.findMaximumSalaryPerDepartment(employees));
        }
    }

    @Nested
    class findSecondSmallestElement1 {

        // Standard test case, unique elements
        @Test
        void find_second_smallest_element1_unique() {
            Optional<Integer> answer = Optional.of(2); // Expected answer
            assertEquals(answer, Solution.findSecondSmallestElement(Arrays.asList(1, 2, 3, 4, 5)));
        }

        // Standard test case, multiple minimums
        @Test
        void find_second_smallest_element1_many() {
            Optional<Integer> answer = Optional.of(1); // Expected answer
            assertEquals(answer, Solution.findSecondSmallestElement(Arrays.asList(1, 1, 3, 4, 5)));
        }
    }
}