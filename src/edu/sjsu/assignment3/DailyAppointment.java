package edu.sjsu.assignment3;

import java.time.LocalDate;

/**
 * A subclass for check a date occur on daily appointment.
 *
 */
public class DailyAppointment extends Appointment{

    /**
     * Constructor take from superclass.
     *
     * @param description the description for daily appointment.
     * @param startDate the start date for daily appointment.
     * @param endDate the end date for daily appointment.
     */
    public DailyAppointment(String description, LocalDate startDate, LocalDate endDate) {
        super(description, startDate, endDate);
    }

    /**
     * occursOn method from superclass to check a date occur on
     * daily appointment or not.
     * @param date other date object
     * @return the false/true after checking.
     */
    @Override
    public boolean occursOn(LocalDate date) {

        return  (startDate.isBefore(date) && endDate.isAfter(date));
    }
}
