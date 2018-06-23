package com.eab;

public class Main {

    public static void main(String[] args) {
        GearBox audi = new GearBox(6);
        audi.addGear(1, 10.5);
        audi.addGear(2, 12.5);
        audi.addGear(3, 15.5);
        audi.addGear(4, 18.5);
        audi.addGear(5, 19.5);

        audi.opereteClutch(true);
        audi.changeGear(1);
        audi.opereteClutch(false);
        System.out.println(audi.wheelSpeed(1000));

    }
}
