/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

import java.util.ArrayList;

/**
 *
 * @author atornay
 */
public class LogisticsCenter {
    
    private String name;
    private String city;
    private String country;
    private double latitude;
    private double longitude;
    private ArrayList<Shipping> shippings;

    public LogisticsCenter(String name, String city, String country, double latitude, double longitude) {
        this.name = name;
        this.city = city;
        this.country = country;
        this.latitude = latitude;
        this.longitude = longitude;
    }
    
    
}
