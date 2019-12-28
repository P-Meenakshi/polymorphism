package com.stackroute.oops;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BikeTests {
    private static final String MSG1 = "Bike object should be of type AbstractManufacturer and Vehicle";
    private static final String MSG2 = "Bike properties not set properly by constructor";
    private static final String MSG3 = "Returned value of MaxSpeed is not correct";
    private static final String MSG4 = "Manufacturer details displayed is not correct";

    private Bike bike;

    @BeforeEach
    public void setUp() {
        bike = new Bike("BMW","S1000RR", "sports");
    }
    @Test
    public void giveBikeClassThenShouldBeOfVehicleType() {
        Assertions.assertTrue(Vehicle.class.isAssignableFrom(Bike.class), MSG1);
    }

    @Test
    public void givenCarObjectThenPropertiesAreSet(){
        Assertions.assertEquals(bike.getName(), "BMW", MSG2);
        Assertions.assertEquals(bike.getModelName(), "S1000RR", MSG2);
        Assertions.assertEquals(bike.getType(), "sports", MSG2);
    }
    @Test
    public void givenCarObjectThenGetMaxSpeed(){
        Assertions.assertEquals(300,bike.maxSpeed(bike.getType()),MSG3);
    }
    @Test
    public void givenCarObjectThenGetManufacturerInformation(){
        String expected="Bike{Manufacturer Name:BMW,Model Name:S1000RR,Type:sports}";
        Assertions.assertEquals(bike.getManufacturerInformation().toLowerCase(),expected.toLowerCase(),MSG4);
    }

}
