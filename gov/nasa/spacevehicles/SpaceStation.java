// SpaceStation.java
// D. Singletary
// 11/19/21
// class representing a space station

package gov.nasa.spacevehicles;

import gov.nasa.personnel.Astronaut;

public class SpaceStation {
    private static int MAX_ASTRONAUTS = 10;
    private String name;
    private double weightKg;  // weight in kg
    private double altitudeKm; // altitude in kilometers
    private int numAstronauts;
    Astronaut[] astronauts = new Astronaut[MAX_ASTRONAUTS];

    // default constructor
    public SpaceStation() {
        this.name = "";
        this.weightKg = 0.0;
        this.altitudeKm = 0.0;
        this.numAstronauts = 0;
    }
        
    // overload, create a space station object with specified name and weight
    public SpaceStation(String name, double weightKg) {
        this.name = name;
        this.weightKg = weightKg;
        this.altitudeKm = 0.0;
        this.numAstronauts = 0;
    }
    
    // add an astronaut
    public void addAstronaut(String name, double heightCm, double weightKg) {
        astronauts[numAstronauts++] = new Astronaut(name, heightCm, weightKg);
        this.weightKg += weightKg;
    }
    
    // set the altitude
    public void setAltitude(double altitudeKm) {
        this.altitudeKm = altitudeKm;
    }
    
    // show the space station
    public String toString() {
        return "SpaceStation:  " + this.name + "\n" +
               "Weight (kg):   " + this.weightKg + "\n" +
               "Altitude (km): " + this.altitudeKm + "\n" +
               "Astronauts:    " + this.numAstronauts;
    }  
    
    public static void main(String[] args) {
    
        // create a space station and display it
        SpaceStation ss = new SpaceStation("ISS", 419700.0);
        System.out.println(ss);
        System.out.println();
        
        // add some astronauts
        ss.addAstronaut("Smith", 167.64, 81.65);
        ss.addAstronaut("Jones", 153.27, 74.55);
        ss.addAstronaut("Brown", 176.33, 87.91);
        
        // set the altitude
        ss.setAltitude(400.0);
        
        // show the new state
        System.out.println(ss);
    }         
}
