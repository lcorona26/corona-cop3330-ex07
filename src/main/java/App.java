/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Luis Corona
 */
import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);
    static final double feetToMeters = 0.09290304;
    public static void main(String[] args){
        App app = new App();
        String length = app.readLength();
        String width = app.readWidth();
        int area = app.calcArea(length, width);
        app.printOutput(area, length, width);
    }

    private int calcArea(String length, String width) {
        int intL = Integer.parseInt(length);
        int intW = Integer.parseInt(width);
        int area = intL*intW;
        return  area;
    }

    private void printOutput(int area, String length, String width) {
        String newline = System.lineSeparator();
        String message = String.format("You entered dimensions of %s feet by %s feet.", length, width);
        String message2 =String.format("The area is" +newline+ "%s square feet" +newline+ "%.3f square meters", area, area*feetToMeters);
        System.out.print(message +newline+ message2);
    }

    private String readLength() {
        System.out.print("What is the length of the room in feet? ");
        String length = in.nextLine();
        return length;
    }

    private String readWidth() {
        System.out.print("What is the width of the room in feet? ");
        String width = in.nextLine();
        return width;
    }
}
