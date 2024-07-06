package com.setup.app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener {
    JFrame app;
    JButton num1;
    JButton num2;
    JButton num3;
    JButton division;
    JButton delete;
    JButton num4;
    JButton num5;
    JButton num6;
    JButton multiplication;
    JButton clear;
    JButton num7;
    JButton num8;
    JButton num9;
    JButton subtraction;
    JButton zero;
    JButton dot;
    JButton Percent;
    JButton plus;
    JButton equal;
    JTextField text;
    String opreation;
    double firstinput = 0.0;
    double secendinput = 0.0;

    public Calculator() {
    }

    public void setupAppCalculator() {
        app = new JFrame("Calculator");
        app.setSize(400, 600);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setResizable(false);
        app.setLayout(null);
        //app.getContentPane().setBackground();
        app.setVisible(true);
    }

    public void createButton() {
        text = new JTextField();
        text.setBounds(30, 80, 280, 40);
        text.setBackground(Color.white.darker().brighter());
        app.add(text);
        num1 = new JButton("1");
        num2 = new JButton("2");
        num3 = new JButton("3");
        division = new JButton("/");
        delete = new JButton("del");
        num1.addActionListener(this);
        num2.addActionListener(this);
        num3.addActionListener(this);
        division.addActionListener(this);
        delete.addActionListener(this);
        num1.setBounds(40, 170, 50, 40);
        num2.setBounds(110, 170, 50, 40);
        num3.setBounds(180, 170, 50, 40);
        division.setBounds(250, 170, 50, 40);
        delete.setBounds(320, 170, 70, 60);
        app.add(num1);
        app.add(num2);
        app.add(num3);
        app.add(division);
        delete.setBackground(Color.orange.darker());
        app.add(delete);
        //---------------------------------------------------------------------------------------------
        num4 = new JButton("4");
        num5 = new JButton("5");
        num6 = new JButton("6");
        multiplication = new JButton("x");
        clear = new JButton("clear");
        num4.addActionListener(this);
        num5.addActionListener(this);
        num6.addActionListener(this);
        multiplication.addActionListener(this);
        clear.addActionListener(this);

        num4.setBounds(40, 240, 50, 40);
        num5.setBounds(110, 240, 50, 40);
        num6.setBounds(180, 240, 50, 40);
        multiplication.setBounds(250, 240, 50, 40);
        clear.setBounds(320, 240, 70, 60);

        app.add(num4);
        app.add(num5);
        app.add(num6);
        app.add(multiplication);
        clear.setBackground(Color.yellow.darker());
        app.add(clear);
        //---------------------------------------------------------------------------------------------
        num7 = new JButton("7");
        num8 = new JButton("8");
        num9 = new JButton("9");
        subtraction = new JButton("-");
        num7.addActionListener(this);
        num8.addActionListener(this);
        num9.addActionListener(this);
        subtraction.addActionListener(this);

        num7.setBounds(40, 310, 50, 40);
        num8.setBounds(110, 310, 50, 40);
        num9.setBounds(180, 310, 50, 40);
        subtraction.setBounds(250, 310, 50, 40);
        app.add(num7);
        app.add(num8);
        app.add(num9);
        app.add(subtraction);
        //---------------------------------------------------------------------------------------------
        zero = new JButton("0");
        dot = new JButton(".");
        Percent = new JButton("٪");
        plus = new JButton("+");
        equal = new JButton("=");
        zero.addActionListener(this);
        dot.addActionListener(this);
        Percent.addActionListener(this);
        plus.addActionListener(this);
        equal.addActionListener(this);
        zero.setBounds(40, 380, 50, 40);
        dot.setBounds(110, 380, 50, 40);
        Percent.setBounds(180, 380, 50, 40);
        plus.setBounds(250, 380, 50, 40);
        equal.setBounds(320, 310, 70, 111);
        app.add(zero);
        app.add(dot);
        app.add(Percent);
        app.add(plus);
        equal.setBackground(Color.GREEN);
        app.add(equal);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == num1) {
            text.setText(text.getText().concat("1"));
        }
        if (actionEvent.getSource() == num2) {
            text.setText(text.getText().concat("2"));
        }
        if (actionEvent.getSource() == num3) {
            text.setText(text.getText().concat("3"));
        }
        if (actionEvent.getSource() == num4) {
            text.setText(text.getText().concat("4"));

        }
        if (actionEvent.getSource() == num5) {
            text.setText(text.getText().concat("5"));
        }
        if (actionEvent.getSource() == num6) {
            text.setText(text.getText().concat("6"));

        }
        if (actionEvent.getSource() == num7) {
            text.setText(text.getText().concat("7"));

        }
        if (actionEvent.getSource() == num8) {
            text.setText(text.getText().concat("8"));

        }
        if (actionEvent.getSource() == num9) {
            text.setText(text.getText().concat("9"));

        }
        if (actionEvent.getSource() == zero) {
            text.setText(text.getText().concat("0"));

        }
        if (actionEvent.getSource() == division) {
            firstinput = Double.parseDouble(text.getText());
            opreation = "/";
            text.setText("");

        }
        if (actionEvent.getSource() == delete) {
            String content=text.getText();
            text.setText("");
            for (int i=0;i<content.length()-1;i++){
                text.setText(text.getText()+content.charAt(i));
            }

        }
        if (actionEvent.getSource() == subtraction) {
            firstinput = Double.parseDouble(text.getText());
            opreation = "-";
            text.setText("");
        }
        if (actionEvent.getSource() == clear) {
            text.setText("");
            opreation = "";
        }
        if (actionEvent.getSource() == multiplication) {
            firstinput = Double.parseDouble(text.getText());
            opreation = "x";
            text.setText("");
        }
        if (actionEvent.getSource() == dot) {
            text.setText(text.getText().concat("."));
        }
        if (actionEvent.getSource() == Percent) {
            firstinput = Double.parseDouble(text.getText());
            opreation = "%";
            text.setText("");
        }
        if (actionEvent.getSource() == plus) {
            firstinput = Double.parseDouble(text.getText());
            opreation = "+";
            text.setText("");
        }
        if (actionEvent.getSource() == equal) {
            secendinput = Double.parseDouble(text.getText());
            if (opreation.equals("+")) {
                double result = firstinput + secendinput;
                text.setText(result + "");//convert double to string
            } else if (opreation.equals("-")) {
                double result = firstinput - secendinput;
                text.setText(result + "");//convert double to string
            } else if (opreation.equals("x")) {
                double result = firstinput * secendinput;
                text.setText(result + "");//convert double to string
            } else if (opreation.equals("/")) {
                double result = firstinput / secendinput;
                text.setText(result + "");//convert double to string
            } else if (opreation.equals("%")) {
                double result = firstinput % secendinput;
                text.setText(result + "");//convert double to string
            }
        }
    }
}

