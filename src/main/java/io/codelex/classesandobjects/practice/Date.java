package io.codelex.classesandobjects.practice;

public class Date {
    // byte so I can flex that I'm saving memory
    private byte day;
    private byte month;
    private int year;

    public Date(byte day, byte month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String displayDate() {
        return formatDate(this.month) + "/" + formatDate(this.day) + "/" + this.year;
    }

    // just make it look better
    private String formatDate(byte value) {
        if (value < 10) {
            return "0" + value;
        } else {
            return Byte.toString(value);
        }
    }

    public byte getDay() {
        return day;
    }

    public void setDay(byte day) {
        this.day = day;
    }

    public byte getMonth() {
        return month;
    }

    public void setMonth(byte month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
