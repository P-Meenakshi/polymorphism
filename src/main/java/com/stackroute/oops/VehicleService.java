package com.stackroute.oops;

public class VehicleService {
    /*
    create a Car object and return it
     */
    public Car createCar(String name, String modelName, String type) {
        return new Car(name,modelName,type);
    }

    /*
    create a bike object and return it
     */
    public Bike createBike(String name, String modelName, String type) {
        return new Bike(name,modelName,type);
    }

    /*
    Method should compare the speed only if the vehicle is of "SPORTS" type.
    Method should return 0 when speeds are equal otherwise should return maximum vehicle speed.
    Method returns -1 if the type is not "SPORTS"
    */
    public int compareMaxSpeed(Vehicle first, Vehicle second) {
        /*
        Vehicle objects should be down cast to their respective concrete types
        */
        Car c1;Bike b1;String str = "sports";
        if(first  instanceof Car && second instanceof Bike)
        {
            c1=(Car)first;
            b1=(Bike)second;
            if(c1.getType().equals(str)&& b1.getType().equals(str))
            {
                if (c1.maxSpeed(str)==b1.maxSpeed(str))
                    return 0;
                else
                    return Math.max(c1.maxSpeed(str),b1.maxSpeed(str));
            }
        }
        return  -1;
}
}

