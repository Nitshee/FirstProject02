package org.nitshe.course;

public class ScoringService {
    public int calculate(int age){
        if(age < 18){
            return -100;
        }else if(age > 60){
            return -200;
        }
        else {
            return 0;
        }
    }
}
