package hw6;

public class Yard {

    public static void main(String[] args){

        Cat cat1 = new Cat("Tom", "Black", 4, 200);
        Dog dog1 = new Dog("Bob", "Yellow", 5,500, 10);
        Dog dog2 = new Dog("Jac","Blue",6,500, 10);
        Cat cat2 = new Cat("Pop", "Black", 4, 200);
        Cat cat3 = new Cat("TomYam", "Black", 4, 200);


        cat1.run(150);
        cat1.swim();
        dog1.run(600);
        dog1.swim();
        System.out.println("Собак создано - " + Dog.count);
        System.out.println("Котов создано - " + Cat.count);
    }
}
