package ch07_Object_Oriented_Programming2.Ex7_18_Anonymous_Class;

import java.awt.*;
import java.awt.event.*;

// Ex7_19에서 Ex7_18을 익명 클래스(anonymous class)로 변경함
class Ex7_18 {
    public static void main(String[] args) {
        Button b = new Button("Start");
        b.addActionListener(new EventHandler());
    }
}

class EventHandler implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        System.out.println("ActionEvent occurred!!!");
    }
}
