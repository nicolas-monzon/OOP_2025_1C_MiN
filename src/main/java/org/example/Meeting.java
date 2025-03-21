package org.example;

class Meeting {

    String address;
    String[] guests;
    String topic;
    byte duration;

    Meeting(String address, String[] guests, byte duration) {
        this.address = address;
        this.guests = guests;
        this.duration = duration;
    }

}
