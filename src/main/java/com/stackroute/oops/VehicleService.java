package com.stackroute.oops;

public class VehicleService {
    /*
    create a Car object and return it
     */
    public Car createCar(String name,String modelName,String type)
    {
        return new Car(name,modelName,type);
    }
   /*
   create a bike object and return it
    */
    public Bike createBike(String name,String modelName,String type)
    {
        return new Bike(name,modelName,type);
    }
    /*
    Method should compare the speed only if the vehicle is of "SPORTS" type.
    Method should return 0 when speeds are equal otherwise should return maximum vehicle speed.
    Method returns -1 if the type is not "SPORTS"
    */
    public int compareMaxSpeed(Vehicle first,Vehicle second)
    {
        /*
        Downcast the vehicles to their respective concrete types
         */
        Car car=(Car)first;
        Bike bike=(Bike)second;

        if(car.getType().equalsIgnoreCase("sports") && bike.getType().equalsIgnoreCase("sports")){
            int carSpeed=car.maxSpeed("sports");
            int bikeSpeed=bike.maxSpeed("sports");
            return carSpeed>bikeSpeed?car.maxSpeed("sports"):carSpeed<bikeSpeed?bike.maxSpeed("sports"):0;
        }
        else
            return -1;

    }
}
