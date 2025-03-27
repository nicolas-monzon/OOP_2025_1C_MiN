package org.example;

import org.example.calendar.Meeting;

public class App {

    public static void main(String[] args) {
        Meeting meeting = new Meeting();
        System.out.println(meeting.getTopic());
    }

}
