/*
 * Clase Celda
 */
package Lahormigacomehojas;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

/**
 *
 * @author Zygmut
 */
public class Cell {

    private Rectangle2D.Float rec;
    Piece piece;

    public Cell(Rectangle2D.Float r) {
        this.rec = r;
        this.piece = null;
    }

    public void paintcomponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        piece.paintComponent(g, this.rec.x, this.rec.y);
        g2d.setColor(Color.BLACK);
        g2d.draw(rec);
    }



    public void setPiece(Piece piece) {
        this.piece = piece;
        
    }

}
