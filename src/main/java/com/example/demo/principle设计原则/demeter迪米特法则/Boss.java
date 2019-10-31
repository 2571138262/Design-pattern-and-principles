package com.example.demo.principle设计原则.demeter迪米特法则;

public class Boss {

    public void commandCheckNumber(TeamLeader teamLeader){
        teamLeader.checkNumberOfCourses();
    }

}
