/*
 * Administracion del tablero 
 */
package Lahormigacomehojas;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;

/**
 *
 * @author Zygmut
 */
public class Board extends JPanel {

    public static final Integer Dim = 20;
    public static final Integer Max = 800;
    public static final Integer Border = Max / Dim;
    Cell cBoard[][];

    public Board() {
        cBoard = new Cell[Dim][Dim];
        int y = 0;
        for (int i = 0; i < Dim; i++) {
            int x = 0;
            for (int j = 0; j < Dim; j++) {
                Rectangle2D.Float rec = new Rectangle2D.Float(x, y, Border, Border);
                cBoard[i][j] = new Cell(rec);
                cBoard[i][j].setPiece(new Piece(Piece.hoja));
                x += Border;
            }
            y += Border;
        }
        /**
         * Poner la hormiga en una posicion aleatoria del tablero
         */
        int hx = (int) (Math.random() * Dim);
        int hy = (int) (Math.random() * Dim);
        cBoard[hx][hy].setPiece(new Piece(Piece.hormigaN));

    }

    @Override
    public void paintComponent(Graphics g) {
        for (int i = 0; i < Dim; i++) {
            for (int j = 0; j < Dim; j++) {
                cBoard[i][j].paintcomponent(g);
            }
        }
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(Max, Max);
    }

}
