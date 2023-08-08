package com.techzenure.day4;

public class AverageAge {
    public static void main(String[] args) {
        int[] ages = {30, 32, 35}; 
        double averageAge = calculateAverage(ages);
        System.out.println("Average age of employees: " + averageAge);
    }

    public static double calculateAverage(int[] age) {
        int totalEmployees = age.length;
        if (totalEmployees < 2) {
            System.out.println("Enter a valid employee count.");
            return 0.0;
        }

        int sumOfAges = 0;
        for (int i = 0; i < totalEmployees; i++) {
            if (age[i] < 28 || age[i] > 40) {
                System.out.println("Invalid age encountered!");
                return 0.0;
            }
            sumOfAges += age[i];
        }

        return (double) sumOfAges / totalEmployees;
    }
}


