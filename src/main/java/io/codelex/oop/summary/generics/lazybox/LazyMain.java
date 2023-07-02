package io.codelex.oop.summary.generics.lazybox;

public class LazyMain {

    public static void main(String[] args) {

        LazyBox<Integer> box = new LazyBox<>(LazyMain::calculate);

        //First time calling get - it should calculate the value
        Integer contents = box.get();

        //Second time calling get - it should just return previously calculated value and not calculate again
        Integer contents2 = box.get();

        System.out.println(contents);
        System.out.println(contents2);
    }

    public static Integer calculate() {
        return 200;
    }

}
