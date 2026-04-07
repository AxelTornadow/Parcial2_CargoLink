/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

import core.vehicle.Vehicle;
import java.time.LocalDate;
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
    private LocalDate registrationDate;
    private LocalDate deliveryDate;
    private Status status;
    private ArrayList<Package> packages;
    private Vehicle vehicle;

    public Shipping(String code, LogisticsCenter originCenter, LogisticsCenter destinationCenter, LocalDate registrationDate, LocalDate deliveryDate, Status status, Vehicle vehicle) {
        this.code = code;
        this.originCenter = originCenter;
        this.destinationCenter = destinationCenter;
        this.registrationDate = registrationDate;
        this.deliveryDate = deliveryDate;
        this.status = status;
        this.packages = new ArrayList<>();
        this.vehicle = vehicle;
    }

    public String getCode() {
        return code;
    }
    
    
    
    
}
