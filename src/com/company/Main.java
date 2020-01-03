package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Computer cm = new Computer();

        displayModule dm = new Monitor();
        displayModule dm1 = new Project();

        cm.setDisplayModule(dm);
        cm.display();
        cm.setDisplayModule(dm1);
        cm.display();
    }
}
