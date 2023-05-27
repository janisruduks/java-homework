package io.codelex.additional_exercises.trafic_light;

public class TrafficLightTest {
    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight("red", 35);

        System.out.println("Is traffic light currently red? " + trafficLight.isRed());
        System.out.println("Is traffic light currently green? " + trafficLight.isGreen());
        System.out.println("Traffic light is now " + trafficLight.getColor() + " and duration is " + trafficLight.getDuration());
        trafficLight.changeColor("Blue");
        trafficLight.changeColor("green");
        System.out.println("Traffic light is now " + trafficLight.getColor() + " and duration is " + trafficLight.getDuration());

    }
}
