package com.example.transport;

public class HumanPoweredTransportFactory implements TransportFactory {
    @Override
    public Transport createScooter() {
        return new RollerSkates();
    }

    @Override
    public Transport createBike() {
        return new Bicycle();
    }
}
