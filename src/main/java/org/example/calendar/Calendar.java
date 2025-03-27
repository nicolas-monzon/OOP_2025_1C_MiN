package org.example.calendar;

import org.example.glob.GlobalVariables;

public class Calendar {

    Meeting[] meetings;

    public void print() {
        GlobalVariables gv = new GlobalVariables();
        System.out.println(gv.total);
        if(meetings != null && meetings.length > 0) {
            System.out.println(meetings[0].address);
        }
    }

    public Meeting get() {
        return new Meeting();
    }
}
