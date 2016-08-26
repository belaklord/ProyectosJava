/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rolandopalermo.blog.juego;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Rolando
 */
public class Escenario extends JPanel implements MouseListener, MouseMotionListener {

    private List<Rata> ratas;
    private Image foot;
    private Image fondo;
    private int xfoot = 0;
    private int yfoot = 0;

    public Escenario(List<Rata> esferas) {
        this.ratas = esferas;
        foot = new ImageIcon(getClass().getResource("/com/rolandopalermo/blog/imagenes/foot.png")).getImage();
        fondo = new ImageIcon(getClass().getResource("/com/rolandopalermo/blog/imagenes/fondo.jpg")).getImage();
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    @Override
    public void paintComponent(Graphics g) {
        int w = this.getWidth();
        int h = this.getHeight();
        g.setColor(Color.WHITE);
        g.drawImage(fondo, 0, 0, null);
        if (ratas != null) {
            for (Rata esfera : ratas) {
                esfera.dibujar(g);
            }
        }
        g.drawImage(foot, xfoot, yfoot, null);
    }

    public void actualizarPosiciones() {
        for (Rata rata : ratas) {
            rata.actualizarPosicion(generarAleatorio(100, 400), generarAleatorio(100, 400));
        }
    }

    private int generarAleatorio(int a, int b) {
        return (int) Math.floor(Math.random() * (b - a + 1) + a);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        xfoot = e.getX() - 32;
        yfoot = e.getY() - 32;
        repaint();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        for (Rata rata : ratas) {
            if (rata.estaDentro(e.getX(), e.getY())) {
                rata.setEstaViva(false);
                repaint();
                break;
            }
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
}
