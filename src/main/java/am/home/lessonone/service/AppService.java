package am.home.lessonone.service;

import am.home.lessonone.interfaces.ParticipantsAction;
import am.home.lessonone.model.*;

import java.util.Random;

public class AppService {

    private Object[] participants;
    private Object[] obstacles;
    private ParticipantsAction[] participantsActions;
    private Random r;

    private Cat cat;
    private Human human;
    private Robot robot;
    private Wall wall;
    private Treadmill treadmill;

    public AppService() {
        participants = fillParticipants();
        obstacles = fillObstacles();
        participantsActions = fillParticipantsAction();
        r = new Random();
    }

    public void competitionWithObstaclesImpl() {
        for (int i = 0; i < participantsActions.length; i++) {
            for (int j = 0; j < obstacles.length; j++) {
                if (obstacles[j] instanceof Wall) {
                    wall = new Wall();
                    if (participantsActions[i].getHeightLimitation() > wall.getHeight()) {
                        jump(participantsActions[i]);
                    } else {
                        System.out.println("Participant " + participantsActions[i].getName() + " dropped");
                        break;
                    }
                } else if (obstacles[j] instanceof Treadmill) {
                    treadmill = new Treadmill();
                    if (participantsActions[i].getLengthLimitation() > treadmill.getLength()) {
                        run(participantsActions[i]);
                    } else {
                        System.out.println("Participant " + participantsActions[i].getName() + " dropped");
                        break;
                    }
                } else {
                    System.out.println("Not have this obstacles type");
                    System.exit(0);
                }
            }
        }
    }

    public void competitionWithObstacles() {
        for (int i = 0; i < participants.length; i++) {
            for (int j = 0; j < obstacles.length; j++) {
                if (participants[i] instanceof Cat) {
                    cat = (Cat) participants[i];
                    if (obstacles[j] instanceof Wall) {
                        wall = new Wall();
                        if (cat.getHeightLimitation() > wall.getHeight()) {
                            cat.jump();
                        } else {
                            System.out.println("Participant " + cat.getName() + " dropped");
                            break;
                        }
                    } else if (obstacles[j] instanceof Treadmill) {
                        treadmill = new Treadmill();
                        if (cat.getLengthLimitation() > treadmill.getLength()) {
                            cat.run();
                        } else {
                            System.out.println("Participant " + cat.getName() + " dropped");
                            break;
                        }
                    } else {
                        System.out.println("Not have this obstacles type");
                        System.exit(0);
                    }
                } else if (participants[i] instanceof Human) {
                    human = (Human) participants[i];
                    if (obstacles[j] instanceof Wall) {
                        wall = new Wall();
                        if (human.getHeightLimitation() > wall.getHeight()) {
                            human.jump();
                        } else {
                            System.out.println("Participant " + human.getName() + " dropped");
                            break;
                        }
                    } else if (obstacles[j] instanceof Treadmill) {
                        treadmill = new Treadmill();
                        if (human.getLengthLimitation() > treadmill.getLength()) {
                            human.run();
                        } else {
                            System.out.println("Participant " + human.getName() + " dropped");
                            break;
                        }
                    } else {
                        System.out.println("Not have this obstacles type");
                        System.exit(0);
                    }
                } else if (participants[i] instanceof Robot) {
                    robot = (Robot) participants[i];
                    if (obstacles[j] instanceof Wall) {
                        wall = new Wall();
                        if (robot.getHeightLimitation() > wall.getHeight()) {
                            robot.jump();
                        } else {
                            System.out.println("Participant " + robot.getName() + " dropped");
                            break;
                        }
                    } else if (obstacles[j] instanceof Treadmill) {
                        treadmill = new Treadmill();
                        if (robot.getLengthLimitation() > treadmill.getLength()) {
                            robot.run();
                        } else {
                            System.out.println("Participant " + robot.getName() + " dropped");
                            break;
                        }
                    } else {
                        System.out.println("Not have this obstacles type");
                        System.exit(0);
                    }
                } else {
                    System.out.println("Not have this participant type");
                    System.exit(0);
                }

            }
        }
    }

    public void competitionWithoutObstacles() {

        for (int i = 0; i < participants.length; i++) {
            for (int j = 0; j < obstacles.length; j++) {
                if (participants[i] instanceof Cat) {
                    cat = (Cat) participants[i];
                    if (obstacles[j] instanceof Wall) {
                        cat.jump(canOvercomeObstacle());
                    } else if (obstacles[j] instanceof Treadmill) {
                        cat.run(canOvercomeObstacle());
                    } else {
                        System.out.println("Not have this obstacles type");
                        System.exit(0);
                    }
                } else if (participants[i] instanceof Human) {
                    human = (Human) participants[i];
                    if (obstacles[j] instanceof Wall) {
                        human.jump(canOvercomeObstacle());
                    } else if (obstacles[j] instanceof Treadmill) {
                        human.jump(canOvercomeObstacle());
                    } else {
                        System.out.println("Not have this obstacles type");
                        System.exit(0);
                    }
                } else if (participants[i] instanceof Robot) {
                    robot = (Robot) participants[i];
                    if (obstacles[j] instanceof Wall) {
                        robot.jump(canOvercomeObstacle());
                    } else if (obstacles[j] instanceof Treadmill) {
                        robot.jump(canOvercomeObstacle());
                    } else {
                        System.out.println("Not have this obstacles type");
                        System.exit(0);
                    }
                } else {
                    System.out.println("Not have this participant type");
                    System.exit(0);
                }

            }
        }
    }

    private Object[] fillParticipants() {
        Object[] o = new Object[9];
        for (int i = 0; i < 9; i += 3) {
            o[i] = new Cat("Cat" + i);
        }
        for (int i = 1; i < 9; i += 3) {
            o[i] = new Human("Human" + i);
        }
        for (int i = 2; i < 9; i += 3) {
            o[i] = new Robot("Robot" + i);
        }
        return o;
    }

    private Object[] fillObstacles() {
        Object[] o = new Object[6];
        for (int i = 0; i < 6; i += 2) {
            o[i] = new Wall();
        }
        for (int i = 1; i < 6; i += 2) {
            o[i] = new Treadmill();
        }
        return o;
    }

    private ParticipantsAction[] fillParticipantsAction() {
        ParticipantsAction[] o = new ParticipantsAction[9];
        for (int i = 0; i < 9; i += 3) {
            o[i] = new Cat("Cat" + i);
        }
        for (int i = 1; i < 9; i += 3) {
            o[i] = new Human("Human" + i);
        }
        for (int i = 2; i < 9; i += 3) {
            o[i] = new Robot("Robot" + i);
        }
        return o;
    }

    private boolean canOvercomeObstacle() {
        return r.nextInt(2) == 1;
    }

    private void jump(ParticipantsAction a) {
        a.jump();
    }

    private void run(ParticipantsAction a) {
        a.run();
    }
}