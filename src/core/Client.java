/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

import core.vehicle.Vehicle;
import java.time.LocalDate;
import java.util.ArrayList;

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
    
    public Shipping getShipping(String code) {
        for(Shipping shipping : shippings){
            if(shipping.getCode().equals(code)) return shipping;
        }
        return null;
    }
    
    public void makeShipping(String code, LogisticsCenter v2, LogisticsCenter originCenter, LocalDate registrationDate, LocalDate deliveryDate, Status status, Vehicle vehicle) {
        Shipping shipping = new Shipping(code, v2, originCenter, registrationDate, deliveryDate, status, vehicle);
        shippings.add(shipping);
    }
}
