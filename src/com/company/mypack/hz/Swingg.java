package com.company.mypack.hz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Swingg {

    JFrame frame;

    public void go() {
        frame = new JFrame();
        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        button1.addActionListener(new FirstListener());
        button2.addActionListener(new SecondListener());
        frame.getContentPane().add(BorderLayout.WEST, button1);
        frame.getContentPane().add(BorderLayout.EAST, button2);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 200);
        frame.setVisible(true);

    }

    class FirstListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("FirstListener - HO HO HO");
        }
    }

    class SecondListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("SecondListener - GO GO GO");
        }
    }

    public static void main(String[] args) {
        Swingg swingg = new Swingg();
        swingg.go();
    }
}













