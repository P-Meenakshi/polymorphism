package com.stackroute.oops.commander.test;

import com.stackroute.oops.AbstractManufacturer;
import com.stackroute.oops.Bike;
import com.stackroute.oops.Car;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



public class AbstractManufacturerTests {
    private static String MSG1="AbstractManufacturer should have name property";
    private static String MSG2="AbstractManufacturer should have modelName property";
    private static String MSG3="AbstractManufacturer should have type property";

    private AbstractManufacturer car;
    private AbstractManufacturer bike;

    @BeforeEach
    public void setUp()
    {
     car=new Car("Maruti Suziki","Baleno","sedan");
     bike=new Bike("BMW","S1000RR","sports");
    }
    @Test
    public void givenAbstractManufacturerObjectWhenCarThenShouldSetName() {
        Assertions.assertEquals("Maruti Suziki",car.getName(), MSG1);
    }
    @Test
    public void givenAbstractManufacturerObjectWhenCarThenShouldSetModelName() {
        Assertions.assertEquals("Baleno",car.getModelName(), MSG2);
    }
    @Test
    public void givenAbstractManufacturerObjectWhenCarThenShouldSetType() {
        Assertions.assertEquals("sedan",car.getType(), MSG3);
    }

    @Test
    public void givenAbstractManufacturerObjectWhenBikeThenShouldSetNamee() {
        Assertions.assertEquals("BMW",bike.getName(), MSG1);
    }
    @Test
    public void givenAbstractManufacturerObjectWhenBikeThenShouldSetModelName() {
        Assertions.assertEquals("S1000RR", bike.getModelName(), MSG2);
    }
    @Test
    public void givenAbstractManufacturerObjectWhenBikeThenShouldSetType() {
        Assertions.assertEquals("sports",bike.getType(), MSG3);
    }


}
