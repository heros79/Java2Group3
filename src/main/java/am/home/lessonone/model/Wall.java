package am.home.lessonone.model;

import java.util.Random;

public class Wall {

    private double height;

    public Wall() {
        Random r = new Random();
        this.height = r.nextDouble();
    }

    public double getHeight() {
        return height;
    }
}