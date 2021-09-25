package com.company;

public class Cat extends Animal{
    private String name;
    private String type = "Кот";
    private final int RUN_MAX = 200;
    private final double JUMP_MAX = 2.0;
    private final int SWIM_MAX = 0;

    public Cat(String name) {
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
