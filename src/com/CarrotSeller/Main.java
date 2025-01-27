package com.CarrotSeller;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        CarrotSeller seller1 = new CarrotSeller(); // first carrot seller

        seller1.setName("Andrej Bavíš"); // Setting the information of the first carrot seller
        seller1.setAddress("Mrkvičková 1, Bratislava");
        seller1.setDateOfBirth(LocalDate.of(1960, 7, 1));
        seller1.setNumberOfContracts(20);
        seller1.setAmountOfSoldCarrots(10.45);
        seller1.setLocationCity("Bratislava");
        seller1.setLicencePlate("1AB2345");
        seller1.setConsumptionPerKm(12.3);

        CarrotSeller seller2 = new CarrotSeller(); // second carrot seller

        seller2.setName("Franta Flinta"); // Setting the information of the second carrot seller
        seller2.setAddress("Jana Masaryka 2, Brno");
        seller2.setDateOfBirth(LocalDate.of(1970, 5, 15));
        seller2.setNumberOfContracts(15);
        seller2.setAmountOfSoldCarrots(8.75);
        seller2.setLocationCity("Brno");
        seller2.setLicencePlate("2CD3456");
        seller2.setConsumptionPerKm(11.5);

        System.out.println("Prodejce 1: " + seller1.getName());
        System.out.println("Prodejce 2: " + seller2.getName());
    }
}