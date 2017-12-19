package com.cognizant.test;

import com.cognizant.main.CarRental;
import org.junit.Assert;
import org.junit.Test;

public class CarRentalTest {

    @Test
    public void carRentalWithoutAcDieselTest(){
        CarRental car = new CarRental();
        double distance = car.calculateTotalTripExpense("CAR","Swift Dzire", false,false,"Pune","Mumbai");
        Assert.assertEquals(1600,distance,0.00);
    }

    @Test
    public void carRentalWithoutAcDieselExtraPassangersTest(){
        CarRental car = new CarRental();
        double distance = car.calculateTotalTripExpense("CAR","Swift Dzire", false,false,"Pune","Mumbai",7);
        Assert.assertEquals(2200,distance,0.00);
    }

    @Test
    public void carRentalWithoutAcPetrolTest(){
        CarRental car = new CarRental();
        double distance = car.calculateTotalTripExpense("CAR","Swift Dzire", false,true,"Pune","Mumbai");
        Assert.assertEquals(1800,distance,0.00);
    }

    @Test
    public void carRentalWithAcDieselTest(){
        CarRental car = new CarRental();
        double distance = car.calculateTotalTripExpense("CAR","Swift Dzire", true,false,"Pune","Mumbai");
        Assert.assertEquals(2000,distance,0.00);
    }

    @Test
    public void carRentalWithAcPetrolTest(){
        CarRental car = new CarRental();
        double distance = car.calculateTotalTripExpense("CAR","Swift Dzire", true,true,"Pune","Mumbai");
        Assert.assertEquals(2200,distance,0.00);
    }

    @Test
    public void busRentalWithoutAcDieselTest(){
        CarRental car = new CarRental();
        double distance = car.calculateTotalTripExpense("BUS","Tata Skyline", false,false,"Mumbai","Bangalore");
        Assert.assertEquals(9408,distance,0.00);
    }

    @Test
    public void busRentalWithoutAcDieselExtraPassangersTest(){
        CarRental car = new CarRental();
        double distance = car.calculateTotalTripExpense("BUS","Tata Skyline", false,false,"Mumbai","Bangalore",45);
        Assert.assertEquals(18408,distance,0.00);
    }

    @Test
    public void busRentalWithAcDieselTest(){
        CarRental car = new CarRental();
        double distance = car.calculateTotalTripExpense("BUS","Tata Skyline", true,false,"Mumbai","Bangalore");
        Assert.assertEquals(11760,distance,0.00);
    }

    @Test
    public void busRentalWithAcDieselExtraPassangersTest(){
        CarRental car = new CarRental();
        double distance = car.calculateTotalTripExpense("BUS","Tata Skyline", true,false,"Mumbai","Bangalore",45);
        Assert.assertEquals(20760,distance,0.00);
    }

    @Test
    public void suvRentalWithAcDieselTest(){
        CarRental car = new CarRental();
        double distance = car.calculateTotalTripExpense("SUV","Mahindra XUV 500", true,false,"Mumbai","Bangalore");
        Assert.assertEquals(12000,distance,0.00);
    }

    @Test
    public void suvRentalWithAcDieselExtraPassangersTest(){
        CarRental car = new CarRental();
        double distance = car.calculateTotalTripExpense("SUV","Mahindra XUV 500", true,false,"Mumbai","Bangalore",7);
        Assert.assertEquals(15600,distance,0.00);
    }
}
