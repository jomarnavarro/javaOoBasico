package com.testAutomationCoach.aAbstraccion;

class TapeDeck {


    boolean canRecord = false;


    void playTape() {
        System.out.println("tape playing");
    }


    void recordTape() {
        System.out.println("tape recording");
    }
}


class TapeDeckTestDrive {
    public static void main(String [] args) {

//Por que no compilan las instrucciones de abajo?
//        t.canRecord = true;
//        t.playTape();
//
//
//        if (t.canRecord == true) {
//            t.recordTape();
//
//        }
    }
}
