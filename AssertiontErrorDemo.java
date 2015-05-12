package com;

public class AssertiontErrorDemo {
    public static void main(String[] args){
        int score = -30;
        
        System.out.printf("%,d\n",Runtime.getRuntime().freeMemory());
        
        assert(score>=0):"Error:"+score;
        assert(score<100):"Error:"+score;
        if(score>=60){
            System.out.println("及格!");
        }else if(score<60){
            System.out.println("不及格!");
        }
    }
}
