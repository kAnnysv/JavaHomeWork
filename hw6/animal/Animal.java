package hw6.animal;

public abstract class Animal {

    protected String name;
    protected String color;
    protected int age;
    protected int maxDistanceRun;



    public Animal(String name, String color, int age, int maxDistanceRun) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.maxDistanceRun = maxDistanceRun;

    }

    public void run(int distance){

        if((maxDistanceRun - distance) >= 0) {
            System.out.println(name + " пробежал " + distance + "m");
        } else {
            System.out.println(name + " столько бегать не умеет.");
        }
    }




    public abstract void swim();
}
