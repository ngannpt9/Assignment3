package edu.sjsu.assignment3;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.time.LocalDate;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppointmentTest {
    @Test
    public void testOccursOn()  {

        PrintStream original = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        OnetimeAppointment.occursOn(LocalDate.parse("2021-06-05"));
        assertEquals(false, outputStream.toString().trim());
        System.setOut(original);
    }

    @Test
    public void testCompareTo() {
        PrintStream original = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        LocalDate startDate = LocalDate.parse("2021-06-01");
        LocalDate endDate = LocalDate.parse("2021-08-05");
        LocalDate date = LocalDate.parse("2021-08-01");
        Appointment a1 = new OnetimeAppointment("Class starts", startDate);
        Appointment a2 = new OnetimeAppointment("Class ends", endDate);
        Appointment a3 = new DailyAppointment("Class", startDate, endDate);
        Appointment a4 = new MonthlyAppointment("Code meeting", startDate, date);
        Appointment a5 = new MonthlyAppointment("Assignment", startDate, endDate);
        Appointment[] appointment = {a1, a2, a3, a4, a5};
        Arrays.sort(appointment);
        assertEquals("[Class starts from 2021-06-01 to 2021-06-01, Code meeting from 2021-06-01 to 2021-08-01, Assignment from 2021-06-01 to 2021-08-05, Class from 2021-06-01 to 2021-08-05, Class ends from 2021-08-05 to 2021-08-05]", outputStream.toString().trim());
        System.setOut(original);

    }


}