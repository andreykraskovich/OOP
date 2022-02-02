import com.skillbox.airport.Airport;
import com.skillbox.airport.Flight;
import com.skillbox.airport.Terminal;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

    }

    public static List<Flight> findPlanesLeavingInTheNextTwoHours(Airport airport) {
        //TODO Метод должден вернуть список рейсов вылетающих в ближайшие два часа.
        List<Flight> nextTwoHoursFlight;
        Calendar c = Calendar.getInstance();
        Calendar c1 = Calendar.getInstance();
        c1.add(Calendar.HOUR,2);
        nextTwoHoursFlight = airport.getTerminals().stream().flatMap(terminal -> terminal.getFlights().stream())
                .filter(flight -> flight.getType() == Flight.Type.DEPARTURE &&
                        flight.getDate().after(c.getTime()) && flight.getDate().before(c1.getTime()))
                .collect(Collectors.toList());
        return nextTwoHoursFlight;
    }

}