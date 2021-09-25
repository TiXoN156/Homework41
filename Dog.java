package com.company;

public class Dog extends Animal{
    private String name;
    private String type = "Собака";
    private final int RUN_MAX = 500;
    private final double JUMP_MAX = 0.5;
    private final int SWIM_MAX = 10;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void run(int run){
        if (run <= RUN_MAX){
            System.out.println(String.format("%s %s пробежал дистанцию %s м.", type, name, run));
        }
        else {
            System.out.println(String.format("%s %s не пробежал дистанцию %s м.", type, name, run));
        }
    }

    public void jump(double jump){
        if (jump <= JUMP_MAX){
            System.out.println(String.format("%s %s перепрыгнул препятствие высотой %s м.", type, name, jump));
        }
        else {
            System.out.println(String.format("%s %s не перепрыгнул препятствие высотой %s м.", type, name, jump));
        }
    }

    public void swim(int swim){
        if (swim <= SWIM_MAX){
            System.out.println(String.format("%s %s проплыл дистанцию %s м.", type, name, swim));
        }
        else {
            System.out.println(String.format("%s %s не проплыл дистанцию %s м.", type, name, swim));
        }
    }
}
