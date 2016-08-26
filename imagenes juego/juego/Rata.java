/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rolandopalermo.blog.juego;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
import javax.swing.ImageIcon;

/**
 *
 * @author Rolando
 */
public class Rata {

    private int x;
    private int y;
    private boolean estaViva;

    public Rata() {
        this.estaViva = true;
        this.x = 0;
        this.y = 0;
    }

    public void actualizarPosicion(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean isEstaViva() {
        return estaViva;
    }

    public void setEstaViva(boolean estaViva) {
        this.estaViva = estaViva;
    }

    public void dibujar(Graphics g) {
        if (estaViva) {
            g.drawImage(new ImageIcon(getClass().getResource("/com/rolandopalermo/blog/imagenes/rat.png")).getImage(), x, y, null);
        }
    }

    boolean estaDentro(int xx, int yy) {
        Rectangle r = new Rectangle(x, y, 64, 64);
        return r.contains(new Point(xx, yy));
    }
}