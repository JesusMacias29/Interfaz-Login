package org.appjesus;

import javax.swing.*;
import java.awt.*;

public class LoginCreativo {

    private JPanel rootPanel;

    public LoginCreativo() {
        rootPanel = new JPanel(new BorderLayout(10,10));
        rootPanel.setBackground(Color.BLACK);
        rootPanel.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));

        JLabel title = new JLabel("App Jesús Creativa", SwingConstants.CENTER);
        title.setFont(new Font("Tahoma", Font.BOLD, 24));
        title.setForeground(Color.WHITE);
        rootPanel.add(title, BorderLayout.NORTH);

        JPanel formPanel = new JPanel(new GridBagLayout());
        formPanel.setOpaque(false);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        Font labelFont = new Font("Tahoma", Font.PLAIN, 14);

        gbc.gridx = 0; gbc.gridy = 0;
        JLabel userLabel = new JLabel("Usuario:");
        userLabel.setFont(labelFont);
        userLabel.setForeground(Color.WHITE);
        formPanel.add(userLabel, gbc);

        gbc.gridx = 1;
        JTextField userField = new JTextField(15);
        userField.setFont(labelFont);
        userField.setBackground(new Color(40,40,40));
        userField.setForeground(Color.WHITE);
        userField.setCaretColor(Color.WHITE);
        formPanel.add(userField, gbc);

        gbc.gridx = 0; gbc.gridy = 1;
        JLabel passLabel = new JLabel("Contraseña:");
        passLabel.setFont(labelFont);
        passLabel.setForeground(Color.WHITE);
        formPanel.add(passLabel, gbc);

        gbc.gridx = 1;
        JPasswordField passField = new JPasswordField(15);
        passField.setFont(labelFont);
        passField.setBackground(new Color(40,40,40));
        passField.setForeground(Color.WHITE);
        passField.setCaretColor(Color.WHITE);
        formPanel.add(passField, gbc);

        gbc.gridx = 0; gbc.gridy = 2;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        JButton loginBtn = new JButton("Ingresar");
        loginBtn.setFont(new Font("Tahoma", Font.BOLD, 14));
        loginBtn.setBackground(new Color(0,153,255));
        loginBtn.setForeground(Color.WHITE);
        loginBtn.setFocusPainted(false);
        formPanel.add(loginBtn, gbc);

        rootPanel.add(formPanel, BorderLayout.CENTER);

        JLabel registerLabel = new JLabel("¿No tienes cuenta? Regístrate aquí");
        registerLabel.setFont(new Font("Tahoma", Font.ITALIC, 12));
        registerLabel.setForeground(Color.LIGHT_GRAY);
        registerLabel.setHorizontalAlignment(SwingConstants.CENTER);
        rootPanel.add(registerLabel, BorderLayout.SOUTH);
    }

    public JPanel getRootPanel() {
        return rootPanel;
    }
}


