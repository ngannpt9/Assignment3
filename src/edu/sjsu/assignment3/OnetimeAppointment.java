package edu.sjsu.assignment3;

import java.time.LocalDate;

/**
 * A subclass for check a date occur on one time appointment.
 *
 */
public class OnetimeAppointment extends Appointment{

    /**
     * Constructor take from superclass.
     *
     * @param description the description of one time appointment.
     * @param startDate the start date of one time appointment.
     */
    public OnetimeAppointment(String description, LocalDate startDate) {
        super(description, startDate, startDate);
    }

    /**
     * occursOn method from superclass to check a date occur on
     * one time appointment or not.
     * @param date other date object
     * @return the true/false after checking.
     */
    @Override
    public boolean occursOn(LocalDate date) {
        return startDate.isEqual(date);
    }
}
