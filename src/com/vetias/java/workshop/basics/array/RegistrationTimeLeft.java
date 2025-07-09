package com.vetias.java.workshop.basics.array;

import java.time.LocalTime;

public class RegistrationTimeLeft {
    public static void main(String[] args) {
        LocalTime currentTime = LocalTime.now();
        LocalTime registrationtimeleft = LocalTime.of(12,30,0);
        int hoursLeft = registrationtimeleft.getHour() - currentTime.getHour();
        int minutesLeft = currentTime.getMinute()-registrationtimeleft.getMinute();
        int secondsLeft =currentTime.getSecond()- registrationtimeleft.getSecond();
        System.out.println("you have " + hoursLeft + " hours, " + minutesLeft + " minutes,and " + secondsLeft + " seconds left to register.");
    }
}
