package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        int result1 = Solution.sumEvenNumbers(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(result1); // Expected answer : 6, head to src/main/test/SolutionTest.java for more UTs

        List<String> result2 = Solution.countStringOccurences(Arrays.asList("totot", "tatata", "titi", "tututu"));
        System.out.println(result2); // Expected answer : [tatata, tututu], head to src/main/test/SolutionTest.java for more UTs

        List<Integer> result3 = Solution.squareNumbers(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(result3); // Expected answer : [1, 4, 9, 16, 25], head to src/main/test/SolutionTest.java for more UTs

        OptionalInt result4 = Solution.maxElement(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(result4.orElse(0)); // Expected answer : 5, head to src/main/test/SolutionTest.java for more UTs

        String result5 = Solution.concatenateStrings1(Arrays.asList("totot", "tatata"));
        System.out.println(result5); // Expected answer : totottatata, head to src/main/test/SolutionTest.java for more UTs

        String result6 = Solution.concatenateStrings2(Arrays.asList("totot", "tatata"));
        System.out.println(result6); // Expected answer : totottatata, head to src/main/test/SolutionTest.java for more UTs

        List<String> result7 = Solution.convertThenSortStrings(Arrays.asList(" totot ", " tatata", "titi ", "tututu"));
        System.out.println(result7); // Expected answer : [TATATA, TITI, TOTOT, TUTUTU], head to src/main/test/SolutionTest.java for more UTs

        OptionalDouble result8 = Solution.findAverage(Arrays.asList(1.33, 2.22, 3.45, 4.2, 5.1));
        System.out.println(result8.orElse(0)); // Expected answer : 3.2600000000000002, head to src/main/test/SolutionTest.java for more UTs

        List<String> result9 = Solution.onlyUniqueWords(Arrays.asList("tata", "tata", "titi", "titi", "tata"));
        System.out.println(result9); // Expected answer : [tata, titi], head to src/main/test/SolutionTest.java for more UTs

        boolean result10 = Solution.checkElements(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(result10); // Expected answer : false, head to src/main/test/SolutionTest.java for more UTs

        boolean result11 = Solution.checkForSpecificElement(Arrays.asList("Xavier", "Hello", "World"));
        System.out.println(result11); // Expected answer : true, head to src/main/test/SolutionTest.java for more UTs

        Optional<String> result12 = Solution.findLongestString(Arrays.asList("tata", "tatat", "tatata", "titi", "toto"));
        System.out.println(result12.orElse(null)); // Expected answer : tatata, head to src/main/test/SolutionTest.java for more UTs

        List<Integer> result13 = Solution.removeNullValues(Arrays.asList(null, 2, null, 4, 5));
        System.out.println(result13); // Expected answer : [2, 4, 5], head to src/main/test/SolutionTest.java for more UTs

        List<Employee> employees = new ArrayList<>();
        Employee employee = new Employee("Person1", "IT", 4000);
        employees.add(employee);
        employee = new Employee("Person2", "Marketing", 3000);
        employees.add(employee);
        employee = new Employee("Person3", "IT", 5000);
        employees.add(employee);
        employee = new Employee("Person4", "IT", 6000);
        employees.add(employee);
        employee = new Employee("Person5", "Marketing", 5000);
        employees.add(employee);
        employee = new Employee("Person6", "Sales", 6000);
        employees.add(employee);
        List<Integer> result14 = Solution.findMaximumSalaryPerDepartment(employees);
        System.out.println(result14); // Expected answer : [6000, 6000, 5000], head to src/main/test/SolutionTest.java for more UTs

        Optional<Integer> result15 = Solution.findSecondSmallestElement(Arrays.asList(2, 10, 4, 5));
        System.out.println(result15.orElse(0)); // Expected answer : 4, head to src/main/test/SolutionTest.java for more UTs

    }

}