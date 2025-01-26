package com.CarrotSeller; // Definition of package
import java.time.LocalDate; // Importing LocalDate class from java.time package due to usage in the class

public class CarrotSeller {
    private LocalDate dateOfBirth; // Date of birth of the carrot seller
    private int numberOfContracts; // Number of contracts the carrot seller has
    private double amountOfSoldCarrots; // Amount of carrots the carrot seller has sold in tons
    private String locationCity; // City where the carrot seller is located
    private String licencePlate; // Licence plate of the carrot seller's vehicle
    private double consumptionPerKm; // Consumption of the carrot seller's vehicle per km in liters
    private String name; // Name of the carrot seller
    private String address; // Address of the carrot seller

    // Getters for attributes of the class

    public LocalDate getDateOfBirth() {
        return dateOfBirth; // Getter for dateOfBirth
    }
    public int getNumberOfContracts() {
        return numberOfContracts; // Getter for numberOfContracts
    }
    public double getAmountOfSoldCarrots() {
        return amountOfSoldCarrots; // Getter for amountOfSoldCarrots
    }
    public String getLocationCity() {
        return locationCity; // Getter for locationCity
    }
    public String getLicencePlate() {
        return licencePlate; // Getter for licencePlate
    }
    public double getConsumptionPerKm() {
        return consumptionPerKm; // Getter for consumptionPerKm
    }
    public String getName() {
        return name; // Getter for name
    }
    public String getAddress() {
        return address; // Getter for address
    }

    // Setters for attributes of the class
    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth; // Setter for dateOfBirth
    }
    public void setNumberOfContracts(int numberOfContracts) {
        this.numberOfContracts = numberOfContracts; // Setter for numberOfContracts
    }
    public void setAmountOfSoldCarrots(double amountOfSoldCarrots) {
        this.amountOfSoldCarrots = amountOfSoldCarrots; // Setter for amountOfSoldCarrots
    }
    public void setLocationCity(String locationCity) {
        this.locationCity = locationCity; // Setter for locationCity
    }
    public void setLicencePlate(String licencePlate) {
        this.licencePlate = licencePlate; // Setter for licencePlate
    }
    public void setConsumptionPerKm(double consumption) {
        this.consumptionPerKm = consumption; // Setter for consumptionPerKm
    }
    public void setName(String name) {
        this.name = name; // Setter for name
    }
    public void setAddress(String address) {
        this.address = address; // Setter for address
    }

    public void getInfo() {
        System.out.println("Jméno prodejce: " + name);
        System.out.println("Adresa: " + address);
        System.out.println("Datum narození: " + dateOfBirth);
        System.out.println("Počet vyhotovených smluv: " + numberOfContracts);
        System.out.println("Počet prodaných mrkví v tunách: " + amountOfSoldCarrots);
        System.out.println("Město výskytu: " + locationCity);
        System.out.println("Registrační značka vozidla prodejce: " + licencePlate);
        System.out.println("Spotřeba vozidla za km: " + consumptionPerKm);
    } // Method to print the information of the carrot seller
}
