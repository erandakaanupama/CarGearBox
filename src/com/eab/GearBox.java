package com.eab;

import java.util.ArrayList;

public class GearBox {

    private ArrayList<Gear> gears;
    private int maxGears;
    private int currentGear;
    private boolean clutchIsIn;

    public GearBox(int maxGears) {
        this.gears = new ArrayList<Gear>();
        this.maxGears = maxGears;
        this.currentGear = 0;
        Gear neutral = new Gear(0, 0.0);
        this.gears.add(neutral);
    }

    public void opereteClutch(boolean clutchIsIn){
        this.clutchIsIn = clutchIsIn;
    }

    public void addGear(int gearNumber, double ratio){
        if (gearNumber >0 && gearNumber<=this.maxGears){
            this.gears.add(new Gear(gearNumber,ratio));
        }
    }

    public void changeGear(int newGear){
        if (newGear >=0 && newGear <this.gears.size() && this.clutchIsIn){
            this.currentGear = newGear;
            System.out.println("Gear " + newGear + " selected");
        }
        else {
            System.out.println("Gear change unsuccessful");
            this.currentGear =0;
        }
    }

    public double wheelSpeed(double revs){
        if (this.clutchIsIn){
            System.out.println("scream");
            return 0.0;
        }
        return revs * this.gears.get(this.currentGear).getRatio();
    }

    private class Gear{
        private int gearNumber;
        private double ratio;

        public Gear(int gearNumber, double ratio) {
            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }

        public double getRatio() {
            return ratio;
        }
    }
}
