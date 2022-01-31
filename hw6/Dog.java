package hw6;

import hw6.animal.Animal;
public class Dog extends Animal {

    private int maxDistSwim;
    static int count;


   public Dog(String name, String color, int age, int maxDistanceRun, int maxDistSwim) {
       super(name, color, age, maxDistanceRun);
       this.maxDistSwim = maxDistSwim;
       count++;
    }
    @Override
   public void swim(){
       System.out.println(name + " проплыл" + maxDistSwim + "m");

   }
}
