/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cargame;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author devah
 */
public class Panel extends JPanel implements ActionListener, KeyListener {

    int a, b = 20, c = 0;
    Timer t = new Timer(5, this);

    public Panel() {
        addKeyListener(this);
        this.setFocusable(true);
        setFocusTraversalKeysEnabled(true);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        t.start();
        //draw sun
        g.setColor(new Color(255, 153, 51));
        g.fillOval(10, 5, 50, 50);
        //draw road
        g.setColor(new Color(128, 126, 120));
        g.fillRect(0, 300, this.getWidth(), this.getHeight());
        //draw green area
        g.setColor(new Color(0, 153, 0));
        g.fillRect(0, 250, this.getWidth(), 50);
        //draw pavement
        for (int j = 0; j < this.getWidth(); j += 90) {
            g.setColor(Color.black);
            g.fill3DRect(j, 270, 90, 30, true);
            j += 90;
            g.setColor(Color.yellow);
            g.fill3DRect(j, 270, 90, 30, true);
        }
        //draw buildings
        for (a = 30; a < this.getWidth(); a += 120) {
            g.setColor(new Color(228, 228, 161));
            g.fill3DRect(a, 100, 100, 150, true);
            g.setColor(Color.white);
            g.fill3DRect(a + 10, 110, 30, 30, true);
            g.fill3DRect(a + 60, 110, 30, 30, true);
            g.fill3DRect(a + 10, 150, 30, 30, true);
            g.fill3DRect(a + 60, 150, 30, 30, true);
            g.fill3DRect(a + 30, 200, 40, 50, true);
        }

        //draw car
        g.setColor(Color.red);
        g.fill3DRect(b, 360, 200, 50, true);
        g.setColor(Color.black);
        g.fillOval(b + 10, 400, 50, 50);
        g.fillOval(b + 140, 400, 50, 50);
        g.setColor(Color.white);
        g.fillOval(b + 30, 420, 10, 10);
        g.fillOval(b + 160, 420, 10, 10);
        g.setColor(Color.MAGENTA);
        g.fill3DRect(b + 30, 320, 70, 40, true);
        g.fill3DRect(b + 100, 320, 70, 40, true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (b < 20 || b > this.getWidth() - 200) {
            b = 20;
        }
        repaint();
    }

    @Override
    public void keyTyped(KeyEvent e
    ) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e
    ) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_RIGHT:
                b += 5;
                break;
            case KeyEvent.VK_LEFT:
                b -= 5;
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e
    ) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
