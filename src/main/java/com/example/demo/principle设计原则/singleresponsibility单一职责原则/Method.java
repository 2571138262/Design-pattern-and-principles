package com.example.demo.principle设计原则.singleresponsibility单一职责原则;

public class Method {

    private void updateUserInfo(String userName, String address){
        userName = "geely";
        address = "beijing";
    }


    private void updateUserInfo(String userName, String... properties){
        userName = "geely";
//        address = "beijing";
    }

    private void updateUserName(String userName){
        userName = "geely";
    }

    private void updateAddress(String address){
        address = "beijing";
    }

    private void updateUserInfo(String userName, String address, boolean bool){
        if (bool){
            // todo something1
        }else {
            // todo something2
        }

    }
}
