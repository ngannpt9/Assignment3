package edu.sjsu.assignment3;

import java.time.LocalDate;

/**
 * A subclass for check a date occur on monthly appointment.
 *
 */
public class MonthlyAppointment extends Appointment{

    /**
     * Constructor take from superclass.
     *
     * @param description the description for monthly appointment.
     * @param startDate the start date for monthly appointment.
     * @param endDate the end date for monthly appointment.
     */
    public MonthlyAppointment(String description, LocalDate startDate, LocalDate endDate) {
        super(description, startDate, endDate);
    }

    /**
     * occursOn method from superclass to check a date occur on
     * monthly appointment or not.
     *
     * @param date other date object.
     * @return the true/false after checking.
     */
    @Override
    public boolean occursOn(LocalDate date) {
        //get day of start date
        LocalDate a = LocalDate.ofEpochDay(startDate.getDayOfMonth());
        //get day of input date
        LocalDate b = LocalDate.ofEpochDay(date.getDayOfMonth());

        return ( !(startDate.isAfter(date) || endDate.isBefore(date))&& a.isEqual(b));
    }
}
