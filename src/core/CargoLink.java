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
public class CargoLink {
    
    private ArrayList<Cliente> clientes;
    private ArrayList<LogisticsCenter> centers;
    private ArrayList<Vehicle> vehiculos;

    public CargoLink() {
        this.clientes = new ArrayList<>();
        this.centers = new ArrayList<>();
        this.vehiculos = new ArrayList<>();
    }
    
    public void addClient(int id, String name, String adress, String email) {
        Client client = new Client(id, name, adress, email);
        clientes.add(client);
    }
    
    public void addLogisticsCenter(String name, String city, String country, float latitude, float longitude) {
        LogisticsCenter center = new LogisticsCenter(name, city, country, latitude, longitude);
        centers.add(center);
    }
    
}
