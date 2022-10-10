/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.caiometa;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author leona
 */
public class CentroFM extends JPanel {

    public CentroFM() {

        GridLayout Fm = new GridLayout(12, 1);
        setLayout(Fm);
        
        JLabel Form = new JLabel("Cadastro:", SwingConstants.CENTER);
        JLabel name = new JLabel("Nome: ");
        JTextField Tname = new JTextField(20);
        JLabel sobre = new JLabel("Sobrenome: ");
        JTextField Tsobre = new JTextField(20);
        JLabel Cpf = new JLabel("CPF: ");
        JTextField TCpf = new JTextField(20);
        JLabel email = new JLabel("Email: ");
        JTextField Temail = new JTextField(20);
        JLabel Lsenha = new JLabel("Senha:");
        JPasswordField senha = new JPasswordField();
        JButton confirm = new JButton("Confirmar");


        add(Form);
        add(name);
        add(Tname);
        add(sobre);
        add(Tsobre);
        add(Cpf);
        add(TCpf);
        add(email);
        add(Temail);
        add(Lsenha);
        add(senha);
        add(confirm);
    }
}
