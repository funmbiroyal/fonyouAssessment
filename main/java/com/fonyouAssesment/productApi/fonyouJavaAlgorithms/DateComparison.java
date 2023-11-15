package com.fonyouAssesment.productApi.fonyouJavaAlgorithms;

import java.time.LocalDate;

public class DateComparison {
    public static LocalDate compareDates(LocalDate date1, LocalDate date2) {
        return date1.isAfter(date2) ? date1 : date2;
    }

    public static void main(String[] args) {
        LocalDate firstDate = LocalDate.of(2025, 1, 1);
        LocalDate secondDate = LocalDate.of(2023, 6, 1);

        LocalDate result = compareDates(firstDate, secondDate);

        System.out.println("The later date is: " + result);
    }
}

