/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

import core.vehicle.Vehicle;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author atornay
 */
public class Client {
    private int id;
    private String name;
    private String adress;
    private String email;
    private ArrayList<Shipping> shippings;

    public Client(int id, String name, String adress, String email) {
        this.id = id;
        this.name = name;
        this.adress = adress;
        this.email = email;
    }
    
    public int getId() {
        return this.id;
    }
    
    public void makeShipping(int code, Client client, LogisticsCenter originCenter, LogisticsCenter destinationCenter, Date registrationDate, Date deliveryDate, Status status, Vehicle vehicle) {
        Shipping shipping = new Shipping(code, client, originCenter, destinationCenter, registrationDate, deliveryDate, status, vehicle);
        shippings.add(shipping);
    }
    
    public Shipping getShipping(String id) {
        for (Shipping shipping : shippings) {
            if (shipping.getCode().equals(id)) {
                return shipping;
            }
        }
        return null;
    }
    
    public ArrayList<Shipping> getShippings() {
        return shippings;
    }
}
