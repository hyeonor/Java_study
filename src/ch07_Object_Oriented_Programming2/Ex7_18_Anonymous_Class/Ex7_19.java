package ch07_Object_Oriented_Programming2.Ex7_18_Anonymous_Class;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Ex7_18를 익명 클래스(anonymous class)로 바꾼 것
public class Ex7_19 {
    public static void main(String[] args) {
        Button b = new Button("Start");
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("ActionEvent occurred!!!");
            }
        });
    }
}