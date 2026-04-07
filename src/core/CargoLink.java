/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

import core.vehicle.Truck;
import core.vehicle.Vehicle;
import java.util.ArrayList;

/**
 *
 * @author atornay
 */
public class CargoLink {
    
    private ArrayList<Client> clients;
    private ArrayList<LogisticsCenter> centers;
    private ArrayList<Vehicle> vehicles;

    public CargoLink() {
        this.clients = new ArrayList<>();
        this.centers = new ArrayList<>();
        this.vehicles = new ArrayList<>();
    }
    
    public void addClient(Client client) {
        clients.add(client);
    }
    
    public void addLogisticsCenter(String name, String city, String country, double latitude, double longitude) {
        LogisticsCenter center = new LogisticsCenter(name, city, country, latitude, longitude);
        centers.add(center);
    }
    
    public void addVehicle(Truck truck) {
        vehicles.add(truck);
    }
    
    public Client getClient(int id) {
        for (Client client : clients) {
            if (client.getId() == id) {
                return client;
            }
        }
        return null;
    }
    
    public void packageSummary() {
        System.out.println("Package summary:");
        
    }
    
    public void vehicleSummary() {
        
    }
}
