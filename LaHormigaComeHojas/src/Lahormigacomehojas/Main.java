/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lahormigacomehojas;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Zygmut
 */
public class Main extends JFrame implements KeyListener {

    Board board;

    public Main() {
        board = new Board();
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);

    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Main frame = new Main();
                frame.setTitle("Juego de la hormiga come hojas");
                frame.setResizable(false);
                frame.setSize(frame.board.getPreferredSize());
                frame.setLocationRelativeTo(null);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.getContentPane().add(frame.board);
                frame.pack();
                frame.setVisible(true);
            }
        });
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int xpos = 0, ypos = 0;
        /**
         * Controlador del espacio
         */
        if (e.getKeyCode() == 32) { 
            /**
             * Algoritmo para conocer la posicion de la hormiga dentro de la
             * matriz
             */
            boolean found = false;
            for (int i = 0; i < Board.Dim && !found; i++) {
                for (int j = 0; j < Board.Dim && !found; j++) {
                    found = board.cBoard[i][j].piece.getId().contains("hormiga");
                    if (found) {
                        xpos = i;
                        ypos = j;
                    }
                }
            }
            /**
             *
             */
            String orientation = board.cBoard[xpos][ypos].piece.getId().split("_")[1];
            /**
             * Switch que controla el movimiento de la hormiga, dejando piezas
             * vacias donde estaba y moviendola dependiendo de su orientacion
             */
            switch (orientation) {
                case ("n"):
                    board.cBoard[xpos][ypos].setPiece(new Piece(Piece.nada));
                    xpos -= 1;
                    /**
                     * Control del teletransporte, se aplica a todos los otros
                     * casos teniendo en cuenta sus variaciones
                     */
                    if (xpos < 0) {
                        xpos = Board.Dim - 1;
                    }
                    board.cBoard[xpos][ypos].setPiece(new Piece(Piece.hormigaN));
                    break;
                case ("s"):
                    board.cBoard[xpos][ypos].setPiece(new Piece(Piece.nada));
                    xpos += 1;
                    if (xpos > Board.Dim - 1) {
                        xpos = 0;
                    }
                    board.cBoard[xpos][ypos].setPiece(new Piece(Piece.hormigaS));
                    break;
                case ("e"):
                    board.cBoard[xpos][ypos].setPiece(new Piece(Piece.nada));
                    ypos += 1;
                    if (ypos > Board.Dim - 1) {
                        ypos = 0;
                    }
                    board.cBoard[xpos][ypos].setPiece(new Piece(Piece.hormigaE));
                    break;
                case ("o"):
                    board.cBoard[xpos][ypos].setPiece(new Piece(Piece.nada));
                    ypos -= 1;
                    if (ypos < 0) {
                        ypos = Board.Dim - 1;
                    }
                    board.cBoard[xpos][ypos].setPiece(new Piece(Piece.hormigaO));
                    break;
            }
            board.repaint();

        } else {
            /**
             * Controlador de las flechas
             */
            if (e.getKeyCode() == 37 || e.getKeyCode() == 38 || e.getKeyCode() == 39 || e.getKeyCode() == 40) {
                /**
                 * Algoritmo de busqueda de la hormiga
                 */
                boolean found = false;
                for (int i = 0; i < Board.Dim && !found; i++) {
                    for (int j = 0; j < Board.Dim && !found; j++) {
                        found = board.cBoard[i][j].piece.getId().contains("hormiga");
                        if (found) {
                            xpos = i;
                            ypos = j;
                        }
                    }
                }
                /**
                 * Switch que permite cambiar la orientacion de la hormiga
                 */
                switch (e.getKeyCode()) {
                    case (39):
                        board.cBoard[xpos][ypos].setPiece(new Piece(Piece.hormigaE));
                        break;
                    case (38):
                        board.cBoard[xpos][ypos].setPiece(new Piece(Piece.hormigaN));
                        break;
                    case (37):
                        board.cBoard[xpos][ypos].setPiece(new Piece(Piece.hormigaO));
                        break;
                    case (40):
                        board.cBoard[xpos][ypos].setPiece(new Piece(Piece.hormigaS));
                        break;
                }
                board.repaint();
            }
            /**
             * Win condition
             */
            boolean found = false;
            for (int i = 0; i < Board.Dim && !found; i++) {
                for (int j = 0; j < Board.Dim && !found; j++) {
                    found = board.cBoard[i][j].piece.getId().contains("hoja");
                }
            }
            if (!found) {
                Toolkit.getDefaultToolkit().beep();
                JOptionPane.showMessageDialog(null, "ENHORABUENA" + "\n"
                        + "¡Has completado el juego!" + "\n"
                        + "La hormiga se ha comido todas las hojas",
                        "¡Has ganado!", JOptionPane.INFORMATION_MESSAGE);
                if (JOptionPane.INFORMATION_MESSAGE == 1) {
                    System.exit(0);
                }
            }
        }
    }

    @Override
    public void keyTyped(KeyEvent ke) {
    }

    @Override
    public void keyReleased(KeyEvent ke) {
    }
}
