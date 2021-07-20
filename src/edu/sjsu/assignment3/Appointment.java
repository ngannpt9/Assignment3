package edu.sjsu.assignment3;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;

/**
 * A superclass for check a date occur one time, daily, or monthly appointment.
 * It also compare to make a list of appointment by description, start date, or end date.
 *
 * @author Ngan Nguyen
 */
public abstract class Appointment implements Comparable<Appointment> {
    String description;
    LocalDate startDate;
    LocalDate endDate;

    /**
     * Constructor for Appointment class.
     *
     * @param description the description of appointment.
     * @param startDate the start date of appointment.
     * @param endDate the end date of appointment.
     */
    public Appointment(String description, LocalDate startDate, LocalDate endDate) {
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    /**
     * Getter for the description that constructs the appointment.
     *
     * @return the description that constructs the appointment.
     */
    public String getDescription() { return description; }

    /**
     * Getter for the start date that constructs the appointment.
     *
     * @return the start date that constructs the appointment.
     */
    public LocalDate getStartDate() { return startDate; }

    /**
     * Getter for the end date that constructs the appointment.
     *
     * @return the end date that constructs the appointment.
     */
    public LocalDate getEndDate() { return endDate; }

    /**
     * Check if the input occurs on a date.
     *
     * @param date other date object
     * @return the resulting occur date
     */
    public abstract boolean occursOn(LocalDate date);

    /**
     * Give the description for the comparable and comparator method.
     *
     * @return the description, start date, and end date
     */
    public String toString() {
        return description + " from " + startDate + " to " + endDate;
    }

    /**
     * Comparable method for appointment class to compare start date,
     * then end date, then description.
     * @param o the object to compare
     * @return the resulting of compare
     */
    @Override
    public int compareTo(Appointment o) {
        //Compare the start date first
        if (startDate != o.startDate) {
            return ChronoLocalDate.timeLineOrder().compare(startDate, o.startDate);
        }
        //Then compare the end date
        else if (endDate != o.endDate) {
            return ChronoLocalDate.timeLineOrder().compare(endDate, o.endDate);
        }
        //Finally compare the description
        else return description.compareTo(o.description);
    }
}
