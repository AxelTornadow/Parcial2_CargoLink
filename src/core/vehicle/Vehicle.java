/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.vehicle;

import core.Shipping;
import java.util.ArrayList;

/**
 *
 * @author isacm
 */
public abstract class Vehicle {
    protected double cargoCapacity;
    protected ArrayList<Shipping> shipping; 

    public Vehicle(double cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
        this.shipping = new ArrayList();
    }
    
}
