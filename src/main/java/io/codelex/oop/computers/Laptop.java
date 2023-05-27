package io.codelex.oop.computers;

public class Laptop extends Computer {
    private String battery;

    public Laptop(String processor, String ram, String graphicsCard, String company, String model, String battery) {
        super(processor, ram, graphicsCard, company, model);
        this.battery = battery;
    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "processor=`" + super.getProcessor() + '\'' +
                "ram=`" + super.getRam() + '\'' +
                "graphicsCard='" + super.getGraphicsCard() + '\'' +
                "company='" + super.getCompany() + '\'' +
                "model='" + super.getModel() + '\'' +
                "battery='" + battery + '\'' +
                '}';
    }
}
