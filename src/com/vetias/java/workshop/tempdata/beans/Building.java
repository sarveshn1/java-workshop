package com.vetias.java.workshop.tempdata.beans;

import java.time.LocalDateTime;

public class Building {
    private String name;
    private double area;
    private double floor;
    private LocalDateTime opentime;
    private LocalDateTime closetime;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getFloor() {
        return floor;
    }

    public void setFloor(double floor) {
        this.floor = floor;
    }
    public LocalDateTime getOpentime() {
        return opentime;
    }

    public void setOpentime(LocalDateTime opentime) {
        this.opentime = opentime;
    }

    public LocalDateTime getClosetime() {
        return closetime;
    }

    public void setClosetime(LocalDateTime closetime) {
        this.closetime = closetime;
    }
}
