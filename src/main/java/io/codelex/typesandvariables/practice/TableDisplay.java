package io.codelex.typesandvariables.practice;

public class TableDisplay {
    public static final String[] courses = {"Defense Against the Dark Arts", "Charms", "Potions",
            "Transfiguration", "Arithmancy", "Herbology", "Divination",
            "Care of Magical Creatures", "History of Magic"
    };
    public static final String[] teachers = {"Professor Lupin", "Professor Flitwick", "Professor Slughorn", "Professor McGonagall",
            "Professor Sprout", "Professor Trelawney", "Professor Grubbly-Plank", "Professor Binns",
            "Professor Sinistra"
    };
    public static void main(String[] args){
        String star = "*-*";
        String space = " ";
        System.out.println();
        System.out.println(star.repeat(22));
        for(int i = 0; i < courses.length; i++){
            int spaceCountCourses = 29;
            int spaceCountTeachers = 24;
            spaceCountCourses -= courses[i].length();
            spaceCountTeachers -= teachers[i].length();
            System.out.printf("| %s. ( %s%s ) %s%s |%n",
                    i+1, space.repeat(spaceCountCourses), Cc.chooseColour(courses[i], i),
                    space.repeat(spaceCountTeachers), Cc.chooseColour(teachers[i], i));
        }
        System.out.println(star.repeat(22));
    }
}
