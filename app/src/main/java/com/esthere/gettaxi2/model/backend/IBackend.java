package com.esthere.gettaxi2.model.backend;

import com.esthere.gettaxi2.model.entities.Driver;

import java.util.ArrayList;

public interface IBackend {
    public ArrayList<Driver> getDrivers();
    public void addDriver(Driver driver);
    public Boolean Login(Driver driver);

    public void tryFunc();

    //void addRide(Ride ride);
}
