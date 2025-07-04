package com.vetias.java.workshop.tempdata.beans;

public class TemperatureSensor implements Sensor {
    
    private float temperature;

    public TemperatureSensor(float Temperature){
        this.temperature = Temperature;
    }

    public TemperatureSensor() {
    }
    @Override
    public float getreading(){
        return this.temperature;
    }
}
