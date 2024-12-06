package org.example;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class Solution {

    /**
     * returns all the city names of the companies in the list
     *
     * @param companyList a list of Companies
     * @return List<String>
     */
    public List<String> getCityNames(List<Company> companyList) {
        return companyList.stream()
                .map(company -> company.getAddress().getCity().getName())
                .toList();
    }

    /**
     * returns all the city names of the companies in the list that are not null
     *
     * @param companyList a list of Companies
     * @return List<String>
     */
    public List<String> getCityNamesWithNullCheck(List<Company> companyList) {
        return companyList.stream()
                .filter(Objects::nonNull)
                .map(company -> company.getAddress().getCity().getName())
                .toList();
    }

    /**
     * returns all the persons in a list from all companies.
     *
     * @param companyList a list of Companies
     * @return List<Person>
     */
    public List<Person> getAllPerson(List<Company> companyList) {
        return companyList.stream()
                .map(Company::getPersonList)
                .flatMap(List::stream)
                .toList();
    }

    /**
     * returns a collection mapping every city to the all the corresponding companies
     *
     * @param companyList a list of Companies
     * @return Map<City,List<Company>>
     */
    public Map<City,List<Company>> getCompaniesByCity(List<Company> companyList) {
        return companyList.stream()
                .collect(Collectors.groupingBy(company -> company.getAddress().getCity()));
    }

    /**
     * returns true if there is a company from companyList in the given city
     *
     * @param companyList a list of Companies
     * @return boolean
     */
    public boolean hasCompanyInCity(List<Company> companyList, String cityName) {
        return companyList.stream()
                .anyMatch(company -> company.getAddress().getCity().getName().equals(cityName));
    }

    public List<String> getCityNamesLogs(List<Company> companyList) {
        return companyList.stream()
                .map(company -> "The city name is : " + company.getAddress().getCity().getName())
                .distinct()
                .toList();
    }

}
