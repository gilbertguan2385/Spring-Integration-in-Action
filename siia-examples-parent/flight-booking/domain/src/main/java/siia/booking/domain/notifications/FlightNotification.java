package siia.booking.domain.notifications;

import siia.booking.domain.flight.Flight;
import siia.booking.domain.trip.Trip;
import siia.booking.domain.trip.TripRepository;

import java.util.List;

/**
 * @author Iwein Fuld
 */
public class FlightNotification {
    private final String message;
    private final Flight flight;

    private int priority;

    public FlightNotification(String message, Flight flight) {
        this.message = message;
        this.flight = flight;
    }

    public String getMessage() {
        return message;
    }

    public Flight getFlight() {
        return flight;
    }

    public List<Trip> findRelatedTrips(TripRepository tripRepository) {
        return tripRepository.findTripsRelatedTo(this.flight);
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
}
