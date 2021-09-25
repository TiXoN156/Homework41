package com.company;

public class Main {

    public static void main(String[] args) {
    	Animal[] animals = new Animal[4];
    	animals[0] = new Dog("Шарик");
        animals[1] = new Dog("Тузик");
        animals[2] = new Cat("Барсик");
        animals[3] = new Cat("Мурзик");

        for (int i = 0; i < animals.length; i++){
            animals[i].run(100*(i+1));
            animals[i].jump(0.5*(i+1));
            animals[i].swim(3*(i+1));
        }
    }
}
