package am.home;

import am.home.lessonone.service.AppService;

public class AppRun {

    static AppService service;

    public static void main(String[] args) {
        AppService service = new AppService();
        //service.competitionWithoutObstacles();
        //service.competitionWithObstacles();
        service.competitionWithObstaclesImpl();
    }

}