package am.home.lessonone.model;

import am.home.lessonone.interfaces.ParticipantsAction;

import java.util.Random;

public class Cat implements ParticipantsAction {

    private String name;
    private final double lengthLimitation;
    private final double heightLimitation;

    public Cat(String name) {
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
            System.out.println(name + " Cat jump");
        } else {
            System.out.println(name + " Cat not jump");
        }
    }

    public void jump() {
        System.out.println(name + " Cat jump");
    }

    public void run(boolean b) {
        if (b) {
            System.out.println(name + " Cat run");
        } else {
            System.out.println(name + " Cat not run");
        }
    }

    public void run() {
        System.out.println(name + " Cat run");
    }
}