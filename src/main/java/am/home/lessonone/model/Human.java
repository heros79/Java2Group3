package am.home.lessonone.model;

import am.home.lessonone.interfaces.ParticipantsAction;

import java.util.Random;

public class Human implements ParticipantsAction {

    private String name;
    private double lengthLimitation;
    private double heightLimitation;

    public Human(String name) {
        Random r = new Random();
        this.name = name;
        this.lengthLimitation = r.nextDouble();
        this.heightLimitation = r.nextDouble();
    }

    public String getName() {
        return name;
    }

    public double getLengthLimitation() {
        return lengthLimitation;
    }

    public double getHeightLimitation() {
        return heightLimitation;
    }

    public void jump(boolean b) {
        if (b) {
            System.out.println(name + " Human jump");
        } else {
            System.out.println(name + " Human not jump");
        }
    }

    public void jump() {
        System.out.println(name + " Human jump");
    }

    public void run(boolean b) {
        if(b) {
            System.out.println(name + " Human run");
        } else {
            System.out.println(name + " Human not run");
        }
    }

    public void run() {
        System.out.println(name + " Human run");
    }
}