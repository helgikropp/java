package com.wellnessliving.homework02;

public class Address {
    private final String city; // City name
	private final String street; // Street name

    public Address(String city, String street){
        this.city = city;
        this.street = street;
    }

    public String getCity(){
        return city;
    }

    public String getStreet() {
        return street;
    }
}
