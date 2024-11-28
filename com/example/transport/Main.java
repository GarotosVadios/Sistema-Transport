package com.example.transport;

public class Main {
    public static void main(String[] args) {
        
        TransportFactory electricFactory = new ElectricTransportFactory();
        
        Transport electricScooter = electricFactory.createScooter();
        electricScooter.ride(); 
        
        Transport electricBike = electricFactory.createBike();
        electricBike.ride(); 

       
        TransportFactory humanFactory = new HumanPoweredTransportFactory();

        Transport bicycle = humanFactory.createBike();
        bicycle.ride();
         
        
        Transport rollerSkates = humanFactory.createScooter();
        rollerSkates.ride(); 
    }
}
