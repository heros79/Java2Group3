package am.home.lessonone.model;

import java.util.Random;

public class Treadmill {

    private double length;

    public Treadmill() {
        Random r = new Random();
        this.length = r.nextDouble();
    }

    public double getLength() {
        return length;
    }
}