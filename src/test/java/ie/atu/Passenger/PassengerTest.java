package ie.atu.Passenger;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
class PassengerTest {

    private Passenger myPass;

    @Test
    void testConstructorTitle(){
        myPass = new Passenger("Mr","Paul","9276543213",0654321333,20);
        assertEquals("Paul",myPass.getName());
    }

    @Test
    void testConstructorInvalidTitle() {
        final String invalid = "This is not a valid name. Use Mr, Ms or Mrs.";
        Exception exceptionThrown = assertThrows(IllegalArgumentException.class,()-> new Passenger("Miss","Paul","9276543213",673636452,21));
        assertEquals(invalid, exceptionThrown.getMessage());
    }

}
