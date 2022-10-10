/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.caiometa;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author GTI
 */
public class windows extends JFrame {

    public windows() {

        setTitle("Atividade 3 - Caio Leonardo");
        

        JPanel template = new JPanel();
        BorderLayout layout = new BorderLayout();

        template.setLayout(layout);
        template.add(new Topo(), BorderLayout.NORTH);
        template.add(new Rodape(), BorderLayout.SOUTH);
        template.add(new Direita(), BorderLayout.EAST);
        template.add(new Centro(), BorderLayout.CENTER);

        add(template);

    }

}
