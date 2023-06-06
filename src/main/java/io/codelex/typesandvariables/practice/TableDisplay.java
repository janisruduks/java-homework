package io.codelex.typesandvariables.practice;

import io.codelex.custom.prettifyconsole.Old_PrettifyConsole;

public class TableDisplay {
    public static final String[] COURSES = {"Defense Against the Dark Arts", "Charms", "Potions",
            "Transfiguration", "Arithmancy", "Herbology", "Divination",
            "Care of Magical Creatures", "History of Magic"
    };
    public static final String[] TEACHERS = {"Professor Lupin", "Professor Flitwick", "Professor Slughorn", "Professor McGonagall",
            "Professor Sprout", "Professor Trelawney", "Professor Grubbly-Plank", "Professor Binns",
            "Professor Sinistra"
    };

    public static void main(String[] args) {
        String star = "*-*";
        String space = " ";
        System.out.println();
        System.out.println(star.repeat(22));
        for (int i = 0; i < COURSES.length; i++) {
            int spaceCountCourses = 29;
            int spaceCountTeachers = 24;
            spaceCountCourses -= COURSES[i].length();
            spaceCountTeachers -= TEACHERS[i].length();
            System.out.printf("| %s. ( %s%s ) %s%s |%n",
                    i + 1, space.repeat(spaceCountCourses), Old_PrettifyConsole.chooseColour(COURSES[i], i),
                    space.repeat(spaceCountTeachers), Old_PrettifyConsole.chooseColour(TEACHERS[i], i));
        }
        System.out.println(star.repeat(22));
    }
}
