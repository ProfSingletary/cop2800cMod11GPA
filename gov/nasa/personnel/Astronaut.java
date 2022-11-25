// Astronaut.java
// D. Singletary
// 11/19/21
// class representing an astronaut

package gov.nasa.personnel;

public class Astronaut {
    private String name;
    private double heightCm;  // height in centimeters
    private double weightKg;  // weight in kilograms
    
    // default constructor 
    public Astronaut() {
        this.name = "";
        this.heightCm = this.weightKg = 0.0;
    }
    
    // overload, create an astronaut with specified name, height, and weight
    public Astronaut(String name, double heightCm, double weightKg) {
        this.name = name;
        this.heightCm = heightCm;
        this.weightKg = weightKg;
    }
}
