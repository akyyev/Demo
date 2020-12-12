package com.demo.day09_enums;

public enum  Level {
    HIGH(3),
    MEDIUM(2),
    LOW(1);

    private int level_num;


    private Level(int num){
        this.level_num = num;
    }

    public int getLevelNum(){
        return level_num;
    }

    public void setLevelNum(int num){
        this.level_num = num;
    }
}
