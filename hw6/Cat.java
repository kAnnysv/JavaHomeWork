package hw6;

import hw6.animal.Animal;

public class Cat extends Animal {
    static int count;

    public Cat(String name, String color, int age, int maxDistanceRun) {
        super(name, color, age, maxDistanceRun);
        count++;
    }

    @Override
    public void swim() {
        System.out.println(name + " не умеет плавать");

    }


}
