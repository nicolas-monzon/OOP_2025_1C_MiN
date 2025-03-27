package org.example.calendar;

import org.example.address.Address;

public class Meeting {

    public Address address;
    public String[] guests;
    private String topic;
    public byte duration;
    public boolean flag;

    public Meeting() {

    }

    public Meeting(Address address, String[] guests, byte duration) {
        this.address = address;
        this.guests = guests;
        this.duration = duration;
    }

    public void example() {
        int a = 1;
        int b = 80;
        topic = "";
        if(b == 0) {
            System.out.println(1);
        } else {
            System.out.println(specialDiv(a, b));
        }
    }

    public void example2() {
        System.out.println(specialDiv(1, 5));
    }

    private double specialDiv(int a, int b) {
        if(b == 0) {
            throw new RuntimeException();
        }
        return ((double) a) / b;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String[] getGuests() {
        return guests;
    }

    public void setGuests(String[] guests) {
        this.guests = guests;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public byte getDuration() {
        return duration;
    }

    public void setDuration(byte duration) {
        this.duration = duration;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}

