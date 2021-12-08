import com.skillbox.airport.Aircraft;
import com.skillbox.airport.Airport;

public class Main
{
    public static void main(String[] args) {
        Airport airport = Airport.getInstance();
        airport.getAllAircrafts();
        System.out.println("\nAircraft list" + airport.getAllAircrafts());
        System.out.println("Aircraft amount : " + airport.getAllAircrafts().size());
    }
}
