/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acc1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 *
 * @author cacousins
 */
public class TestDate {

    public static void main(String[] args) {
        LocalDate myObj = LocalDate.now(); // Create a date object
        System.out.println(myObj); // Display the current date             
        System.out.println(myObj.plusDays(5));

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
        System.out.println(ldt.format(DateTimeFormatter.ISO_DATE));

        Date myDate = new Date();
        
        System.out.println(myDate);
        
        LocalDate from = LocalDate.of(2020, 5, 4);
        LocalDate to = LocalDate.of(2020, 10, 10);

        Period period = Period.between(from, to);

        System.out.print(period.getYears() + " years,");
        System.out.print(period.getMonths() + " months,");
        System.out.print(period.getDays() + " days");

    }

}
