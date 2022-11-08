package com.stackroute.oops;

/*
Class is having 3 fields name, modelName and type.
Type varies for different vehicles.
eg. Car is of type sedan, sports...
Bike is of type cruiser, sports...
 */
public abstract class AbstractManufacturer {
    protected String modelName;
    protected String type;
    protected String name;

    public AbstractManufacturer(String name, String modelName,String type) {
        this.name =name;
        this.modelName=modelName;
        this.type=type;
    }

    public AbstractManufacturer() {
    }

    public String getModelName() {
        return modelName;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public abstract String getManufacturerInformation();
}
