package com.stackroute.oops;

public class Bike extends AbstractManufacturer implements  Vehicle{
    public Bike(String name,String modelName,String bikeType){
        this.type=bikeType;
        this.name=name;
        this.modelName=modelName;
    }
    /*
   Method returns maximum speed depending upon their types
   For Sports-300kmh
   For cruiser-170kmh
    */
    @Override
    public int maxSpeed(String bikeType) {
        if(bikeType.equalsIgnoreCase("sports"))
            return 300;
        else if(bikeType.equalsIgnoreCase("cruiser"))
            return 170;
        else return 0;
    }

    /*
    should return ih the format : Bike{Manufacturer name:'name',Model Name:'modelName',Type:'type'}
     */
    @Override
    public String getManufacturerInformation() {
        return "Bike{Manufacturer name:" + name + ",Model Name:" + modelName+",Type:" + type +"}";
    }
}
