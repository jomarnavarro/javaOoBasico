package com.testAutomationCoach.bVariables;

class Hobbit {


    String name;


    public static void main(String [] args) {


        Hobbit[] h = new Hobbit[3];
        int z = 0;


        while (z < 4) {
            z = z + 1;
            h[z] = new Hobbit();
            h[z].name = "bilbo";
            if (z == 1) {
                h[z].name = "frodo";
            }
            if (z == 2) {
                h[z].name = "sam";
            }
            System.out.print(h[z].name + " is a ");
            System.out.println("good Hobbit name");
        }
    }
}

