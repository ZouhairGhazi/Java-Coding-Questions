package org.example;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class Solution {

    /**
     * returns the sum of all even numbers in a list of integers
     *
     * @param nums a list of Integers
     * @return int
     */
    public static int sumEvenNumbers(List<Integer> nums) {
        return nums.stream()
                .filter(x -> x % 2 == 0)
                .mapToInt(x -> x)
                .sum();
    }

    /**
     * returns any string whose length is greater than 5
     *
     * @param stringList a list of Strings
     * @return List<String>
     */
    public static List<String> countStringOccurences(List<String> stringList) {
        return stringList.stream()
                .filter(x -> x.length() > 5)
                .collect(Collectors.toList());
    }

    /**
     * returns a list containing the square of every element
     *
     * @param nums a list of Integers
     * @return List<Integer>
     */
    public static List<Integer> squareNumbers(List<Integer> nums) {
        return nums.stream()
                .map(x -> x * x)
                .toList();
    }

    /**
     * returns the maximum element of a list
     *
     * @param nums a list of Integers
     * @return OptionalInt
     */
    public static OptionalInt maxElement(List<Integer> nums) {
        return nums.stream()
                .mapToInt(x -> x)
                .max();
    }

    /**
     * returns the minimum element of a list
     *
     * @param nums a list of Integers
     * @return OptionalInt
     */
    public static OptionalInt minElement(List<Integer> nums) {
        return nums.stream()
                .mapToInt(x -> x)
                .min();
    }

    /**
     * returns the concatenated string out of all elements of a List<String>
     *
     * @param stringList a list of Strings
     * @return String
     * @version 1.0
     */
    public static String concatenateStrings1(List<String> stringList) {
        return stringList.stream()
                .collect(Collectors.joining()); // Can also be done easier using : String.join("", stringList);
    }

    /**
     * returns the concatenated string out of all elements of a List<String>
     *
     * @param stringList a list of Strings
     * @return String
     * @version 2.0
     */
    public static String concatenateStrings2(List<String> stringList) {
        return stringList.stream()
                .reduce("", String::concat);
    }

    /**
     * returns a sorted list containing every element trimmed
     *
     * @param stringList a list of Strings
     * @return List<String>
     */
    public static List<String> convertThenSortStrings(List<String> stringList) {
        return stringList.stream()
                .map(x -> x.toUpperCase().trim())
                .sorted()
                .collect(Collectors.toList());
    }

    /**
     * returns the average of a list of doubles
     *
     * @param nums a list of Doubles
     * @return OptionalDouble
     */
    public static OptionalDouble findAverage(List<Double> nums) {
        return nums.stream()
                .mapToDouble(x -> x)
                .average();
    }

    /**
     * returns the list without duplicates
     *
     * @param stringList a list of Strings
     * @return List<String>
     */
    public static List<String> onlyUniqueWords(List<String> stringList) {
        return stringList.stream()
                .distinct()
                .toList();
    }

    /**
     * returns true if all elements in the list are greater than 2, false otherwise
     *
     * @param nums a list of Integers
     * @return boolean
     */
    public static boolean checkElements(List<Integer> nums) {
        return nums.stream()
                .allMatch(x -> x > 2);
    }

    /**
     * returns true if an element starts with x or X, false otherwise
     *
     * @param stringList a list of Strings
     * @return boolean
     */
    public static boolean checkForSpecificElement(List<String> stringList) {
        return stringList.stream()
                .anyMatch(x -> x.toUpperCase().charAt(0) == 'X');
    }

    /**
     * returns the longest String in a list of Strings
     *
     * @param stringList a list of Strings
     * @return Optional<String>
     */
    public static Optional<String> findLongestString(List<String> stringList) {
        return stringList.stream()
                .max(Comparator.comparingInt(String::length));
    }

    /**
     * returns only the non null elements
     *
     * @param nums a list of Integers
     * @return List<Integer>
     */
    public static List<Integer> removeNullValues(List<Integer> nums) {
        return nums.stream()
                .filter(Objects::nonNull)
                .toList();
    }

    /**
     * returns a list of highest salaries per department, based on the Employee class
     *
     * @param employees a list of Employees
     * @return List<Integer>
     */
    public static List<Integer> findMaximumSalaryPerDepartment(List<Employee> employees) {
        return employees.stream()
                .collect(groupingBy(Employee::getDepartment, mapping(Employee::getSalary,
                        maxBy(Comparator.naturalOrder()))))
                .values().stream().map(maxSalary -> maxSalary.orElse(null)).toList();
    }

    /**
     * returns the second smallest element in a list
     *
     * @param nums a list of Integers
     * @return OptionalInt
     */
    public static Optional<Integer> findSecondSmallestElement(List<Integer> nums) {
        return nums.stream()
                .sorted()
                .skip(1)
                .findFirst();
    }

    /**
     * returns the intersection between 2 List<Integer>
     *
     * @param nums1, nums2 lists of Integers
     * @return List<Integer>
     */
    public static List<Integer> findIntersection(List<Integer> nums1, List<Integer> nums2) {
        return nums1.stream()
                .filter(nums2::contains)
                .toList();
    }

    /**
     * returns the list of strings that contains the letter A
     *
     * @param stringList a list of Strings
     * @return List<String>
     */
    public static List<String> checkForElementsContainingA(List<String> stringList) {
        return stringList.stream()
                .filter(x -> x.contains("A"))
                .toList();
    }

    public static int getSumMatrix(int[][] matrix) {
        return Arrays.stream(matrix)
                .flatMapToInt(Arrays::stream)
                .sum();
    }
}
