package com.kienspring.master.demo;
import org.springframework.stereotype.Component;

@Component("paradox")
public class Paradox implements Outfit {
    @Override

    public void wear(){
        System.out.println("Đang mặc áo Paradox");
    }
}
