/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.caiometa;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author leona
 */
public class listaeast extends JPanel {

    public listaeast() {
        
        GridLayout main = new GridLayout(5,5);
        setLayout(main);
        
        
        JLabel menu = new JLabel("menu:");
        add(menu);

        JButton cliente = new JButton("clientes");
        cliente.setBounds(100, 300, 100, 100);
        add(cliente);

        JButton orçamento = new JButton("orçamentos");
        orçamento.setBounds(100, 300, 100, 100);
        add(orçamento);

        JButton produto = new JButton("Produtos");
        produto.setBounds(100, 300, 100, 100);
        add(produto);

        JButton compras = new JButton("Compras");
        compras.setBounds(100, 300, 100, 100);
        add(compras);

    }
}
