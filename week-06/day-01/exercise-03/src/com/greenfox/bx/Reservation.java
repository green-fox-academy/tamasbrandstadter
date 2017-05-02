package com.greenfox.bx;

import java.util.Random;

public class Reservation implements Reservationy {
    private Random random = new Random();
    private static final String ALPHABET = "0123456789ABCDEFGHIJKLMNOPQRSTXYZVW";
    private final int n = ALPHABET.length();
    private String code;
    private static final String[] DAYS = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
    private String day;

    Reservation() {
        this.code = "";
        this.day = "";
    }

    @Override
    public String getDowBooking() {
        return day = (DAYS[random.nextInt(DAYS.length)]);
    }

    @Override
    public String getCodeBooking() {
        String s = "";
        for (int i = 0; i < 8; i++) {
            s += ALPHABET.charAt(random.nextInt(n));
        }
        code = s;
        return code;
    }

    @Override
    public String toString() {
        return "Booking# " + getCodeBooking() + " for " + getDowBooking();
    }
}
