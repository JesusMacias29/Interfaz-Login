package org.appjesus;

import javax.swing.*;
import java.awt.*;

public class LoginExtendido {

    private JPanel rootPanel;

    public LoginExtendido() {
        rootPanel = new JPanel(new BorderLayout(10,10));
        rootPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        rootPanel.setBackground(Color.BLACK);

        JLabel header = new JLabel("App Jesús Extendida", SwingConstants.CENTER);
        header.setFont(new Font("Segoe UI", Font.BOLD, 28));
        header.setForeground(Color.WHITE);
        rootPanel.add(header, BorderLayout.NORTH);

        JPanel formPanel = new JPanel(new GridBagLayout());
        formPanel.setOpaque(false);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(8,8,8,8);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        gbc.gridx = 0; gbc.gridy = 0;
        JLabel userLabel = new JLabel("Usuario:");
        userLabel.setForeground(Color.WHITE);
        formPanel.add(userLabel, gbc);

        gbc.gridx = 1;
        JTextField userField = new JTextField(15);
        formPanel.add(userField, gbc);

        gbc.gridx = 0; gbc.gridy = 1;
        JLabel passLabel = new JLabel("Contraseña:");
        passLabel.setForeground(Color.WHITE);
        formPanel.add(passLabel, gbc);

        gbc.gridx = 1;
        JPasswordField passField = new JPasswordField(15);
        formPanel.add(passField, gbc);

        gbc.gridx = 0; gbc.gridy = 2;
        JLabel sexLabel = new JLabel("Idioma:");
        sexLabel.setForeground(Color.WHITE);
        formPanel.add(sexLabel, gbc);

        gbc.gridx = 1;
        JComboBox<String> langCombo = new JComboBox<>(new String[]{"Español","Inglés"});
        formPanel.add(langCombo, gbc);

        gbc.gridx = 0; gbc.gridy = 3;
        JCheckBox terms = new JCheckBox("Aceptar términos");
        terms.setOpaque(false);
        terms.setForeground(Color.WHITE);
        formPanel.add(terms, gbc);

        gbc.gridx = 1;
        JRadioButton remember = new JRadioButton("Recordar usuario");
        remember.setOpaque(false);
        remember.setForeground(Color.WHITE);
        formPanel.add(remember, gbc);

        gbc.gridx = 0; gbc.gridy = 4;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        JButton loginBtn = new JButton("Acceder");
        loginBtn.setBackground(new Color(60,120,200));
        loginBtn.setForeground(Color.WHITE);
        formPanel.add(loginBtn, gbc);

        rootPanel.add(formPanel, BorderLayout.CENTER);
    }

    public JPanel getRootPanel() {
        return rootPanel;
    }
}
