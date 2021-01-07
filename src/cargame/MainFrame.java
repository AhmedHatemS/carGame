/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cargame;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author devah
 */
public class MainFrame extends JFrame{
     Panel p = new Panel();
     
     public MainFrame(){
         this.setTitle("Car game");
         this.setLocation(500, 200);
         this.setSize(900, 500);
         this.setResizable(false);
         this.setVisible(true);
         this.setDefaultCloseOperation(EXIT_ON_CLOSE);
         p.setBackground(new Color(51, 153, 255));
         this.addKeyListener(p);
         this.add(p);
     }
    
}
