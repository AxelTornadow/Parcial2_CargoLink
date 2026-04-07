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
}
