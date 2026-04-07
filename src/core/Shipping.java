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
public class Shipping {
    
    private String code;
    private Client client;
    private LogisticsCenter originCenter;
    private LogisticsCenter destinationCenter;
    private Date registrationDate;
    private Date deliveryDate;
    private Status status;
    private ArrayList<Package> packages;
    private Vehicle vehicle;

    public Shipping(int code, Client client, LogisticsCenter originCenter, LogisticsCenter destinationCenter, Date registrationDate, Date deliveryDate, Status status, Vehicle vehicle) {
        this.code = code;
        this.client = client;
        this.originCenter = originCenter;
        this.destinationCenter = destinationCenter;
        this.registrationDate = registrationDate;
        this.deliveryDate = deliveryDate;
        this.status = status;
        this.packages = new ArrayList<>();
        this.vehicle = vehicle;
    }
    
    public void addPackage(double weight, Content type, double value) {
        Package pack = new Package(weight, type, value);
        packages.add(pack);
    }
    
    public String getCode() {
        return this.code;
    }
    
}
