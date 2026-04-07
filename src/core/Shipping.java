/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author atornay
 */
public class Shipping {
    
    private int code;
    private Client client;
    private LogisticsCenter originCenter;
    private LogisticsCenter destinationCenter;
    private Date registrationDate;
    private Date deliveryDate;
    private Status status;
    private ArrayList<package> packages;
    private Vehicle vehicle;
}
