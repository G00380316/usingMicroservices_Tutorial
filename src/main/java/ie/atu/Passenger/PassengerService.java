package ie.atu.Passenger;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PassengerService {

    public List<Passenger> getPassengers()
    {
        List<Passenger> myPassengers = List.of(
                new Passenger("Mr", "Enoch", "123", 21, 23),
                new Passenger("Mr", "Enoch", "6723", 244L, 93),
                new Passenger("Mr", "Enoch", "144", 5562L, 53));
        return myPassengers;
    }

    public Passenger getMyPassenger( String passengerID) {
        Passenger myPassenger = new Passenger("Mr","Enoch","123",123,20);
        return myPassenger;
    }
}
