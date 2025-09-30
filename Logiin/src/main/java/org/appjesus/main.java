package org.appjesus;

import javax.swing.*;

public class main {

        public static void main(String[] args) {
            SwingUtilities.invokeLater(() -> {

                JFrame f1 = new JFrame("App Jesús Clásica");
                f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                f1.setContentPane(new LoginClásica().getRootPanel());
                f1.pack();
                f1.setLocation(100,100);
                f1.setVisible(true);

                JFrame f2 = new JFrame("App Jesús Extendida");
                f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                f2.setContentPane(new LoginExtendido().getRootPanel());
                f2.pack();
                f2.setLocation(450,100);
                f2.setVisible(true);

                JFrame f3 = new JFrame("App Jesús Creativa");
                f3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                f3.setContentPane(new LoginCreativo().getRootPanel());
                f3.pack();
                f3.setLocation(800,100);
                f3.setVisible(true);
            });
        }
    }



