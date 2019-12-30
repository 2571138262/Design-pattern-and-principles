package com.example.demo.designpattern设计模式.behavioral行为型.command命令模式;

import java.util.ArrayList;
import java.util.List;

public class Staff {
    
    private List<Command> commandList = new ArrayList<>();
    
    public void addCommand(Command command){
        commandList.add(command);
    }
    
    public void executeCommand(){
        for (Command command : commandList){
            command.execute();
        }
        commandList.clear();
    }
    
}
