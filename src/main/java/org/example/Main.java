
/*
    Author: Jordan Neff
    Purpose: This program helps a user map out their debits/credits and helps advise on
             how good a private or public company is for an investing or career move

    Line Count Goal = 4000+
    Current = 10

*/

package org.example;

import com.formdev.flatlaf.FlatLightLaf;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        FlatLightLaf.setup();

        JFrame frame = new JFrame("Financial Planner");
        frame.setSize(1200, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        CardLayout cardLayout = new CardLayout();
        JPanel cardPanel = new JPanel(cardLayout);

        LoginPage loginPage = new LoginPage(cardLayout, cardPanel);


        frame.add(cardPanel);
        frame.setVisible(true);

        cardLayout.show(cardPanel,"Login");

    }
}




















