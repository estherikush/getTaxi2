package com.esthere.gettaxi2.model.datasource;

import com.esthere.gettaxi2.model.backend.IBackend;
import com.esthere.gettaxi2.model.entities.Driver;

import java.util.ArrayList;

public class Firebase implements IBackend {
   // static FirebaseDatabase database = FirebaseDatabase.getInstance();
    //DatabaseReference myRef = database.getReference("message");


    public void tryFunc(){
       // myRef.setValue("Good Night");
    }
    @Override
    //TODO: Replace this with your own logic
    public ArrayList<Driver> getDrivers() {
        return null;
    }

    @Override
    public void addDriver(Driver driver) {

        Driver driver1 =new Driver();
        driver1.setFirstName(driver.getFirstName());
        driver1.setLastName(driver.getLastName());
        driver1.setId(driver.getId());
        driver1.setPhone(driver.getPhone());
        driver1.setEmail(driver.getEmail());
        driver1.setCreditCard(driver.getCreditCard());
        driver1.setPassword(driver.getPassword());

        //DatabaseReference newRef = myRef.push();
        ////DatabaseReference newRef = myRef.child("ride").push();
        //newRef.setValue(driver1);
    }

    //TODO: Replace this with your own logic
    @Override
    public Boolean Login(Driver driver) {
        //return null;
        return (driver.getEmail().equals("a@gmail.com") && driver.getPassword().equals("123456789"));
    }
}
