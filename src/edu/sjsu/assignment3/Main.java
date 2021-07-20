package edu.sjsu.assignment3;

import java.time.LocalDate;

/**
 * A driver class for appointmnent class.
 *
 */
public class Main {
    public static void main(String[] args) {

        LocalDate startDate = LocalDate.parse("2021-06-01");
        LocalDate endDate = LocalDate.parse("2021-08-05");

        LocalDate testDate1 = LocalDate.parse("2021-06-05");
        LocalDate testDate2 = LocalDate.parse("2021-07-01");
        LocalDate testDate3 = LocalDate.parse("2021-08-15");

//        Appointment appointment = new OnetimeAppointment("Class starts", startDate);
          Appointment appointment = new DailyAppointment("Class", startDate, endDate);
//        Appointment appointment = new MonthlyAppointment("Meeting", startDate, endDate);
        boolean a1 = appointment.occursOn(testDate1);
        System.out.println(a1);
        boolean a2 = appointment.occursOn(testDate2);
        System.out.println(a2);
        boolean a3 = appointment.occursOn(testDate3);
        System.out.println(a3);


//        LocalDate date = LocalDate.parse("2021-08-01");
//        Appointment a1 = new OnetimeAppointment("Class starts", startDate);
//        Appointment a2 = new OnetimeAppointment("Class ends", endDate);
//        Appointment a3 = new DailyAppointment("Class", startDate, endDate);
//        Appointment a4 = new MonthlyAppointment("Code meeting", startDate, date);
//        Appointment a5 = new MonthlyAppointment("Assignment", startDate, endDate);
//        Appointment[] appointment = {a1, a2, a3, a4, a5};
//        Arrays.sort(appointment);
//        System.out.println("Comparable: " + Arrays.toString(appointment));
//        Arrays.sort(appointment, new DesComparator());
//        System.out.println("Comparator: " + Arrays.toString(appointment));
    }
}
