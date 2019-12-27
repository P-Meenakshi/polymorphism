package com.stackroute.oops.commander.test;

import com.stackroute.oops.Bike;
import com.stackroute.oops.Car;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class VehicleTests {

    private static final String MSG1 = "MaxSpeed not returned properly for given vehicle object";

    private Car car;
    private Bike bike;

    @BeforeEach
    public void setUp() {
        car=new Car("Maruti Suziki","Baleno","sedan");
        bike=new Bike("BMW","S1000RR","sports");
    }

    @Test
    public void givenVehicleWhenCarThenShouldRetuenMaxSpeedOfCar() {
        Assertions.assertEquals(190, car.maxSpeed(car.getType()),MSG1);

    }

    @Test
    public void givenVehicleWhenBikeThenShouldReturnMaxSpeedOfBike() {
        Assertions.assertEquals(300, bike.maxSpeed(bike.getType()),MSG1);

    }
}
