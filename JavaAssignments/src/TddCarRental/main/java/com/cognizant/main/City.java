package com.cognizant.main;

public enum City {

    PUNE("Pune"),MUMBAI("Mumbai"),BANGALORE("Bangalore"),DELHI("Delhi"),CHENNAI("Chennai");

    private String city;

    private City(String city){
        this.city = city;
    }

    public String getValue(){
        return this.city;
    }
}
