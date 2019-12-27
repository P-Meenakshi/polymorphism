package com.stackroute.oops.commander.test;

import com.stackroute.oops.AbstractManufacturer;
import com.stackroute.oops.Car;
import com.stackroute.oops.Vehicle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CarTests {

    private static final String MSG1 = "Car object should be of type AbstractManufacturer and Vehicle";
    private static final String MSG2 = "Car properties not set properly by constructor";
    private static final String MSG3 = "Returned value of MaxSpeed is not correct";
    private static final String MSG4 = "Manufacturer details displayed is not correct";

    private Car car;

    @BeforeEach
    public void setUp() {
        car = new Car("Maruti Suziki", "Baleno", "sedan");
    }
    @Test
    public void giveCarClassThenShouldBeOfVehicleType() {
        Assertions.assertTrue(Vehicle.class.isAssignableFrom(Car.class), MSG1);
    }
    @Test
    public void giveCarClassThenShouldBeOfManufacturerType() {
        Assertions.assertTrue(AbstractManufacturer.class.isAssignableFrom(Car.class), MSG1);
    }
    @Test
    public void givenCarObjectThenPropertiesAreSet(){
        Assertions.assertEquals(car.getName(), "Maruti Suziki", MSG2);
        Assertions.assertEquals(car.getModelName(), "Baleno", MSG2);
        Assertions.assertEquals(car.getType(), "sedan", MSG2);
    }
    @Test
    public void givenCarObjectThenGetMaxSpeed(){
        Assertions.assertEquals(190,car.maxSpeed(car.getType()),MSG3);
    }
    @Test
    public void givenCarObjectThenGetManufacturerInformation(){
        String expected="Car{Manufacturer Name:Maruti Suziki,Model Name:Baleno,Type:sedan}";
        Assertions.assertEquals(car.getManufacturerInformation().toLowerCase(),expected.toLowerCase(),MSG4);
    }

}
