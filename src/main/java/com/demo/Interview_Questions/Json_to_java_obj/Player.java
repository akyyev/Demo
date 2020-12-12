package com.demo.Interview_Questions.Json_to_java_obj;

import java.util.List;

public class Player {
    private String name;
    private String sport;
    private int age;
    private int id;
    private List<Integer> lastScores;

    public Player(String name, String sport, int age, int id, List<Integer> lastScores) {
        this.name = name;
        this.sport = sport;
        this.age = age;
        this.id = id;
        this.lastScores = lastScores;
    }

    public String getName() {
        return name;
    }

    public String getSport() {
        return sport;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public List<Integer> getLastScores() {
        return lastScores;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLastScores(List<Integer> lastScores) {
        this.lastScores = lastScores;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", sport='" + sport + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", lastScores=" + lastScores +
                '}';
    }
}