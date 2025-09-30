package org.appjesus;

import javax.swing.*;
import java.awt.*;

public class LoginClásica {

    private JPanel panel;

    public LoginClásica() {
        panel = new JPanel(new BorderLayout(10,10));
        panel.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
        panel.setBackground(Color.BLACK);

        JLabel logo = new JLabel("App Jesús Clásica", SwingConstants.CENTER);
        logo.setFont(new Font("Verdana", Font.BOLD, 22));
        logo.setForeground(Color.WHITE);
        panel.add(logo, BorderLayout.NORTH);

        JPanel formPanel = new JPanel(new GridBagLayout());
        formPanel.setOpaque(false);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(8,8,8,8);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        gbc.gridx = 0; gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.EAST;
        JLabel userLabel = new JLabel("Usuario:");
        userLabel.setForeground(Color.WHITE);
        formPanel.add(userLabel, gbc);

        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.WEST;
        JTextField userField = new JTextField(15);
        userField.setBackground(new Color(40,40,40));
        userField.setForeground(Color.WHITE);
        userField.setCaretColor(Color.WHITE);
        formPanel.add(userField, gbc);

        gbc.gridx = 0; gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.EAST;
        JLabel passLabel = new JLabel("Contraseña:");
        passLabel.setForeground(Color.WHITE);
        formPanel.add(passLabel, gbc);

        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.WEST;
        JPasswordField passField = new JPasswordField(15);
        passField.setBackground(new Color(40,40,40));
        passField.setForeground(Color.WHITE);
        passField.setCaretColor(Color.WHITE);
        formPanel.add(passField, gbc);

        gbc.gridx = 0; gbc.gridy = 2;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        JCheckBox terms = new JCheckBox("Aceptar términos y condiciones");
        terms.setOpaque(false);
        terms.setForeground(Color.WHITE);
        formPanel.add(terms, gbc);

        gbc.gridx = 0; gbc.gridy = 3;
        gbc.gridwidth = 2;
        JButton loginBtn = new JButton("Ingresar");
        loginBtn.setBackground(new Color(0,153,0));
        loginBtn.setForeground(Color.WHITE);
        loginBtn.setFocusPainted(false);
        formPanel.add(loginBtn, gbc);

        panel.add(formPanel, BorderLayout.CENTER);
    }

    public JPanel getRootPanel() {
        return panel;
    }
}
